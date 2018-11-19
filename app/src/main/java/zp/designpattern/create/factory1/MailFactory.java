package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 * Mail 工厂
 */

public class MailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
