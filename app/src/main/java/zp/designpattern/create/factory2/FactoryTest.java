package zp.designpattern.create.factory2;

/**
 * Created by change on 2018/11/19.
 *
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 3、屏蔽产品的具体实现，调用者只关心产品的接口。

 缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
 在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

 使用场景
 */

public class FactoryTest {
    public static void main(String[] strings) {
        //http://www.runoob.com/design-pattern/factory-pattern.html
        FruitsFactory.getFruits(Banana.class).color();
    }
}