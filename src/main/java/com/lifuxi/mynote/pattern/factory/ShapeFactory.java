package com.lifuxi.mynote.pattern.factory;

/**
 * 步骤3：创建一个工厂，生成基于给定信息的实体类的对象
 *
 * @author lfxiui
 * @date 2018/1/31 0031 13:37
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("CIRCLE".equals(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equals(shapeType)) {
            return new Square();
        }
        return null;
    }
}
