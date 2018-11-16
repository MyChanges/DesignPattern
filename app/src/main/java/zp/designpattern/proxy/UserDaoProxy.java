package zp.designpattern.proxy;

/**
 * Created by change on 2018/11/15.
 * 代理对象
 */
public class UserDaoProxy implements IDaoInterface {
    private IDaoInterface mDaoInterface;

    public UserDaoProxy(IDaoInterface daoInterface) {
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
