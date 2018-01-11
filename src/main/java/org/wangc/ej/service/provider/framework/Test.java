package org.wangc.ej.service.provider.framework;

/**
 * @author wangchen17684
 * @since 2018-01-11
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.wangc.ej.service.provider.framework.ServiceProviderImpl");

        ServiceInterface service = Services.getService("duck");
        service.print();
    }
}
