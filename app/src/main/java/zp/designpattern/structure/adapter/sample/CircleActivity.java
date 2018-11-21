package zp.designpattern.structure.adapter.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import zp.designpattern.R;
import zp.designpattern.structure.adapter.sample.adapter.CircleMenuAdapter;
import zp.designpattern.structure.adapter.sample.weight.CircleMenuLayout;

/**
 * Created by change on 2018/11/20.
 */

public class CircleActivity extends AppCompatActivity {
    private CircleMenuLayout mCircleMenuLayout;
    private List<MenuItem> itemList = new ArrayList<>();
    private CircleMenuAdapter menuAdapter;
    private ListView mListView;

    private String[] mItemTexts = new String[]{"安全中心 ", "特色服务", "投资理财",
            "转账汇款", "我的账户", "信用卡"};
    private int[] mItemImgs = new int[]{R.mipmap.home_mbank_1_normal,
            R.mipmap.home_mbank_2_normal, R.mipmap.home_mbank_3_normal,
            R.mipmap.home_mbank_4_normal, R.mipmap.home_mbank_5_normal,
            R.mipmap.home_mbank_6_normal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //自已切换布局文件看效果
        setContentView(R.layout.activity_main02);
    //	setContentView(R.layout.activity_main);
        mockMenuItems();
//        mListView = (ListView) findViewById(R.id.menu_list);
//        mListView.setAdapter(new CircleMenuAdapter(itemList));
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(CircleActivity.this,
//                        itemList.get(position).title,
//                        Toast.LENGTH_SHORT).show();
//
//
//            }
//        });

        // 使用适配器模式实现
        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setAdapter(new CircleMenuAdapter(itemList));

        // 原来方式
         //   mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);

        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {

            @Override
            public void itemClick(View view, int pos) {
                MenuItem menuItem = itemList.get(pos);
                Toast.makeText(CircleActivity.this,menuItem.title,
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void itemCenterClick(View view) {
                Toast.makeText(CircleActivity.this,
                        "you can do something just like ccb  ",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void mockMenuItems() {
        MenuItem menuItem1 = new MenuItem("1111", R.mipmap.home_mbank_1_normal);
        MenuItem menuItem2 = new MenuItem("222", R.mipmap.home_mbank_2_normal);
        MenuItem menuItem3 = new MenuItem("3333", R.mipmap.home_mbank_3_normal);
        itemList.add(menuItem1);
        itemList.add(menuItem2);
        itemList.add(menuItem3);

    }


}
