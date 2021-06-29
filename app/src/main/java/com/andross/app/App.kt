package com.andross.app

import android.app.Application
import com.andross.app.di.component.AppComponent
import com.andross.app.di.component.DaggerAppComponent
import com.andross.app.logging.PrettyLoggingTree
import com.andross.data.di.component.DaggerDataComponent
import com.andross.data.di.component.DataComponent
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initTimber()
        initAppComponent()
    }

    private fun initTimber() {
        Timber.plant(PrettyLoggingTree(context = this))
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent
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
