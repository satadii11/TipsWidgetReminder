package io.github.golok56.tipswidgetreminder;

import android.app.Application;

import timber.log.Timber;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
