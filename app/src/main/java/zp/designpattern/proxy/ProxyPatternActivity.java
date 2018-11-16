package zp.designpattern.proxy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Proxy;

/**
 * Created by change on 2018/11/15.
 * 代理模式(静态代理)
 */
public class ProxyPatternActivity extends AppCompatActivity {
    //每次要在接口中添加一个新方法，则需要在目标对象中实现这个方法，并且在代理对象中实现相应的代理方法
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("代理模式");
        setContentView(textView);
    }

    public static void main(String[] str) {
        // 静态代理
//        UserDao userDao = new UserDao();
//        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
//        userDaoProxy.add();
//        userDaoProxy.delete();

        // 动态代理
        UserDao userDao1 = new UserDao();
        // 构建一个动态代理
  /*      ClassLoader loader表示当前使用到的appClassloader。
        Class<?>[] interfaces表示目标对象实现的一组接口。
        InvocationHandler h表示当前的InvocationHandler实现实例对象。*/
        DynamicProxy proxy = new DynamicProxy(userDao1);
        ClassLoader loader = userDao1.getClass().getClassLoader();
        IDaoInterface daoInterface  = (IDaoInterface) Proxy.newProxyInstance(loader,new Class[] {IDaoInterface.class},proxy);
        daoInterface.add();
        daoInterface.delete();



    }

}
