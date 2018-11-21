package zp.designpattern.structure.adapter.sample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import zp.designpattern.R;
import zp.designpattern.structure.adapter.sample.MenuItem;

/**
 * Created by change on 2018/11/20.
 */

public class CircleMenuAdapter extends BaseAdapter {
    List<MenuItem> mMenuItems;

    public CircleMenuAdapter(List<MenuItem> menuItems) {
        mMenuItems = menuItems;
    }

    @Override
    public int getCount() {
        return mMenuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mMenuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // 加载菜单项布局，并且初始化每个菜单
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        View itemView = mInflater.inflate(R.layout.circle_menu_item, parent, false);
        initMenuItem(itemView, position);
        return itemView;
    }

    // 初始化菜单项
    private void initMenuItem(View itemView, int position) {
        // 获取数据项
        final MenuItem item = (MenuItem) getItem(position);
        ImageView iv = (ImageView) itemView
                .findViewById(R.id.id_circle_menu_item_image);
        TextView tv = (TextView) itemView
                .findViewById(R.id.id_circle_menu_item_text);
        // 数据绑定
        iv.setImageResource(item.imageId);
        iv.setVisibility(View.VISIBLE);
        tv.setText(item.title);
        tv.setVisibility(View.VISIBLE);
    }
    // 省略获取item count等代码


}
