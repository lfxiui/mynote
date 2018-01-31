package com.lifuxi.mynote.pattern.factory;

/**
 * 步骤4：使用该工厂，通过传递类型相信来获取实体类的对象
 *
 * @author lfxiui
 * @date 2018/1/31 0031 13:44
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        /**
         * 普通工厂
         */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        /**
         *利用泛型
         */
        Rectangle rectangle = ShapeFactory2.getClass(Rectangle.class);
        rectangle.draw();
        Shape shape3 = ShapeFactory2.getClass(Square.class);
        shape3.draw();
    }
}
