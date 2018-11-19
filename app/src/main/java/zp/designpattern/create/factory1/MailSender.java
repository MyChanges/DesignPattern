package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 */

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender!");
    }
}
