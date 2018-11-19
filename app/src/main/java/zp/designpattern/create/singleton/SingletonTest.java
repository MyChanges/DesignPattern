package zp.designpattern.create.singleton;

/**
 * Created by change on 2018/11/19.
 */

public class SingletonTest {
    public static void main(String[] strings) {
        Singleton.getInstance().getSingleDetails();
        SingletonEnum.INSTANCE.whateverMethod();
    }
}
