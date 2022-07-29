package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.vip.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            //通过反射，执行方法
            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove", null);
            method.invoke(obj);

            //强转成接口，执行方法
            Person person = (Person) new JDKMeipo().getInstance(new Girl());
            person.findLove();

//            obj.findLove();

            //$Proxy0
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("$Proxy0.class");
            os.write(bytes);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
