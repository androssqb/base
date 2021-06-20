package com.andross.baseproject.di.component

import com.andross.baseproject.App
import com.andross.baseproject.di.ApplicationScope
import com.andross.presentation.di.component.PresentationComponent
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [AndroidInjectionModule::class],
    dependencies = [PresentationComponent::class],
)
@ApplicationScope
interface AppComponent {

    fun inject(application: App)

    @Component.Builder
    interface Builder {

        fun presentationComponent(presentationComponent: PresentationComponent): Builder

        fun build(): AppComponent
    }
}
