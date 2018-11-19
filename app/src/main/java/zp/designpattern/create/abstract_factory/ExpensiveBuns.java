package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * 具体对象
 */

public class ExpensiveBuns extends BreakfastShop {
    @Override
    public void sell() {
        super.sell();
        System.out.println("这里的包子4块5起！");
    }
}
