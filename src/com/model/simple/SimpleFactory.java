package com.model.simple;


import com.model.resource.OppoPhone;
import com.model.resource.Phone;
import com.model.resource.VivoPhone;

/**
 * 简单工厂就是直接在一个方法中进行判断，创建想要的类，
 * 缺点：当要其他的种类时要不断的改代码，增加判断条件。
 */
public class SimpleFactory {

    Phone create(String name){
        if (name.equals("oppo")){
            return new OppoPhone();
        }else if (name.equals("vivo")){
            return new VivoPhone();
        }
        return null;
    }

}
