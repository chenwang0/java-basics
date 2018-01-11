package org.wangc.faq;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author wangchen17684
 * @since 2017-12-26
 */
public class Covariance {

    static void printAll(ArrayList<Object> c){
        for (Object o : c){
            System.out.println(o);
        }
    }

    static void printAll2(Collection<Object> c){
        for (Object o : c){
            System.out.println(o);
        }
    }


    public static void main(String[] args) {

        //Pair<Integer,Integer>[] intPairArr = new Pair<Integer,Integer>[10];

        //Object[] objArr3 = intPairArr;
        //objArr3[0] = new Pair<String,String>("","");




        ArrayList<Object> list = new ArrayList<Object>();
        printAll(list);
        printAll2(list); // fine



        Object[] objArr = new String[10];
        objArr[0] = new String();

        Object[] objArr2 = new String[10];
        objArr[0] = new Long(0L); // 成功编译，但是在运行时报ArrayStoreException

        System.out.println(objArr2[0]);

    }



}
