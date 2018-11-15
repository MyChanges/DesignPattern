package zp.app;

import android.app.Application;

/**
 * Created by change on 2018/11/15.
 */

public class App extends Application {
    private static App sContext;
    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }

    public static App getInstance() {
        return sContext;
    }
}
