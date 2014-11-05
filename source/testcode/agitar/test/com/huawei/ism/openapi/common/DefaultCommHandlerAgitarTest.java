/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:27:37
 * Time to generate: 00:09.984 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.common.DefaultCommHandler:b6802204ee7c3e439b341a5d028a1348
 *
 */

package com.huawei.ism.openapi.common;

import com.agitar.lib.junit.AgitarTestCase;
import com.huawei.ism.openapi.common.commu.rest.RestRequestHandler;

public class DefaultCommHandlerAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return DefaultCommHandler.class;
    }
    
    public void testConstructor() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testDefaultCommHandlerIp", 100);
        DefaultCommHandler defaultCommHandler = new DefaultCommHandler(restRequestHandler, "testDefaultCommHandlerDeviceID");
        assertEquals("defaultCommHandler.deviceID", "testDefaultCommHandlerDeviceID", getPrivateField(defaultCommHandler, "deviceID"));
        assertSame("defaultCommHandler.restRequestHandler", restRequestHandler, getPrivateField(defaultCommHandler, "restRequestHandler"));
    }
    
    public void testGetDeviceId() throws Throwable {
        DefaultCommHandler defaultCommHandler = new DefaultCommHandler(new RestRequestHandler("testDefaultCommHandlerIp", 100), "testDefaultCommHandlerDeviceID");
        String result = defaultCommHandler.getDeviceId();
        assertEquals("result", "testDefaultCommHandlerDeviceID", result);
    }
    
    public void testGetRestRequestHandler() throws Throwable {
        RestRequestHandler restRequestHandler = new RestRequestHandler("testDefaultCommHandlerIp", 100);
        DefaultCommHandler defaultCommHandler = new DefaultCommHandler(restRequestHandler, "testDefaultCommHandlerDeviceID");
        RestRequestHandler result = defaultCommHandler.getRestRequestHandler();
        assertSame("result", restRequestHandler, result);
    }
}
