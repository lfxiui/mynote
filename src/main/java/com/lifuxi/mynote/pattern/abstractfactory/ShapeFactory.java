package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤6：拓展抽象工厂，基于给定的信息生成实体类对象
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:54
 */
public class ShapeFactory extends AstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if ("CIRCLE".equals(shape)) {
            return new Circle();
        } else if ("RECTANGLE".equals(shape)) {
            return new Rectangle();
        } else if ("SQUARE".equals(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
