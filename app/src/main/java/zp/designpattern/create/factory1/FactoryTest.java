package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 */

public class FactoryTest {
    public static void main(String[] strings) {
        // 简单工厂模式
        // 普通
        new SendFactory().produce("sms").send();
        // 多方法
        new SendFactory().produceMail().send();
        // 静态
        SendFactory.produceMail1();

        // 工厂方法模式
  /*      发及时信息，则只需做一个实现类，实现Sender接口
        ，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！*/
        Provider provider = new MailFactory();
        provider.produce().send();



    }

}
