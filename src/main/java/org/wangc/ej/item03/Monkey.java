package org.wangc.ej.item03;

/**
 * @author wangchen17684
 * @since 2018-01-11
 *
 * 使用枚举类实现单例模式，防止多次被实例化，即使是在复杂的反序列化或反射攻击的情况下。
 *
 */
public enum Monkey {

    INSTANCE;
/*
    public Monkey getInstance(){
        return INSTANCE;
    }*/

    public void print(){
        System.out.println("Monkey swimming");
    }

}
