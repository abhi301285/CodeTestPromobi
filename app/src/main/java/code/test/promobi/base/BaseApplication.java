package code.test.promobi.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import code.test.promobi.di.component.ApplicationComponent;
import code.test.promobi.di.component.DaggerApplicationComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);

        return component;
    }
}
