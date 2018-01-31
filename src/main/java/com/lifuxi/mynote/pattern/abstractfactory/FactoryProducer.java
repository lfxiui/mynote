package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤7：根据信息生成对应的工厂
 *
 * @author lfxiui
 * @date 2018/1/31 0031 15:03
 */
public class FactoryProducer {
    public static AstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if ("SHAPE".equals(factoryType)) {
            return new ShapeFactory();
        } else if ("COLOR".equals(factoryType)) {
            return new ColorFactory();
        }
        return null;
    }
}
