package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 */

public class CheapSoyMilk implements Breakfast {
    @Override
    public void sell() {
        System.out.println("这里的豆浆1块5起！");
    }
}
