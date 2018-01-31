package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤4：创建颜色接口的实体类
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:45
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red fill().");
    }
}
