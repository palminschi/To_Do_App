package com.palmdev.to_do_app.data.repository

import com.palmdev.to_do_app.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

interface ToDoRepository {

    val getAllTasks: Flow<List<ToDoTask>>
    val sortByLowPriority: Flow<List<ToDoTask>>
    val sortByHighPriority: Flow<List<ToDoTask>>

    fun getSelectedTask(taskId: Int): Flow<ToDoTask>

    suspend fun addTask(task: ToDoTask)

    suspend fun updateTask(task: ToDoTask)

    suspend fun deleteTask(task: ToDoTask)

    suspend fun deleteAllTasks()

    fun searchTask(searchQuery: String): Flow<List<ToDoTask>>
}