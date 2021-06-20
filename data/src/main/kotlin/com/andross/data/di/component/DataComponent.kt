package com.andross.data.di.component

import android.content.Context
import com.andross.data.di.DataScope
import dagger.BindsInstance
import dagger.Component

@Component
@DataScope
interface DataComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): DataComponent
    }
}
