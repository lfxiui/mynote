package com.lifuxi.mynote.pattern.factory;

/**
 * 使用反射机制可以解决没增加一个对象就要增加一个工厂实现对象的缺点
 * @author lfxiui
 * @date 2018/1/31 0031 13:53
 */
public class ShapeFactory2 {
    public static <T> T getClass(Class<?extends T> clazz){
        T object = null;
        try {
            object = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
