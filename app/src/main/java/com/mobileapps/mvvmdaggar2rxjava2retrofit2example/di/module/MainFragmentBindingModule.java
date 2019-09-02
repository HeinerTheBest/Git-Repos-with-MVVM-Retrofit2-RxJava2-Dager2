package com.mobileapps.mvvmdaggar2rxjava2retrofit2example.di.module;

import dagger.android.ContributesAndroidInjector;

public abstract class MainFragmentBindingModule
{
    @ContributesAndroidInjector
    abstract ListFragment provideListFragment();

    @ContributesAndroidInjector
    abstract DetailsFragment provideDetailsFragment();
}
