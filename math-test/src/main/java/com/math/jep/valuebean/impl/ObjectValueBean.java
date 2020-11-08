package com.math.jep.valuebean.impl;

import com.math.jep.valuebean.IValuable;
import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 陈正龙
 * @date 2020/10/9 15:00
 */
public class ObjectValueBean implements IValuable {

    public Object object;
    public Map<String,Double> resultMap =  new HashMap<String,Double>();

    public ObjectValueBean(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Double getValue(String fieldName)  throws Exception{
        //TODO Auto-generated method stub
        if (resultMap.containsKey(fieldName))
            return resultMap.get(fieldName);
        else
            return new Double(BeanUtils.getProperty(object,fieldName));
    }

    @Override
    public void setValue(String fieldName, Double result) throws Exception {
        // TODO Auto-generated method stub
        BeanUtils.setProperty(object, fieldName, result);
        resultMap.put(fieldName, result);
    }


}
