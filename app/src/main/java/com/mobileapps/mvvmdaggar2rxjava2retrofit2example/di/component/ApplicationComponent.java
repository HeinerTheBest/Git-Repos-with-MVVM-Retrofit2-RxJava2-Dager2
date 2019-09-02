package com.mobileapps.mvvmdaggar2rxjava2retrofit2example.di.component;

import android.app.Application;

import com.mobileapps.mvvmdaggar2rxjava2retrofit2example.base.BaseApplication;
import com.mobileapps.mvvmdaggar2rxjava2retrofit2example.di.module.ActivityBindingModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ContextModule.class, ApplicationModule.class, AndroidSupportInjectionModule.class, ActivityBindingModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerApplication>
{
    void inject(BaseApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        ApplicationComponent build();
    }
}
