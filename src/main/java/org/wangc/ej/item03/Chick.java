package org.wangc.ej.item03;

/**
 * @author wangchen17684
 * @since 2018-01-11
 */
public class Chick {

    private static final Chick INSTANCE = new Chick();

    private Chick(){

    }

    public static Chick getInstance(){
        return INSTANCE;
    }

    // 保持单例属性
    private Object readResolve(){
        return INSTANCE;
    }

}
