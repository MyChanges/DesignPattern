package zp.designpattern.proxy;

/**
 * Created by change on 2018/11/15.
 */

public class UserDao implements DaoInterface {
    @Override
    public void add() {
        System.out.println("添加了。。。。");

    }

    @Override
    public void delete() {
        System.out.println("删除了。。。。");
    }
}
