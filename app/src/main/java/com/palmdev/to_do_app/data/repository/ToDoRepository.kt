package com.palmdev.to_do_app.data.repository

import com.palmdev.to_do_app.data.ToDoDao
import com.palmdev.to_do_app.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository@Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(task: ToDoTask){
        toDoDao.addTask(task)
    }

    suspend fun updateTask(task: ToDoTask){
        toDoDao.updateTask(task)
    }

    suspend fun deleteTask(task: ToDoTask){
        toDoDao.deleteTask(task)
    }

    suspend fun deleteAllTasks(){
        toDoDao.deleteAllTasks()
    }

    fun searchTask(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchTask(searchQuery = searchQuery)
    }
}