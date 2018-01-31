package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤5：为shape和color创建抽象类来获取工厂
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:50
 */
public abstract class AstractFactory {
    /**
     * 获取形状
     *
     * @param shape
     * @return
     */
    abstract Shape getShape(String shape);

    /**
     * 获取颜色
     *
     * @param color
     * @return
     */
    abstract Color getColor(String color);
}
