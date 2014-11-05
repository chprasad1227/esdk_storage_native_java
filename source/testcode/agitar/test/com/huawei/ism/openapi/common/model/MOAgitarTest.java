/**
 * Generated by Agitar build: AgitarOne Version 6.0.0.000018 (Build date: Sep 06, 2013) [6.0.0.000018]
 * JDK Version: 1.6.0_14
 *
 * Generated on 2014-3-11 13:36:04
 * Time to generate: 00:32.344 seconds
 *
 *
 * agitar.src.md5=com.huawei.ism.openapi.common.model.MO:5db41a0ea5b7df812d078d4bc69e4b27
 *
 */

package com.huawei.ism.openapi.common.model;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class MOAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return MO.class;
    }
    
    public void testConstructor() throws Throwable {
        MO mO = new MO();
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testConstructor1() throws Throwable {
        MO mO = new MO(new JSONObject());
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testConstructor2() throws Throwable {
        MO mO = new MO(null);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetBoolProperty() throws Throwable {
        Boolean result = new MO().getBoolProperty(null);
        assertFalse("result", result.booleanValue());
    }
    
    public void testGetBoolProperty1() throws Throwable {
        MO mO = new MO();
        Integer key = new Integer(0);
        mO.setProperty(key, new Object());
        Boolean result = mO.getBoolProperty(key);
        assertFalse("result", result.booleanValue());
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetBoolProperty2() throws Throwable {
        MO mO = new MO();
        Boolean result = mO.getBoolProperty("G\",\ne\u000BhLgrA\u0019\u001CH\u000B\u0005");
        assertFalse("result", result.booleanValue());
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetBoolPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        Boolean result = mO.getBoolProperty(obj);
        assertFalse("result", result.booleanValue());
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetDoubleProperty() throws Throwable {
        JSONObject jsonBody = new JSONObject();
        jsonBody.putOpt("testMOKey", new Object());
        MO mO = new MO(jsonBody);
        Pattern key = (Pattern) Mockingbird.getProxyObject(Pattern.class);
        Mockingbird.enterRecordingMode();
        LinkedHashMap linkedHashMap = (LinkedHashMap) Mockingbird.getProxyObject(LinkedHashMap.class);
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(MO.class);
        mO.getStrProperty(key);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", "-100", 1);
        Mockingbird.setReturnValue(false, "-100", "toString", "()java.lang.String", new Object[] {}, "-100", 1);
        Matcher matcher = (Matcher) Mockingbird.getProxyObject(Matcher.class);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(Pattern.class), "matcher", "(java.lang.CharSequence)java.util.regex.Matcher", matcher, 1);
        Mockingbird.setReturnValue(false, matcher, "matches", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, "-100", "toString", "()java.lang.String", new Object[] {}, "-100", 1);
        Double double2 = new Double(-100.0);
        Mockingbird.setReturnValue(true, Double.class, "valueOf", "(java.lang.String)java.lang.Double", new Object[] {"-100"}, double2, 1);
        Mockingbird.setReturnValue(false, double2, "doubleValue", "()double", new Object[] {}, new Double(-100.0), 1);
        Mockingbird.enterTestMode(MO.class);
        double result = mO.getDoubleProperty("[x");
        assertEquals("result", -100.0, result, 1.0E-6);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetDoubleProperty1() throws Throwable {
        MO mO = new MO(new JSONObject());
        Object key = new Object();
        mO.setProperty(key, "testString");
        double result = mO.getDoubleProperty(key);
        assertEquals("result", Double.MIN_VALUE, result, 1.0E-6);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetDoubleProperty2() throws Throwable {
        MO mO = new MO(new JSONObject());
        double result = mO.getDoubleProperty(new Long(Long.MIN_VALUE));
        assertEquals("result", Double.MIN_VALUE, result, 1.0E-6);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetDoubleProperty3() throws Throwable {
        double result = new MO().getDoubleProperty(null);
        assertEquals("result", Double.MIN_VALUE, result, 1.0E-6);
    }
    
    public void testGetDoublePropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        double result = mO.getDoubleProperty(obj);
        assertEquals("result", Double.MIN_VALUE, result, 1.0E-6);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetIntProperty() throws Throwable {
        MO mO = new MO(new JSONObject());
        Integer key = new Integer(100);
        mO.setProperty(key, key);
        int result = mO.getIntProperty(key);
        assertEquals("result", 100, result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetIntProperty1() throws Throwable {
        JSONObject jsonBody = new JSONObject();
        jsonBody.putOpt("testMOKey", new Object());
        MO mO = new MO(jsonBody);
        Pattern key = (Pattern) Mockingbird.getProxyObject(Pattern.class);
        Mockingbird.enterRecordingMode();
        LinkedHashMap linkedHashMap = (LinkedHashMap) Mockingbird.getProxyObject(LinkedHashMap.class);
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(MO.class);
        mO.getStrProperty(key);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", "0", 1);
        Mockingbird.setReturnValue(false, "0", "toString", "()java.lang.String", new Object[] {}, "0", 1);
        Matcher matcher = (Matcher) Mockingbird.getProxyObject(Matcher.class);
        Mockingbird.setReturnValue(false, Mockingbird.getProxyObject(Pattern.class), "matcher", "(java.lang.CharSequence)java.util.regex.Matcher", matcher, 1);
        Mockingbird.setReturnValue(false, matcher, "matches", "()boolean", new Object[] {}, Boolean.TRUE, 1);
        Mockingbird.setReturnValue(false, "0", "toString", "()java.lang.String", new Object[] {}, "0", 1);
        Integer integer = new Integer(0);
        Mockingbird.setReturnValue(true, Integer.class, "valueOf", "(java.lang.String)java.lang.Integer", new Object[] {"0"}, integer, 1);
        Mockingbird.setReturnValue(false, integer, "intValue", "()int", new Object[] {}, new Integer(0), 1);
        Mockingbird.enterTestMode(MO.class);
        int result = mO.getIntProperty("] not foud.");
        assertEquals("result", 0, result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetIntProperty2() throws Throwable {
        MO mO = new MO();
        Integer key = new Integer(0);
        mO.setProperty(key, new Object());
        int result = mO.getIntProperty(key);
        assertEquals("result", Integer.MIN_VALUE, result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetIntProperty3() throws Throwable {
        MO mO = new MO();
        int result = mO.getIntProperty("Ghk");
        assertEquals("result", Integer.MIN_VALUE, result);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetIntProperty4() throws Throwable {
        int result = new MO().getIntProperty(null);
        assertEquals("result", Integer.MIN_VALUE, result);
    }
    
    public void testGetIntPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        int result = mO.getIntProperty(obj);
        assertEquals("result", Integer.MIN_VALUE, result);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetLongProperty() throws Throwable {
        MO mO = new MO(new JSONObject(new TreeMap(new HashMap(100, 100.0F))));
        mO.setProperty("", new Integer(31));
        long result = mO.getLongProperty("");
        assertEquals("result", 31L, result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetLongProperty1() throws Throwable {
        JSONObject jsonBody = new JSONObject();
        jsonBody.put("] not foud.", new Double(0.0));
        jsonBody.put("testString", "testString");
        MO mO = new MO(jsonBody);
        long result = mO.getLongProperty("] not foud.");
        assertEquals("result", 0L, result);
        assertEquals("mO.getProperties().size()", 2, mO.getProperties().size());
    }
    
    public void testGetLongProperty2() throws Throwable {
        MO mO = new MO(new JSONObject());
        mO.setProperty("testString", "testString");
        long result = mO.getLongProperty("testString");
        assertEquals("result", Long.MIN_VALUE, result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetLongProperty3() throws Throwable {
        long result = new MO().getLongProperty(null);
        assertEquals("result", Long.MIN_VALUE, result);
    }
    
    public void testGetLongProperty4() throws Throwable {
        MO mO = new MO(new JSONObject(new TreeMap(new HashMap(100, 100.0F))));
        long result = mO.getLongProperty("oH9Y~yif5x#P;B;a");
        assertEquals("result", Long.MIN_VALUE, result);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetLongPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        long result = mO.getLongProperty(obj);
        assertEquals("result", Long.MIN_VALUE, result);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetProperties() throws Throwable {
        LinkedHashMap result = (LinkedHashMap) new MO(new JSONObject()).getProperties();
        assertEquals("result.size()", 0, result.size());
    }
    
    public void testGetProperty() throws Throwable {
        JSONObject jsonBody = new JSONObject();
        jsonBody.putOpt("testMOKey", new Object());
        MO mO = new MO(jsonBody);
        Pattern key = (Pattern) Mockingbird.getProxyObject(Pattern.class);
        Mockingbird.enterRecordingMode();
        LinkedHashMap linkedHashMap = (LinkedHashMap) Mockingbird.getProxyObject(LinkedHashMap.class);
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", null, 1);
        Mockingbird.enterTestMode(MO.class);
        mO.getStrProperty(key);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", "", 1);
        Mockingbird.enterTestMode(MO.class);
        String result = (String) mO.getProperty("");
        assertEquals("result", "", result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetProperty1() throws Throwable {
        Object result = new MO(new JSONObject()).getProperty(null);
        assertNull("result", result);
    }
    
    public void testGetProperty2() throws Throwable {
        JSONObject jsonBody = (JSONObject) Mockingbird.getProxyObject(JSONObject.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(jsonBody.toString(), "{}");
        LinkedHashMap linkedHashMap = (LinkedHashMap) Mockingbird.getProxyObject(LinkedHashMap.class);
        Mockingbird.setReturnValue(true, ((Gson) Mockingbird.getProxyObject(Gson.class)).fromJson("testMOParam1", null), linkedHashMap);
        Mockingbird.enterTestMode(MO.class);
        MO mO = new MO(jsonBody);
        Object key = Mockingbird.getProxyObject(Object.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(false, linkedHashMap, "get", "(java.lang.Object)java.lang.Object", new Object[] {key}, new Integer(0), 1);
        Mockingbird.enterTestMode(MO.class);
        mO.getProperty(key);
        assertTrue("Test call resulted in expected outcome", true);
        // dependencies on static and environment state led to removal of 2 assertions
    }
    
    public void testGetPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        Object result = mO.getProperty(obj);
        assertNull("result", result);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetStrArrayProperty() throws Throwable {
        MO mO = new MO();
        String[] result = mO.getStrArrayProperty("");
        assertNull("result", result);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetStrArrayProperty1() throws Throwable {
        MO mO = new MO(new JSONObject());
        mO.setProperty("", "");
        String[] result = mO.getStrArrayProperty("");
        assertNull("result", result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetStrArrayProperty2() throws Throwable {
        String[] result = new MO().getStrArrayProperty(null);
        assertNull("result", result);
    }
    
    public void testGetStrArrayPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        String[] result = mO.getStrArrayProperty(obj);
        assertNull("result", result);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testGetStrProperty() throws Throwable {
        MO mO = new MO();
        String result = mO.getStrProperty("\"!F~4`c#.936");
        assertNull("result", result);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetStrProperty1() throws Throwable {
        String result = new MO(new JSONObject()).getStrProperty(null);
        assertNull("result", result);
    }
    
    public void testGetStrProperty2() throws Throwable {
        MO mO = new MO(new JSONObject());
        Object key = new Object();
        mO.setProperty(key, "testString");
        String result = mO.getStrProperty(key);
        assertEquals("result", "testString", result);
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
    }
    
    public void testGetStrPropertyWithAggressiveMocks() throws Throwable {
        MO mO = (MO) Mockingbird.getProxyObject(MO.class, true);
        Object obj = Mockingbird.getProxyObject(Object.class);
        setPrivateField(mO, "properties", null);
        Mockingbird.enterTestMode(MO.class);
        String result = mO.getStrProperty(obj);
        assertNull("result", result);
        assertNull("mO.getProperties()", mO.getProperties());
    }
    
    public void testSetProperty() throws Throwable {
        MO mO = new MO();
        mO.setProperty("testString", "testString");
        assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
        assertEquals("mO.getProperties().get(\"testString\")", "testString", mO.getProperties().get("testString"));
    }
    
    public void testSetProperty1() throws Throwable {
        MO mO = new MO();
        mO.setProperty(null, "testString");
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testSetProperty2() throws Throwable {
        MO mO = new MO();
        mO.setProperty(null);
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testSetProperty3() throws Throwable {
        MO mO = new MO();
        mO.setProperty((Map) new HashMap(100, 100.0F));
        assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
    }
    
    public void testGetDoublePropertyThrowsNumberFormatException() throws Throwable {
        MO mO = new MO(new JSONObject());
        mO.setProperty("", "");
        try {
            mO.getDoubleProperty("");
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "empty String", ex.getMessage());
            assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
        }
    }
    
    public void testGetIntPropertyThrowsNumberFormatException() throws Throwable {
        MO mO = new MO(new JSONObject());
        mO.setProperty("", "");
        try {
            mO.getIntProperty("");
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "For input string: \"\"", ex.getMessage());
            assertThrownBy(NumberFormatException.class, ex);
            assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
        }
    }
    
    public void testGetLongPropertyThrowsNumberFormatException() throws Throwable {
        MO mO = new MO(new JSONObject());
        mO.setProperty("", "");
        try {
            mO.getLongProperty("");
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertEquals("ex.getMessage()", "For input string: \"\"", ex.getMessage());
            assertThrownBy(NumberFormatException.class, ex);
            assertEquals("mO.getProperties().size()", 1, mO.getProperties().size());
        }
    }
    
    public void testSetPropertyThrowsNullPointerException() throws Throwable {
        MO mO = new MO();
        try {
            mO.setProperty("c \u0001", null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
        }
    }
    
    public void testSetPropertyThrowsNullPointerException1() throws Throwable {
        MO mO = new MO();
        Map propertyMap = new HashMap(100, 100.0F);
        propertyMap.put(new Object(), (Object) null);
        try {
            mO.setProperty((Map) propertyMap);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertEquals("mO.getProperties().size()", 0, mO.getProperties().size());
        }
    }
}

