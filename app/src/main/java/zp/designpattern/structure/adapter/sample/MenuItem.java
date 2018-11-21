package zp.designpattern.structure.adapter.sample;

/**
 * Created by change on 2018/11/20.
 */

public class MenuItem {
    public int imageId;
    public String title;

    public MenuItem(String title, int resId) {
        this.title = title;
        imageId = resId;
    }

}
