package zp.designpattern.create.prototype;

/**
 * Created by change on 2018/11/16.
 */

public class ProtoTypeTest {
    // ①对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，
    // 也就是将该属性值复制一份给新的对象。因为是两份不同的数据
    // ，所以对其中一个对象的该成员变量值进行修改，不会影响另一个对象拷贝得到的数据。
    // ②对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递
    // ，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。
    // 在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
    public static void main(String[] strings) {
        WordDocument wordDocument = new WordDocument();
        wordDocument.setmText("文本11111111111");
        wordDocument.setImage("图片111111");
        wordDocument.setImage("图片222222");
        wordDocument.showDocument();

        WordDocument doc = wordDocument.clone();
        doc.showDocument();

        String result = wordDocument.getmText() == doc.getmText()
                ? "clone是浅拷贝的" : "clone是深拷贝的";

        System.out.println(result);



        doc.setmText("这是修改doc1111111111"); // 不会改变原有对象
        doc.setImage("gggg.png"); // 该变了原有对象，见克隆方法
        doc.showDocument();
        //引用类型的新对象doc的mImages只是单纯的指向了this.mImages引用，而并没有进行拷贝

        wordDocument.showDocument();

    }
}
