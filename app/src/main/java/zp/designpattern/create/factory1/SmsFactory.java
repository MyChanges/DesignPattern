package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 */

public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
