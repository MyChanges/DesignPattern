package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * 所有早餐的基类
 */

public class BreakfastShop implements Breakfast {
    @Override
    public void sell() {
        System.out.print("开始卖早餐了....");
    }
}
