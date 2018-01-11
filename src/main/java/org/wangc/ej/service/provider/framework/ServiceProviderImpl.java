package org.wangc.ej.service.provider.framework;

/**
 * @author wangchen17684
 * @since 2018-01-11
 */
public class ServiceProviderImpl implements ServiceProvider {
    static {
        Services.registerService("duck",new ServiceProviderImpl());
    }

    public ServiceInterface getService() {
        return new ServiceInterfaceImpl();
    }
}
