package com.huawei.ism.openapi.nas.quota;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import com.huawei.ism.openapi.common.DefaultCommHandler;
import com.huawei.ism.openapi.common.commu.rest.RestManager;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.LOG_TYPE_E;
import com.huawei.ism.openapi.common.keydeifines.TLVNAS.QUOTA;
import com.huawei.ism.openapi.common.logmanager.LogUtil;
import com.huawei.ism.openapi.common.model.MOType;
import com.huawei.ism.openapi.common.utils.OpenApiUtils;
import com.huawei.ism.openapi.nas.quotatree.QuotaTreeMO;

/**
 * 配额实现类
 * @author fWX183786
 * @version V100R001C10
 */
public class QuotaHandlerImp extends DefaultCommHandler implements QuotaHandler
{
    private QuotaIterator quotaIterator;

    /**
     * 构造函数
     * @param restRequestHandler rest 请求处理类
     * @param deviceID 设备ID
     */
    protected QuotaHandlerImp(RestRequestHandler restRequestHandler, String deviceID)
    {
        super(restRequestHandler, deviceID);
    }

    /**
     * 创建Quota
     * @param mo Quota数据对象
     * @return Quota对象信息
     * @throws ApiException 异常
     */
    @Override
    public QuotaMO create(QuotaMO mo) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance().composeRelativeUri(getDeviceId(), "quota");

        JSONObject requestBody = null;
        if (null != mo)
        {
            Map<Object, Object> properties = mo.getMO().getProperties();
            requestBody = new JSONObject();
            LogUtil.getLogUtilInstance().showLog(LOG_TYPE_E.LOG_INFO, "the request params is " + properties.toString());
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        QuotaMO resPonsemo = restManager.getPostRequestMO();
        return resPonsemo;
    }

    /**
     * 修改Quota
     * @param mo Quota数据对象
     * @throws ApiException 异常
     */
    @Override
    public void modify(QuotaMO mo) throws ApiException
    {
        String relativePath = null;
        JSONObject requestBody = null;
        if (null != mo)
        {
            relativePath = OpenApiUtils.getOpenApiUtilsInstance()
                .composeRelativeUri(getDeviceId(), "quota", mo.getId());
            requestBody = null;
            Map<Object, Object> properties = mo.getMO().getProperties();
            requestBody = new JSONObject();
            OpenApiUtils.getOpenApiUtilsInstance().composeFromMap(requestBody, properties);
        }

        RestManager<QuotaTreeMO> restManager = new RestManager<QuotaTreeMO>(QuotaTreeMO.class, getRestRequestHandler(),
            relativePath, null, requestBody);
        restManager.getPutRequestMO();
    }

    /**
     * 删除Quota
     * @param quotaId Quota Id
     * @throws ApiException 异常
     */
    @Override
    public void delete(String quotaId) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "quota", quotaId);
        
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(QUOTA.TYPE, String.valueOf(MOType.QUOTA.getValue()));
        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        restManager.getDelRequestMO();
    }

    /**
     * 查询quota
     * @param quotaId quota id
     * @param isSearchReport 查询报告
     * @return quota 数据对象
     * @throws ApiException 异常
     */
    @Override
    public QuotaMO get(String quotaId, Boolean isSearchReport) throws ApiException
    {
        String relativePath = OpenApiUtils.getOpenApiUtilsInstance()
            .composeRelativeUri(getDeviceId(), "quota", quotaId);
        Map<String, String> headParamMap = new HashMap<String, String>();
        headParamMap.put(QUOTA.TYPE, String.valueOf(MOType.QUOTA.getValue()));
        headParamMap.put(QUOTA.ID, quotaId);
        headParamMap.put(QUOTA.ISSEARCHREPORT, isSearchReport.toString());

        RestManager<QuotaMO> restManager = new RestManager<QuotaMO>(QuotaMO.class, getRestRequestHandler(),
            relativePath, headParamMap, null);
        QuotaMO resPonsemo = restManager.getGetRequestMO();
        return resPonsemo;
    }

    /**
     * 获取批量查询迭代器
     * @param condition 批量查询条件
     * @return 批量查询迭代器
     */
    @Override
    public QuotaIterator getBatch(QuotaQuery condition)
    {
        if (null == quotaIterator)
        {
            quotaIterator = new QuotaIterator(getRestRequestHandler(), getDeviceId(), condition);
        }
        return quotaIterator;
    }

}
