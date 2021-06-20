package com.andross.presentation.di.component

import com.andross.data.di.component.DataComponent
import com.andross.presentation.di.PresentationScope
import dagger.Component

@Component(
    dependencies = [DataComponent::class],
)
@PresentationScope
interface PresentationComponent {

    @Component.Builder
    interface Builder {

        fun dataComponent(dataComponent: DataComponent): Builder

        fun build(): PresentationComponent
    }
}
