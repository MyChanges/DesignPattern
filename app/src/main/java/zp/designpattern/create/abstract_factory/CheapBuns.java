package zp.designpattern.create.abstract_factory;

/**
 * Created by change on 2018/11/19.
 * 具体对象
 *
 */

public class CheapBuns implements Breakfast {
    @Override
    public void sell() {
        System.out.println("这里的包子1块5起！");
    }
}
