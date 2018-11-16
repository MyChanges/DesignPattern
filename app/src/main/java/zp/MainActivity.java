package zp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import zp.designpattern.R;
import zp.designpattern.proxy.ProxyPatternActivity;

/**
 * Created by change on 2018/11/15.
 */
public class MainActivity extends AppCompatActivity {
    private Button mBtnProxyPattern;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initView();
    }

    private void initView() {
        mBtnProxyPattern = findViewById(R.id.btn_proxy_pattern);
    }

    public void proxyPattern(View view) {
        startActivity(new Intent(MainActivity.this, ProxyPatternActivity.class));
        Toast.makeText(this, "点击了代理模式", Toast.LENGTH_SHORT).show();
    }
}
