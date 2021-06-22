package com.pramod.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

	private Object obj;
	private Object invoke;

	public SecurityProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		
		try {
			result = method.invoke(obj, args);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new RuntimeException("Unexpected invocation exception " + e.getMessage());
		}
		
		return result;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
	}
}
