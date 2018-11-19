package zp.designpattern.create.factory2;

/**
 * Created by change on 2018/11/19.
 */

public class FruitsFactory {
    public static <T extends Fruits> T getFruits(Class<T> clz) {
        try {
            Fruits fruits = (Fruits) Class.forName(clz.getName()).newInstance();
            return (T) fruits;
        } catch (Exception e) {
            return null;
        }
    }
}
