package zp.designpattern.strategy;

/**
 * Created by change on 2018/11/16.
 */

public class Test {
    public static void main(String[] strings) {
       // ObjectA A = new ObjectA();
        ObjectB B = new ObjectB();
        Context context = new Context(B);
        context.contextStrategy();
    }
}
