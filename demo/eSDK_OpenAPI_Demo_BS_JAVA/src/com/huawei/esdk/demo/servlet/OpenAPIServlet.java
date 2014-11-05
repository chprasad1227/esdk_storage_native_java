package com.huawei.esdk.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.huawei.ism.openapi.alarm.AlarmHandler;
import com.huawei.ism.openapi.alarm.AlarmInfoMO;
import com.huawei.ism.openapi.alarm.AlarmIterator;
import com.huawei.ism.openapi.alarm.AlarmQuery;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.keydeifines.ConstantsDefine.HandlerConstant;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.OSTypeE;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine.RaidLevelE;
import com.huawei.ism.openapi.diskpool.DiskPoolHandler;
import com.huawei.ism.openapi.diskpool.DiskPoolIterator;
import com.huawei.ism.openapi.diskpool.DiskPoolMO;
import com.huawei.ism.openapi.diskpool.DiskPoolQuery;
import com.huawei.ism.openapi.ethport.ETHPortHandler;
import com.huawei.ism.openapi.ethport.ETHPortIterator;
import com.huawei.ism.openapi.ethport.ETHPortMO;
import com.huawei.ism.openapi.ethport.ETHPortQuery;
import com.huawei.ism.openapi.fcinitiator.FcInitiatorHandler;
import com.huawei.ism.openapi.fcinitiator.FcInitiatorIterator;
import com.huawei.ism.openapi.fcinitiator.FcInitiatorMO;
import com.huawei.ism.openapi.fcinitiator.FcInitiatorQuery;
import com.huawei.ism.openapi.fcport.FCPortHandler;
import com.huawei.ism.openapi.fcport.FCPortIterator;
import com.huawei.ism.openapi.fcport.FCPortMO;
import com.huawei.ism.openapi.fcport.FCPortQuery;
import com.huawei.ism.openapi.host.HostHandler;
import com.huawei.ism.openapi.host.HostIterator;
import com.huawei.ism.openapi.host.HostMO;
import com.huawei.ism.openapi.host.HostQuery;
import com.huawei.ism.openapi.hostgroup.HostGroupHandler;
import com.huawei.ism.openapi.hostgroup.HostGroupIterator;
import com.huawei.ism.openapi.hostgroup.HostGroupMO;
import com.huawei.ism.openapi.hostgroup.HostGroupQuery;
import com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorHandler;
import com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorIterator;
import com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorMO;
import com.huawei.ism.openapi.iscsiinitiator.ISCSIInitiatorQuery;
import com.huawei.ism.openapi.lun.LunHandler;
import com.huawei.ism.openapi.lun.LunIterator;
import com.huawei.ism.openapi.lun.LunMO;
import com.huawei.ism.openapi.lun.LunQuery;
import com.huawei.ism.openapi.lungroup.LunGroupHandler;
import com.huawei.ism.openapi.lungroup.LunGroupIterator;
import com.huawei.ism.openapi.lungroup.LunGroupMO;
import com.huawei.ism.openapi.lungroup.LunGroupQuery;
import com.huawei.ism.openapi.manager.DeviceManager;
import com.huawei.ism.openapi.mappingview.MappingViewHandler;
import com.huawei.ism.openapi.portgroup.PortGroupHandler;
import com.huawei.ism.openapi.portgroup.PortGroupIterator;
import com.huawei.ism.openapi.portgroup.PortGroupMO;
import com.huawei.ism.openapi.portgroup.PortGroupQuery;
import com.huawei.ism.openapi.storagepool.StoragePoolHandler;
import com.huawei.ism.openapi.storagepool.StoragePoolIterator;
import com.huawei.ism.openapi.storagepool.StoragePoolMO;
import com.huawei.ism.openapi.storagepool.StoragePoolQuery;
import com.huawei.ism.openapi.sysinfo.SysInfoHandler;
import com.huawei.ism.openapi.sysinfo.SystemMO;

/**
 * 告警模块处理类 查询告警事件信息、告警订阅接口
 * 
 * @author xxxxxx
 * @see [无]
 * @since [eSDK IVS V100R003C00]
 */
public class OpenAPIServlet extends HttpServlet
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = 6749720431926648350L;

    /**
     * gson，用于转换String和json之间的转换
     */
    private Gson gson = new Gson();

    private DeviceManager manager;

    private List<String> alarms = new ArrayList<String>();

    private int alarmIndex = 0;

    private Map<String, String> alarmMap = new HashMap<String, String>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
        IOException
    {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // 获取需要调用的方法名
        String methodName = request.getParameter("method");
        String resp = "";

        if ("login".equals(methodName))
        {
            resp = login(request);
        }
        else if ("createDiskPool".equals(methodName))
        {
            resp = createDiskPool(request);
        }
        else if ("createStoragePool".equals(methodName))
        {
            resp = createStoragePool(request);
        }
        else if ("createLUN".equals(methodName))
        {
            resp = createLUN(request);
        }
        else if ("createLUNGroup".equals(methodName))
        {
            resp = createLUNGroup(request);
        }
        else if ("getCount".equals(methodName))
        {
            resp = getCount(request);
        }
        else if ("getBatchDiskPool".equals(methodName))
        {
            resp = getBatchDiskPool();
        }
        else if ("getBatchStoragePool".equals(methodName))
        {
            resp = getBatchStoragePool();
        }
        else if ("getBatchLUN".equals(methodName))
        {
            resp = getBatchLUN();
        }
        else if ("getBatchInitiator".equals(methodName))
        {
            resp = getBatchInitiator(request);
        }
        else if ("createHost".equals(methodName))
        {
            resp = createHost(request);
        }
        else if ("createHostGroup".equals(methodName))
        {
            resp = createHostGroup(request);
        }
        else if ("getBatchHost".equals(methodName))
        {
            resp = getBatchHost();
        }
        else if ("getBatchPort".equals(methodName))
        {
            resp = getBatchPort(request);
        }
        else if ("createPortGroup".equals(methodName))
        {
            resp = createPortGroup(request);
        }
        else if ("getBatchHostGroup".equals(methodName))
        {
            resp = getBatchHostGroup();
        }
        else if ("getBatchLUNGroup".equals(methodName))
        {
            resp = getBatchLUNGroup();
        }
        else if ("getBatchPortGroup".equals(methodName))
        {
            resp = getBatchPortGroup();
        }
        else if ("createMappingView".equals(methodName))
        {
            resp = createMappingView(request);
        }
        else if ("getSystemInfo".equals(methodName))
        {
            resp = getSystemInfo();
        }
        else if ("getAlarmInfo".equals(methodName))
        {
            resp = getAlarmInfo();
        }
        else if ("getNextAlarmInfo".equals(methodName))
        {
            resp = getNextAlarmInfo();
        }
        else if ("getLastAlarmInfo".equals(methodName))
        {
            resp = getLastAlarmInfo();
        }

        // 输出流
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print(resp);
        pw.close();
    }

    private String getNextAlarmInfo()
    {
        int index = alarmIndex + 5;
        alarmMap.clear();
        if (index < alarms.size())
        {
            for (int i = index; i < index + 5; i++)
            {
                if (i >= alarms.size())
                {
                    break;
                }
                alarmMap.put(String.valueOf(i), alarms.get(i));
            }
            alarmIndex = index;
            return gson.toJson(alarmMap);
        }
        return null;
    }

    private String getLastAlarmInfo()
    {
        int index = alarmIndex - 5;
        alarmMap.clear();
        if (index >= 0)
        {
            for (int i = index; i < index + 5; i++)
            {
                alarmMap.put(String.valueOf(i), alarms.get(i));
            }
            alarmIndex = index;
            return gson.toJson(alarmMap);
        }
        return null;
    }

    private String getAlarmInfo()
    {
        // 清空告警缓存列表以及初始索引值
        alarms.clear();
        alarmIndex = 0;
        alarmMap.clear();
        // 设置日期显示格式
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT"));

        // 获取告警接口实现类和查询条件对象
        AlarmHandler alarmHandler = null;
        AlarmQuery alarmQuery = null;

        try
        {
            alarmHandler = (AlarmHandler) manager.getHandler(HandlerConstant.ALARM_HANDLER);
            // 创建一个告警查询的条件
            alarmQuery = new AlarmQuery(null, 0, 5);
            // 批量查询阵列当前告警获取迭代器
            AlarmIterator alarmIterator = alarmHandler.getActiveAlarmBatch(alarmQuery);
            alarmIterator.updateQuery(alarmQuery);
            List<AlarmInfoMO> mos = new ArrayList<AlarmInfoMO>();
            while (alarmIterator.hasNext())
            {
                // 在迭代器中获取阵列当前告警列表
                mos = alarmIterator.getBatchNext();
                Map<String, String> map = new HashMap<String, String>();
                for (AlarmInfoMO mo : mos)
                {

                    map.put(mo.getSequence().toString(),
                        format.format(new Date(Long.valueOf(mo.getStartTime()) * 1000)) + "=" + mo.getDescription());
                }
                for (AlarmInfoMO mo : mos)
                {
                    alarms.add(format.format(new Date(Long.valueOf(mo.getStartTime()) * 1000)) + "="
                        + mo.getDescription());
                }
            }
            // 批量查询SVP当前告警获取迭代器
            AlarmIterator svpalarmIterator = alarmHandler.getSVPActiveAlarmBatch(alarmQuery);
            svpalarmIterator.updateQuery(alarmQuery);
            List<AlarmInfoMO> svpmos = new ArrayList<AlarmInfoMO>();
            while (svpalarmIterator.hasNext())
            {
                // 在迭代器中获取SVP当前告警列表
                svpmos = svpalarmIterator.getBatchNext();
                Map<String, String> map = new HashMap<String, String>();
                for (AlarmInfoMO mo : svpmos)
                {
                    map.put(mo.getSequence().toString(),
                        format.format(new Date(Long.valueOf(mo.getStartTime()) * 1000)) + "=" + mo.getDescription());
                }
                for (AlarmInfoMO mo : svpmos)
                {
                    alarms.add(format.format(new Date(Long.valueOf(mo.getStartTime()) * 1000)) + "="
                        + mo.getDescription());
                }
            }
        }
        catch (ApiException e)
        {
            gson.toJson("ApiException:" + e.getMessage());
        }
        for (int i = alarmIndex; i < alarmIndex + 5; i++)
        {
            alarmMap.put(String.valueOf(i), alarms.get(i));
        }
        return gson.toJson(alarmMap);
    }

    private String getSystemInfo()
    {
        // 设置时间显示格式
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 获取系统信息的接口实现类
        SysInfoHandler sysInfoHandler;
        SystemMO systemMO;
        Map<String, String> infos = new HashMap<String, String>();

        try
        {
            sysInfoHandler = (SysInfoHandler) manager.getHandler(HandlerConstant.SYSINFO_HANDLER);
            // 调用系统信息查询接口，获取系统信息
            systemMO = sysInfoHandler.systemGet();
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }
        // 获取系统信息属性
        if (null != systemMO.getHealthStatus())
        {
            String health = systemMO.getHealthStatus().toString();
            infos.put("deviceHealth", health.substring(health.indexOf(".") + 1));
        }
        if (null != systemMO.getRunningStatus())
        {
            String running = systemMO.getRunningStatus().toString();
            infos.put("deviceRunning", running.substring(running.indexOf(".") + 1));
        }
        if (null != systemMO.getProductMode())
        {
            String mode = systemMO.getProductMode().toString();
            infos.put("deviceMode", mode.substring(mode.indexOf(".") + 1));
        }
        if (null != systemMO.getSystemStatus())
        {
            String status = systemMO.getSystemStatus().toString();
            infos.put("deviceStatus", status.substring(status.indexOf(".") + 1));
        }
        infos.put("deviceId", systemMO.getId());
        infos.put("deviceName", systemMO.getName());
        infos.put("deviceLocation", systemMO.getLocation());
        infos.put("deviceDescription", systemMO.getDescription());
        infos.put("deviceVersion", systemMO.getProductVersion());
        infos.put("devicewwn", systemMO.getWWN());
        infos.put("deviceTime", format.format(new Date(Long.valueOf(systemMO.getCmoSysUtcTime()) * 1000)));
        return new Gson().toJson(infos);
    }

    private String createMappingView(HttpServletRequest request)
    {
        // 传入请求参数
        String hostgroup = request.getParameter("hostgroup");
        String lungroup = request.getParameter("lungroup");
        String portgroup = request.getParameter("portgroup");
        try
        {
            MappingViewHandler handler = (MappingViewHandler) manager.getHandler(HandlerConstant.MAPPINGVIEW_HANDLER);
            if ("".equals(portgroup))
            {
                // 创建不包含端口组的映射视图
                handler.createMap(lungroup, hostgroup);
            }
            else
            {
                // 创建包含端口组的映射视图
                handler.createMap(lungroup, portgroup, hostgroup);
            }
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }
        return new Gson().toJson("success");
    }

    private String getBatchPortGroup()
    {
        try
        {
            PortGroupHandler handler = (PortGroupHandler) manager.getHandler(HandlerConstant.PORTGROUP_HANDLER);
            PortGroupQuery query = new PortGroupQuery(null, 0, handler.getCount());
            PortGroupIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<PortGroupMO> mos = null;
            while (iterator.hasNext())
            {
                mos = iterator.getBatchNext();
            }
            Map<String, String> map = new HashMap<String, String>();
            for (PortGroupMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String getBatchLUNGroup()
    {
        try
        {
            LunGroupMO lunGroupMO = new LunGroupMO();
            lunGroupMO.setIsAddToMapingView(false);
            LunGroupHandler handler = (LunGroupHandler) manager.getHandler(HandlerConstant.LUNGROUP_HANDLER);
            LunGroupQuery query = new LunGroupQuery(lunGroupMO, 0, handler.getCount());
            LunGroupIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<LunGroupMO> mos = null;
            while (iterator.hasNext())
            {
                mos = iterator.getBatchNext();
            }
            Map<String, String> map = new HashMap<String, String>();
            for (LunGroupMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String getBatchHostGroup()
    {
        try
        {
            HostGroupHandler handler = (HostGroupHandler) manager.getHandler(HandlerConstant.HOSTGROUP_HANDLER);
            HostGroupQuery query = new HostGroupQuery(null, 0, handler.getCount());
            HostGroupIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<HostGroupMO> mos = null;
            while (iterator.hasNext())
            {
                mos = iterator.getBatchNext();
            }
            Map<String, String> map = new HashMap<String, String>();
            for (HostGroupMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String createPortGroup(HttpServletRequest request)
    {
        // 传入请求参数
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String associateId = request.getParameter("associateId");
        // 创建端口组对象
        PortGroupMO mo = new PortGroupMO();
        // 填写端口组名称,描述
        mo.setName(name);
        if (!"".equals(description))
        {
            mo.setDescription(description);
        }
        // 获取端口组接口实现类
        PortGroupHandler portGroupHandler;
        try
        {
            portGroupHandler = (PortGroupHandler) manager.getHandler(HandlerConstant.PORTGROUP_HANDLER);
            // 调用端口组的create方法，创建端口组
            PortGroupMO result = portGroupHandler.create(mo);
            if (!"".equals(associateId))
            {
                // 在创建出的端口组中添加端口
                portGroupHandler.createAssociateWithPort(result.getId(), associateId);
            }
        }
        catch (ApiException e)
        {
            return gson.toJson(e.getMessage());
        }

        return gson.toJson("success");
    }

    private String getBatchPort(HttpServletRequest request)
    {
        String portType = request.getParameter("portType");
        Map<String, String> map = new HashMap<String, String>();
        map.clear();
        try
        {
            if ("fc".equals(portType))
            {
                FCPortHandler fcPortHandler = (FCPortHandler) manager.getHandler(HandlerConstant.FCPORT_HANDLER);
                FCPortQuery fcPortQuery = new FCPortQuery(null, 0, 10);
                FCPortIterator fcPortIterator = fcPortHandler.getBatch(fcPortQuery);
                fcPortIterator.updateQuery(fcPortQuery);
                List<FCPortMO> fcPortMOs = null;
                while (fcPortIterator.hasNext())
                {
                    fcPortMOs = fcPortIterator.getBatchNext();
                    for (FCPortMO mo : fcPortMOs)
                    {
                        map.put(mo.getId(), mo.getLocation());
                    }
                }
            }
            else
            {
                ETHPortHandler ethPortHandler = (ETHPortHandler) manager.getHandler(HandlerConstant.ETH_PORT);
                ETHPortQuery ethPortQuery = new ETHPortQuery(null, 0, 10);
                ETHPortIterator ethPortIterator = ethPortHandler.getBatch(ethPortQuery);
                ethPortIterator.updateQuery(ethPortQuery);
                List<ETHPortMO> iscsiInitiatorMOs = null;
                while (ethPortIterator.hasNext())
                {
                    iscsiInitiatorMOs = ethPortIterator.getBatchNext();
                    for (ETHPortMO mo : iscsiInitiatorMOs)
                    {
                        map.put(mo.getId(), mo.getLocation());
                    }
                }
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String getBatchHost()
    {
        try
        {
            HostHandler handler = (HostHandler) manager.getHandler(HandlerConstant.HOST_HANDLER);
            HostQuery query = new HostQuery(null, 0, handler.getCount());
            HostIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<HostMO> mos = iterator.getBatchNext();
            Map<String, String> map = new HashMap<String, String>();
            for (HostMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
            return gson.toJson("ApiException:" + e.getMessage());
        }
    }

    private String createHostGroup(HttpServletRequest request)
    {
        // 传入请求参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String assciateId = request.getParameter("associateId");
        // 创建一个主机组的对象
        HostGroupMO mo = new HostGroupMO();
        // 填写ID、名称、描述
        if (!"".equals(id))
        {
            mo.setId(id);
        }
        mo.setName(name);
        if (!"".equals(description))
        {
            mo.setDescription(description);
        }
        try
        {
            HostGroupHandler hostGroupHandler = (HostGroupHandler) manager
                .getHandler(HandlerConstant.HOSTGROUP_HANDLER);
            // 调用主机组create方法，创建主机组
            HostGroupMO result = hostGroupHandler.create(mo);
            if (!"".equals(assciateId))
            {
                // 在主机组中添加主机
                hostGroupHandler.createAssociateWithHost(result.getId(), assciateId);
            }
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }
        return new Gson().toJson("success");
    }

    private String createHost(HttpServletRequest request)
    {
        // 传入请求参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String location = request.getParameter("location");
        int operationSystem = Integer.parseInt(request.getParameter("operationSystem"));
        String ip = request.getParameter("ip");
        String initiator = request.getParameter("initiator");
        String initiatorType = request.getParameter("initiatorType");
        // 创建Host对象
        HostMO mo = new HostMO();
        // 给Host的ID，描述，名称，位置，操作系统类型赋值.
        if (!"".equals(id))
        {
            mo.setId(id);
        }
        if (!"".equals(description))
        {
            mo.setDescription(description);
        }
        mo.setName(name);
        mo.setIP(ip);
        mo.setLocation(location);
        mo.setOperationSystem(OSTypeE.valueOf(operationSystem));

        // 获取Host的接口实现类
        HostHandler hostHandler;
        HostMO mTestMo;
        try
        {
            hostHandler = (HostHandler) manager.getHandler(HandlerConstant.HOST_HANDLER);
            // 调用Host中的create方法创建主机
            mTestMo = hostHandler.create(mo);
            if (!"null".equals(initiator))
            {
                if ("fc".equals(initiatorType))
                {
                    FcInitiatorHandler fcInitiatorHandler = (FcInitiatorHandler) manager
                        .getHandler(HandlerConstant.FCINITIATOR_HANDLER);
                    // 给主机添加FC启动器
                    fcInitiatorHandler.createFcToHost(initiator, mTestMo.getId());
                }
                else
                {
                    ISCSIInitiatorHandler iscsiInitiatorHandler = (ISCSIInitiatorHandler) manager
                        .getHandler(HandlerConstant.ISCSIINITIATOR_HANDLER);
                    // 给主机添加ISCSI启动器
                    iscsiInitiatorHandler.createIscsiToHost(initiator, mTestMo.getId());
                }
            }
        }
        catch (ApiException e)
        {
            return gson.toJson(e.getMessage());
        }

        return gson.toJson("success");
    }

    private String getBatchInitiator(HttpServletRequest request)
    {
        String initiatorType = request.getParameter("initiatorType");
        List<String> ids = new ArrayList<String>();
        try
        {
            if ("fc".equals(initiatorType))
            {
                FcInitiatorHandler fcInitiatorHandler = (FcInitiatorHandler) manager
                    .getHandler(HandlerConstant.FCINITIATOR_HANDLER);
                FcInitiatorMO fcInitiatorMO = new FcInitiatorMO();
                fcInitiatorMO.setIsFree(true);
                FcInitiatorQuery fcInitiatorQuery = new FcInitiatorQuery(fcInitiatorMO, 0, 10);
                FcInitiatorIterator fcInitiatorIterator = fcInitiatorHandler.getBatch(fcInitiatorQuery);
                fcInitiatorIterator.updateQuery(fcInitiatorQuery);
                List<FcInitiatorMO> fcInitiatorMOs = null;
                ids.clear();
                while (fcInitiatorIterator.hasNext())
                {
                    fcInitiatorMOs = fcInitiatorIterator.getBatchNext();
                    for (FcInitiatorMO mo : fcInitiatorMOs)
                    {
                        ids.add(mo.getId());
                    }
                }
            }
            else
            {
                ISCSIInitiatorHandler iscsiInitiatorHandler = (ISCSIInitiatorHandler) manager
                    .getHandler(HandlerConstant.ISCSIINITIATOR_HANDLER);
                ISCSIInitiatorMO iscsiInitiatorMO = new ISCSIInitiatorMO();
                iscsiInitiatorMO.setIsFree(true);
                ISCSIInitiatorQuery iscsiInitiatorQuery = new ISCSIInitiatorQuery(iscsiInitiatorMO, 0, 10);
                ISCSIInitiatorIterator iscsiInitiatorIterator = iscsiInitiatorHandler.getBatch(iscsiInitiatorQuery);
                iscsiInitiatorIterator.updateQuery(iscsiInitiatorQuery);
                List<ISCSIInitiatorMO> iscsiInitiatorMOs = null;
                ids.clear();
                while (iscsiInitiatorIterator.hasNext())
                {
                    iscsiInitiatorMOs = iscsiInitiatorIterator.getBatchNext();
                    for (ISCSIInitiatorMO mo : iscsiInitiatorMOs)
                    {
                        ids.add(mo.getId());
                    }
                }
            }
            return gson.toJson(ids);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String getBatchLUN()
    {
        try
        {
            LunHandler handler = (LunHandler) manager.getHandler(HandlerConstant.LUN_HANDLER);
            LunMO lunMO = new LunMO();
            lunMO.setIsAddToLunGroup(false);
            LunQuery query = new LunQuery(lunMO, 0, handler.getCount());
            LunIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<LunMO> mos = iterator.getBatchNext();
            Map<String, String> map = new HashMap<String, String>();
            for (LunMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private String getBatchStoragePool()
    {
        try
        {
            StoragePoolHandler handler = (StoragePoolHandler) manager.getHandler(HandlerConstant.STORAGEPOOL_HANDLER);
            StoragePoolQuery query = new StoragePoolQuery(null, 0, handler.getCount());
            StoragePoolIterator iterator = handler.getBatch(query);
            iterator.updateQuery(query);
            List<StoragePoolMO> mos = iterator.getBatchNext();
            Map<String, String> map = new HashMap<String, String>();
            for (StoragePoolMO mo : mos)
            {
                map.put(mo.getId(), mo.getName());
            }
            return gson.toJson(map);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    private String getBatchDiskPool()
    {
        try
        {
            DiskPoolHandler handler = (DiskPoolHandler) manager.getHandler(HandlerConstant.DISKPOOL_HANDLER);
            DiskPoolQuery diskPoolQuery = new DiskPoolQuery(null, 0, handler.getCount());
            DiskPoolIterator iterator = handler.getBatch(diskPoolQuery);
            iterator.updateQuery(diskPoolQuery);
            List<DiskPoolMO> mos = iterator.getBatchNext();
            Map<String, String> results = new HashMap<String, String>();
            for (DiskPoolMO mo : mos)
            {
                results.put(mo.getId(), mo.getName());
            }
            return gson.toJson(results);
        }
        catch (ApiException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    private String getCount(HttpServletRequest request)
    {
        String type = request.getParameter("type");
        try
        {
            if ("storagePoolCount".equals(type))
            {
                StoragePoolHandler handler = (StoragePoolHandler) manager
                    .getHandler(HandlerConstant.STORAGEPOOL_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("diskPoolCount".equals(type))
            {
                DiskPoolHandler handler = (DiskPoolHandler) manager.getHandler(HandlerConstant.DISKPOOL_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("lunCount".equals(type))
            {
                LunHandler handler = (LunHandler) manager.getHandler(HandlerConstant.LUN_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("hostCount".equals(type))
            {
                HostHandler handler = (HostHandler) manager.getHandler(HandlerConstant.HOST_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("lunGroupCount".equals(type))
            {
                LunGroupHandler handler = (LunGroupHandler) manager.getHandler(HandlerConstant.LUNGROUP_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("hostGroupCount".equals(type))
            {
                HostGroupHandler handler = (HostGroupHandler) manager.getHandler(HandlerConstant.HOSTGROUP_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else if ("mappingViewCount".equals(type))
            {
                MappingViewHandler handler = (MappingViewHandler) manager
                    .getHandler(HandlerConstant.MAPPINGVIEW_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }
            else
            {
                PortGroupHandler handler = (PortGroupHandler) manager.getHandler(HandlerConstant.PORTGROUP_HANDLER);
                return new Gson().toJson(String.valueOf(handler.getCount()));
            }

        }
        catch (ApiException e)
        {
            return new Gson().toJson("faild");
        }
    }

    private String createLUNGroup(HttpServletRequest request)
    {
        // 传入请求参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String assciateId = request.getParameter("associateId");
        // 创建一个LUN组的对象
        LunGroupMO mo = new LunGroupMO();
        // 填写ID、名称、描述
        if (!"".equals(id))
        {
            mo.setId(id);
        }
        mo.setName(name);
        if (!"".equals(description))
        {
            mo.setDescription(description);
        }
        try
        {
            // 获取LUN组的接口实现类
            LunGroupHandler lunGroupHandler = (LunGroupHandler) manager.getHandler(HandlerConstant.LUNGROUP_HANDLER);
            // 调用LUN组中的create方法，创建LUN组
            LunGroupMO result = lunGroupHandler.create(mo);
            if (!"".equals(assciateId))
            {
                // 在创建出的LUN组中添加LUN
                lunGroupHandler.createAssociateWithLun(result.getId(), assciateId);
            }
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }
        return new Gson().toJson("success");
    }

    private String createLUN(HttpServletRequest request)
    {
        // 传入请求参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String parentId = request.getParameter("parentId");
        long capacity = Long.parseLong(request.getParameter("capacity"));

        // 创建LUN对象
        LunMO lunMO = new LunMO();
        // 填写LUN的名称、描述、存储池ID、容量
        lunMO.setName(name);
        if (!"".equals(description))
        {
            lunMO.setDescription(description);
        }
        if (!"".equals(id))
        {
            lunMO.setParentId("0");
        }
        lunMO.setParentId(parentId);
        lunMO.setCapacity((long) 1024 * 1024 * 1024 * capacity);
        // 获取LUN的接口实现类
        LunHandler lunHandler;
        try
        {
            lunHandler = (LunHandler) manager.getHandler(HandlerConstant.LUN_HANDLER);
            // 调用LUN的create方法，在ID为0的存储池中创建一个名称为LUN000，描述信息为LUN_000,容量为2G的LUN
            lunHandler.create(lunMO);
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }

        return new Gson().toJson("success");
    }

    private String createDiskPool(HttpServletRequest request)
    {
        // 传入请求参数
        int diskNumber = Integer.parseInt(request.getParameter("diskNumber"));
        String id = request.getParameter("id");
        DiskPoolMO mo = new DiskPoolMO();
        // 填写硬盘域的名称，SAS硬盘数（-1为选中余下所有硬盘）
        mo.setName("openapitest");
        if (!"".equals(id))
        {
            mo.setId(id);
        }
        mo.setSASdiskNum(diskNumber);
        // 获取硬盘域的接口实现类
        DiskPoolHandler diskPoolHandler;
        try
        {
            diskPoolHandler = (DiskPoolHandler) manager.getHandler(HandlerConstant.DISKPOOL_HANDLER);
            // 调用硬盘域中的create方法创建硬盘域
            diskPoolHandler.create(mo);
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }

        return new Gson().toJson("success");
    }

    private String createStoragePool(HttpServletRequest request)
    {
        // 传入请求参数
        String storagepoolName = request.getParameter("storagepoolName");
        String parentId = request.getParameter("parentId");
        String id = request.getParameter("id");
        long userConsumedCapacityThreshold = Long.parseLong(request.getParameter("userConsumedCapacityThreshold"));
        String tier = request.getParameter("tier");
        int capacity = Integer.parseInt(request.getParameter("capacity"));
        // 创建存储池对象，设置id、parentId、userConsumedCapacityThreshold、名称等属性
        StoragePoolMO storagePoolMO = new StoragePoolMO();
        if (!"".equals(id))
        {
            storagePoolMO.setId(id);
        }
        storagePoolMO.setParentId(parentId);
        storagePoolMO.setUserConsumedCapacityThreshold(userConsumedCapacityThreshold);
        storagePoolMO.setName(storagepoolName);
        if ("tier0".equals(tier))
        {
            storagePoolMO.setTier0Capacity(capacity * 1024 * 1024 * 1024L);
            storagePoolMO.setTier0RaidLv(RaidLevelE.RAID_LEVEL_RAID5);
        }
        else if ("tier1".equals(tier))
        {
            storagePoolMO.setTier1Capacity(capacity * 1024 * 1024 * 1024L);
            storagePoolMO.setTier1RaidLv(RaidLevelE.RAID_LEVEL_RAID5);
        }
        else
        {
            storagePoolMO.setTier2Capacity(capacity * 1024 * 1024 * 1024L);
            storagePoolMO.setTier2RaidLv(RaidLevelE.RAID_LEVEL_RAID5);
        }
        try
        {
            StoragePoolHandler storagePoolHandler = (StoragePoolHandler) manager
                .getHandler(HandlerConstant.STORAGEPOOL_HANDLER);
            // 调用create方法创建存储池
            storagePoolHandler.create(storagePoolMO);
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }

        return new Gson().toJson("success");
    }

    /**
     * 查询告警事件信息
     * 
     * @param request HttpServletRequest对象
     * @return json格式的字符串
     * @see [无]
     * @since [eSDK IVS V100R003C00]
     */
    public String login(HttpServletRequest request)
    {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String ip = request.getParameter("ip");
        int port = Integer.valueOf(request.getParameter("port"));

        manager = new DeviceManager(username, password, ip, port);

        try
        {
            manager.loginDevice();
        }
        catch (ApiException e)
        {
            return new Gson().toJson(e.getMessage());
        }
        return new Gson().toJson("success");

    }

}
