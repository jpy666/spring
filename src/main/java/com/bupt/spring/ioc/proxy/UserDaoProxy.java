package com.bupt.spring.ioc.proxy;

import com.bupt.spring.ioc.dao.UserDao;
import com.bupt.spring.ioc.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLOutput;

/**
 * @Author: 金培源
 * @Date: 2022/4/19 10:58
 * @Version: 1.0
 * @Description:
 */
public class UserDaoProxy {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        UserDao dao = (UserDao)Proxy.newProxyInstance(UserDaoProxy.class.getClassLoader(), interfaces, new MyInvocationHandler(userDao));
        int result = dao.add(1,2);
        System.out.println(result);
    }
}
class MyInvocationHandler implements InvocationHandler {
    // 创建是接口实现类的代理对象
    public Object obj;
    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法之前执行");
        Object invoke = method.invoke(obj, args);
        System.out.println("方法之后执行");
        return invoke;
    }
}
