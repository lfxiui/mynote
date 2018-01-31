package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤2：创建实现接口的实体类
 *
 * @author lfxiui
 * @date 2018/1/31 0031 13:32
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
