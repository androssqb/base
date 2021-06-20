package com.andross.baseproject

import android.app.Application
import com.andross.baseproject.di.component.DaggerAppComponent
import com.andross.baseproject.logging.PrettyLoggingTree
import com.andross.data.di.component.DaggerDataComponent
import com.andross.data.di.component.DataComponent
import com.andross.presentation.di.component.DaggerPresentationComponent
import com.andross.presentation.di.component.PresentationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initAppComponent()
    }

    private fun initTimber() {
        Timber.plant(PrettyLoggingTree(context = this))
    }

    private fun initAppComponent() {
        DaggerAppComponent
            .builder()
            .presentationComponent(providePresentationComponent())
            .build()
            .inject(application = this)
    }

    private fun providePresentationComponent(): PresentationComponent {
        return DaggerPresentationComponent
            .builder()
            .dataComponent(provideDataComponent())
            .build()
    }

    private fun provideDataComponent(): DataComponent {
        return DaggerDataComponent
            .builder()
            .context(context = this)
            .build()
    }
}
