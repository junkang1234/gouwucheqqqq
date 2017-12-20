package lenovo.example.com.gouwucheqqqq;


import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Lenovo on 2017/12/20.
 */

public class MyApp extends Application {
//    @Override
//    public void onCreate() {
//        Fresco.initialize(this);
//    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}