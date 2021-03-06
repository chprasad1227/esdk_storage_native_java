/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:36:25
 * Time to generate: 02:41.469 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.common.logmanager.LogUtil:ec2c19e0c2b695e9ccb1544dda7c1546
 *
 */

package com.huawei.ism.openapi.common.logmanager;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.ism.openapi.common.exception.ApiException;
import com.huawei.ism.openapi.common.exception.ApiMessage;
import com.huawei.ism.openapi.common.keydeifines.EnumDefine;

public class LogUtilAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return LogUtil.class;
    }
    
    public void testConstructor() throws Throwable {
        LogUtil logUtil = (LogUtil) callPrivateMethod("com.huawei.ism.openapi.common.logmanager.LogUtil", "<init>", new Class[] {}, null, new Object[] {});
        assertNull("logUtil.gLogListener", getPrivateField(logUtil, "gLogListener"));
    }
    
    public void testGetLogUtilInstance() throws Throwable {
        LogUtil result = LogUtil.getLogUtilInstance();
        assertNotNull("result", result);
    }
    
    public void testGetLogUtilInstance1() throws Throwable {
        storeStaticField(LogUtil.class, "logUtilInstance");
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(LogUtil.class, "<init>()", Mockingbird.getProxyObject(LogUtil.class, true));
        setPrivateField(LogUtil.class, "logUtilInstance", null);
        Mockingbird.enterTestMode(LogUtil.class);
        LogUtil result = LogUtil.getLogUtilInstance();
        assertNotNull("result", result);
        assertNotNull("LogUtil.logUtilInstance", getPrivateField(LogUtil.class, "logUtilInstance"));
    }
    
    public void testSetLogListener() throws Throwable {
        LogUtil logUtilInstance = LogUtil.getLogUtilInstance();
        logUtilInstance.setLogListener(null);
        assertNull("logUtilInstance.gLogListener", getPrivateField(logUtilInstance, "gLogListener"));
    }
    
    public void testShowLog() throws Throwable {
        LogUtil logUtilInstance = LogUtil.getLogUtilInstance();
        logUtilInstance.showLog(EnumDefine.LOG_TYPE_E.LOG_FAIL, "testLogUtilMsg");
        assertNull("logUtilInstance.gLogListener", getPrivateField(logUtilInstance, "gLogListener"));
    }
    
    public void testShowLogWithAggressiveMocks() throws Throwable {
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class, true);
        LogListener logListener = (LogListener) Mockingbird.getProxyObject(LogListener.class);
        LogHelper logHelper = (LogHelper) Mockingbird.getProxyObject(LogHelper.class);
        LogHelper logHelper2 = (LogHelper) Mockingbird.getProxyObject(LogHelper.class);
        logUtil.setLogListener(logListener);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(LogHelper.getLogHelperInstance(), logHelper);
        Mockingbird.setReturnValue(logHelper.getCurTime(), "");
        Mockingbird.setReturnValue(LogHelper.getLogHelperInstance(), logHelper2);
        Mockingbird.setReturnValue(logHelper2.getFileLineMethod(2), "");
        Mockingbird.setReturnValue(true, String.class, "format", "(java.lang.String,java.lang.Object[])java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logListener, "info", "(java.lang.String)void", null, 1);
        Mockingbird.enterTestMode(LogUtil.class);
        logUtil.showLog(EnumDefine.LOG_TYPE_E.LOG_INFO, "");
        assertNotNull("logUtil.gLogListener", getPrivateField(logUtil, "gLogListener"));
    }
    
    public void testShowLogWithAggressiveMocks1() throws Throwable {
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class, true);
        LogListener logListener = (LogListener) Mockingbird.getProxyObject(LogListener.class);
        LogHelper logHelper = (LogHelper) Mockingbird.getProxyObject(LogHelper.class);
        LogHelper logHelper2 = (LogHelper) Mockingbird.getProxyObject(LogHelper.class);
        logUtil.setLogListener(logListener);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(LogHelper.getLogHelperInstance(), logHelper);
        Mockingbird.setReturnValue(logHelper.getCurTime(), "");
        Mockingbird.setReturnValue(LogHelper.getLogHelperInstance(), logHelper2);
        Mockingbird.setReturnValue(logHelper2.getFileLineMethod(2), "");
        Mockingbird.setReturnValue(true, String.class, "format", "(java.lang.String,java.lang.Object[])java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logListener, "error", "(java.lang.String)void", null, 1);
        Mockingbird.enterTestMode(LogUtil.class);
        logUtil.showLog(EnumDefine.LOG_TYPE_E.LOG_ERROR, "");
        assertNotNull("logUtil.gLogListener", getPrivateField(logUtil, "gLogListener"));
    }
    
    public void testShowStackTrace() throws Throwable {
        LogUtil logUtil = (LogUtil) callPrivateMethod("com.huawei.ism.openapi.common.logmanager.LogUtil", "<init>", new Class[] {}, null, new Object[] {});
        ApiException e = new ApiException(new ApiMessage(100L, "testLogUtilErrDescription", "testLogUtilErrSuggestion"));
        logUtil.showStackTrace(e);
        assertNull("logUtil.gLogListener", getPrivateField(logUtil, "gLogListener"));
    }
    
    public void testShowStackTraceWithAggressiveMocks() throws Throwable {
        LogUtil logUtil = (LogUtil) Mockingbird.getProxyObject(LogUtil.class, true);
        LogListener logListener = (LogListener) Mockingbird.getProxyObject(LogListener.class);
        LogHelper logHelper = (LogHelper) Mockingbird.getProxyObject(LogHelper.class);
        logUtil.setLogListener(logListener);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(LogHelper.getLogHelperInstance(), logHelper);
        Mockingbird.setReturnValue(logHelper.getStackTrace(null), "");
        Mockingbird.setReturnValue(true, String.class, "format", "(java.lang.String,java.lang.Object[])java.lang.String", "", 1);
        Mockingbird.setReturnValue(false, logListener, "error", "(java.lang.String)void", null, 1);
        Mockingbird.enterTestMode(LogUtil.class);
        logUtil.showStackTrace(null);
        assertNotNull("logUtil.gLogListener", getPrivateField(logUtil, "gLogListener"));
    }
}

