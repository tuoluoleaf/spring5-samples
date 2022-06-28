package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 懒汉式单例-线程简单方式锁
 *
 * @author xutuo
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
