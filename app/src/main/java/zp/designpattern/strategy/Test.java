package zp.designpattern.strategy;

/**
 * Created by change on 2018/11/16.
 * 策略模式
 * Context：用来操作策略的上下文环境。
   Strategy : 策略的抽象。
    ConcreteStrategyA、ConcreteStrategyB : 具体的策略实现。
 */
public class Test {
    public static void main(String[] strings) {
       // ObjectA A = new ObjectA();
        ObjectB B = new ObjectB();
        Context context = new Context(B);
        context.contextStrategy();
    }
}
