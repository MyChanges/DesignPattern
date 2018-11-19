package zp.designpattern.create.singleton;

/**
 * Created by change on 2018/11/19.
 * http://www.runoob.com/design-pattern/singleton-pattern.html
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * <p>
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * <p>
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * <p>
 * 关键代码：构造函数是私有的。
 */

public class Singleton {
    private static volatile Singleton sInstance;

    private Singleton() {
    }

    /*/**
     * 方式二、double-check， 避免并发时创建了多个实例, 该方式不能完全避免并发带来的破坏.
	 *
	 * @return
	 */
    public static Singleton getInstance() {
        if (sInstance == null) {
            synchronized (Singleton.class) {
                if (null == sInstance) {
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }

    /**
     * 静态内部类
     *
     * @author mrsimple
     */
    private static class SingletonHolder {
        private static final Singleton mOnlyInstance = new Singleton();
    }

    /**
     * 方式三 : 在第一次加载SingletonHolder时初始化一次mOnlyInstance对象, 保证唯一性, 也延迟了单例的实例化,
     * 如果该单例比较耗资源可以使用这种模式.
     *
     * @return
     */
    public static Singleton getInstanceFromHolder() {
        return SingletonHolder.mOnlyInstance;
    }


    public void getSingleDetails() {
        System.out.println("这是单例模式。。。");
        System.out.println();
    }
}
