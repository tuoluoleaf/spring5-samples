package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 懒汉式单例-线程不安全
 *
 * @author xutuo
 */
public class UnSafeLazySingleton {
    private UnSafeLazySingleton() {
    }

    //静态块，公共内存区域
    private static UnSafeLazySingleton lazy = null;

    public static UnSafeLazySingleton getInstance() {
        if (lazy == null) {
            lazy = new UnSafeLazySingleton();
        }
        return lazy;
    }

}
