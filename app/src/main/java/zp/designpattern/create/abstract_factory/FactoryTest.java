package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * 测试
 */

public class FactoryTest {
    public static void main(String[] strings) {
        //  抽象工厂、具体工厂、抽象对象、具体对象
        //注意这里有2种写法 (extends BreakfastShop 和 不继承)
        AdvBreakfastFactory factory = new AdvBreakfastFactory();
        factory.sellBuns().sell();


        LowBreakfastFactory factory1 = new LowBreakfastFactory();
        factory1.sellSoyMilk().sell();
    }
}
