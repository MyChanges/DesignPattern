package zp.designpattern.strategy;

/**
 * Created by change on 2018/11/16.
 * 环境角色类
 */


public class Context {
    private Strategy mStrategy;

    public Context(Strategy strategy) {
        this.mStrategy = strategy;
    }

    public void contextStrategy() {
        mStrategy.strategyInterface();
    }

}
