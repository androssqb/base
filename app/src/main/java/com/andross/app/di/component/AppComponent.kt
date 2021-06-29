package com.andross.app.di.component

import com.andross.app.di.scope.ApplicationScope
import com.andross.data.di.component.DataComponent
import dagger.Component

@Component(
    dependencies = [DataComponent::class],
)
@ApplicationScope
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun dataComponent(dataComponent: DataComponent): Builder

        fun build(): AppComponent
    }
}
