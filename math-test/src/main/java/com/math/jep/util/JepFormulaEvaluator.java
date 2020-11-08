package com.math.jep.util;

import com.math.jep.valuebean.IValuable;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

import java.util.Set;

/**
 * @author 陈正龙
 * @date 2020/10/9 15:07
 */
public class JepFormulaEvaluator {
    private String formula ;
    Node node;
    double result;
    JEP jep =new JEP();
    /** 构造函数 */
    public JepFormulaEvaluator(String formula){
        this .formula = formula;

    }

    /**
     * 解析公式表达式
     */
    public boolean parse()  throws ParseException {
        if (formula ==  null ) {
            return false ;
        }
        jep.parseExpression(formula);
        node = jep.getTopNode();
        return true ;
    }

    /**
     * 变量赋值
     */
    public void addVariables(IValuable valuable)  throws Exception{
        Set<String> children =  this .findChildren();
        for (String child : children) {
            jep.addVariable(child, valuable.getValue(child));
        }
    }



    /**
     * 计算结果
     */
    public Double evaluate()  throws Exception {
        result = jep.getValue();
        return result;
    }

    private Set<String> findChildren() {
        return null;
    }
}
