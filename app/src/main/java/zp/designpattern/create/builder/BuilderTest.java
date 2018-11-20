package zp.designpattern.create.builder;

/**
 * Created by change on 2018/11/19. （创建者模式）
 * <p>
 * Product 产品类 : 产品的抽象类。
 * Builder : 抽象类， 规范产品的组建，一般是由子类实现具体的组件过程。
 * ConcreteBuilder : 具体的构建器.
 * Director : 统一组装过程(可省略)。导演
 * <p>
 * 使用场景：
 * ● 相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
 * ● 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可以使用该模式。
 * ● 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式非常合适。
 */

public class BuilderTest {
    public static void main(String[] strings) {
        Builder builder = new ApplePCBuilder();
        Director director = new Director(builder);
        director.construct(8, 4, "windows");
        // 构建电脑, 输出相关信息
        System.out.println("Computer Info : " + builder.create().toString());

        // 第二种
        Window.Builder builder1 = new Window.Builder();
        Window window = builder1.setmCpuCore(16).setmRamSize(5).setmOs("apple").create();
        System.out.println("Computer window Info : " + window.toString());

    }
}
