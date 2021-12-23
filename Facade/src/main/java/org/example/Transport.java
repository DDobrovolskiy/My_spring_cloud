package org.example;

import org.aopalliance.intercept.Interceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@Component
public class Transport {



    public <I> I getInstance(Class<I> clazz) {
        return (I) Proxy.newProxyInstance(Transport.class.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(clazz.getName());
                System.out.println(method.getName());
                RestTemplate restTemplate = new RestTemplate();
                return restTemplate.getForObject("http://localhost:8190/" + clazz.getName() + "/" + method.getName(), String.class);
            }
        });
    }
}
