package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 */

public class ExpensiveSoyMilk extends BreakfastShop {
    @Override
    public void sell() {
        super.sell();
        System.out.println("这里的豆浆3块5起！");
    }
}
