package org.wangc.faq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wangchen17684
 * @since 2017-12-15
 */
public class DynamicCheck {

    void m1(){
        List<Date> list = new ArrayList<Date>();
        list.add(new Date());
        m2(list);
    }

    void m2(Object arg){
        List<String> list = (List<String>) arg; // unchecked warnning

        m3(list);
    }

    void m3(List<String> list){
        String s = list.get(0); // ClassCastException
    }

    public static void main(String[] args) {
        new DynamicCheck().m1();
    }

}
