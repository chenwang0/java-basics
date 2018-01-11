package org.wangc.ej.service.provider.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangchen17684
 * @since 2018-01-11
 */
public class Services {

    private static Map<String,ServiceProvider> providers = new ConcurrentHashMap<String, ServiceProvider>();

    public static void registerService(String name,ServiceProvider provider){
        providers.put(name,provider);
    }

    public static ServiceInterface getService(String name){
        ServiceProvider provider = providers.get(name);

        if(provider == null){
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }

        return provider.getService();

    }

}
