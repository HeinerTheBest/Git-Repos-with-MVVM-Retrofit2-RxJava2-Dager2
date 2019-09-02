package com.mobileapps.mvvmdaggar2rxjava2retrofit2example.di.module;

import com.mobileapps.mvvmdaggar2rxjava2retrofit2example.ui.main.MainActivity;

import dagger.android.ContributesAndroidInjector;

public abstract class ActivityBindingModule
{
    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
