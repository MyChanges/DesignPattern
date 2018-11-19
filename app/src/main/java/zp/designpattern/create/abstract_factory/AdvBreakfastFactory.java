package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * 高级早餐工厂
 * （具体工厂）
 */

public class AdvBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new ExpensiveBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new ExpensiveSoyMilk();
    }
}
