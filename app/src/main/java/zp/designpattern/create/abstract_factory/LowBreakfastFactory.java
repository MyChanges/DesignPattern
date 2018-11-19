package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * (具体工厂)
 */

public class LowBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new CheapBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new CheapSoyMilk();
    }
}
