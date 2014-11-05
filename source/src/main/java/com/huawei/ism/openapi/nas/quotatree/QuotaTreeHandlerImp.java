package com.huawei.ism.openapi.nas.quotatree;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.QUOTATREE;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;

/**
 * 配额树的实现类
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaTreeHandlerImp extends DefaultCommHandler implements QuotaTreeHandler
{
    private QuotaTreeIterator qTreeIterator = null;

    /**
     * 构造函数
     * @param restRequestHandler rest请求处理类
     * @param deviceID 设备ID
     */
    protected QuotaTreeHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * qTree 创建
     * @param mo qTree数据对象
     * @return 创建qTree返回数据的数据对象
     * @throws ApiExcepti on 异常
     */
    @Override
    public QuotaTreeMO create(QuotaTreeMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree");
        JSONObject requestBody = null;
        if (null != mo)
        {
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        QuotaTreeMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 修改qTree
     * @param mo qTree数据对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(QuotaTreeMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        if (null != mo)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree",
                mo.getId());
            requestBody = new JSONObject();
            Map<Object, Object> properties = mo.getMO().getProperties();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }
        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * qTree查询
     * @param quotaTreeId qTreeId
     * @return qTree数据对象
     * @throws ApiException 异常
     */
    @Override
    public QuotaTreeMO get(String quotaTreeId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree",
            quotaTreeId);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(QUOTATREE.TYPE, String.valueOf(MOType.QUOTATREE.getValue()));
        headParamMap.put(QUOTATREE.ID, quotaTreeId);

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        QuotaTreeMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 
     * 删除qTree
     * @param quotaTreeId qTreeId
     * @throws ApiException 异常
     */
    @Override
    public void delete(String quotaTreeId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quotatree",
            quotaTreeId);

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, null, null);
        restManager.getDelRequestMO();
    }

    /**
     * 获取qTree批量查询迭代器
     * @param condition 批量查询条件
     * @return qTree批量查询迭代器
     */
    @Override
    public QuotaTreeIterator getBatch(QuotaTreeQuery condition)
    {
        if (null == qTreeIterator)
        {
            qTreeIterator = new QuotaTreeIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return qTreeIterator;
    }
}
