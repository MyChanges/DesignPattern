package zp.designpattern.proxy;

/**
 * Created by change on 2018/11/15.
 * 代理对象
 */
public class UserDaoProxy implements DaoInterface {
    private DaoInterface mDaoInterface;

    public UserDaoProxy(DaoInterface daoInterface) {
        this.mDaoInterface = daoInterface;

    }

    @Override
    public void add() {
        mDaoInterface.add();

    }

    @Override
    public void delete() {
        mDaoInterface.delete();

    }
}
