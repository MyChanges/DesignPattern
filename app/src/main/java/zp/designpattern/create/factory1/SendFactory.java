package zp.designpattern.create.factory1;

/**
 * Created by change on 2018/11/19.
 * 普通工厂
 * <p>
 * 简单工厂模式有一个问题就是，类的创建依赖工厂类，
 * 也就是说，如果想要拓展程序，必须对工厂类进行修改，
 * 这违背了闭包原则，所以，从设计角度考虑，有一定的问题，
 * 如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，
 * 这样一旦需要增加新的功能，
 * 直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class SendFactory {
    // 普通、多方法、静态都是简单工厂模式
    // 普通
    public Sender produce(String type) {
        if (type.equals("sms")) {
            return new SmsSender();
        } else if (type.equals("mail")) {
            return new MailSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    // 多方法
    public Sender produceMail() {
        return new MailSender();
    }

    // 多方法
    public Sender produceSms() {
        return new SmsSender();
    }


    // 静态
    public static Sender produceMail1() {
        return new MailSender();
    }

    public static Sender produceSms1() {
        return new SmsSender();
    }


}
