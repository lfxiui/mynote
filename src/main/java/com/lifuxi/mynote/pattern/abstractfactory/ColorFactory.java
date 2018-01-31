package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤6：拓展抽象工厂，根据信息生成对应的实体类
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:59
 */
public class ColorFactory extends AstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if ("RED".equals(color)) {
            return new Red();
        } else if ("BLUE".equals(color)) {
            return new Blue();
        } else if ("GREEN".equals(color)) {
            return new Green();
        }
        return null;
    }
}
