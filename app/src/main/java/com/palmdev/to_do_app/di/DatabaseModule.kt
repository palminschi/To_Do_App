package com.palmdev.to_do_app.di

import android.content.Context
import androidx.room.Room
import com.palmdev.to_do_app.data.ToDoDatabase
import com.palmdev.to_do_app.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        ToDoDatabase::class.java,
        Constants.DATABASE_NAME
    )

    @Singleton
    @Provides
    fun provideDao(database: ToDoDatabase) = database.toDoDao()

}