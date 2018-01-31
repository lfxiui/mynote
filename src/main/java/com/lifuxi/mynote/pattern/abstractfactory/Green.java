package com.lifuxi.mynote.pattern.abstractfactory;

/**
 * 步骤4：为颜色接口创建实体类
 *
 * @author lfxiui
 * @date 2018/1/31 0031 14:46
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green fill().");
    }
}
