package zp.designpattern.prototype;

import java.util.ArrayList;

/**
 * https://blog.csdn.net/zhangjg_blog/article/details/18369201
 * Created by change on 2018/11/16.
 * <p>
 * Client : 客户端用户。
 * Prototype : 抽象类或者接口，声明具备clone能力。
 * ConcretePrototype : 具体的原型类.
 * <p>
 * 原来 list 进行操作，原来的list中元素同样会增加 1.前拷贝 只拷贝基础数据类型 2.深拷贝，拷贝所有，需要手动进行操作
 *
 *
 * 我们经常会用到对象的拷贝，但是但是继承Cloneable重写clone实现的只是浅拷贝，那么什么是深拷贝，什么是浅拷贝呢。
 拷贝就是设计模式中原型模式的一种体现，原型模式是内存二进制流的拷贝，要比new一个对象的性能好的多的多，
 特别是在for循环中产生大量对象时，原型模式能更好的体现其优点。
 其实从内存方面来说简单一句话，就是看有没有开辟新的内存空间用于存储拷贝的对象，浅拷贝只是拷贝一份引用，
 而深拷贝重新开辟堆内存存储拷贝的数据，浅拷贝对于基本类型和字符串String类型有效，具体原因这里不展开。
 下面看下效果
 ---------------------

 使用场景:
 1、网络请求更新用户信息
 原文：https://blog.csdn.net/forwujinwei/article/details/79915872
 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class WordDocument implements Cloneable { //(WardDocument == ConcretePrototype)  ， Cloneable Prototype
    private String mText;
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void setImage(String image) {
        mImages.add(image);
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument wordDocument = (WordDocument) super.clone();
            wordDocument.mText =  this.mText;
           // wordDocument.mImages = this.mImages; // 浅拷贝，可能会改变原有对象.没有进行拷贝
            wordDocument.mImages = (ArrayList<String>) this.mImages.clone(); // 深拷贝，不会改变原有对象
            return wordDocument;
        } catch (CloneNotSupportedException  e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 打印文档内容
     */
    public void showDocument() {
        System.out.println("----------- Word Content Start -----------");
        System.out.println("Text : " + mText);
        System.out.println("Images List: ");
        for (String imgName : mImages) {
            System.out.println("image name : " + imgName);
        }
        System.out.println("----------- Word Content End -----------");
    }
}
