package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤4：为颜色接口创建实体类
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:45
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue fill().");
    }
}
