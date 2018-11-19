package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 * ，简单工厂一般分为：普通简单工厂、多方法简单工厂、静态方法简单工厂。
 */

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender!");
    }
}
