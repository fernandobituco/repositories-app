package me.bituco.repositories

import android.app.Application
import me.bituco.repositories.data.di.DataModule
import me.bituco.repositories.domain.di.DomainModule
import me.bituco.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}