package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 测试用例
 *
 * @author lfxiui
 * @date 2018/1/31 0031 15:06
 */
public class Demo {
    public static void main(String[] args) {
        AstractFactory astractFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = astractFactory.getShape("SQUARE");
        Shape shape1 = astractFactory.getShape("RECTANGLE");
        Shape shape2 = astractFactory.getShape("CIRCLE");
        shape.draw();
        shape1.draw();
        shape2.draw();
        AstractFactory astractFactory1 = FactoryProducer.getFactory("COLOR");
        Color color = astractFactory1.getColor("RED");
        Color color1 = astractFactory1.getColor("BLUE");
        Color color2 = astractFactory1.getColor("GREEN");
        color.fill();
        color1.fill();
        color2.fill();
    }
}
