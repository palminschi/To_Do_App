package com.palmdev.to_do_app.data.repository

import com.palmdev.to_do_app.data.ToDoDao
import com.palmdev.to_do_app.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepositoryImpl@Inject constructor(private val toDoDao: ToDoDao) : ToDoRepository {

    override val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    override val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    override val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    override fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    override suspend fun addTask(task: ToDoTask){
        toDoDao.addTask(task)
    }

    override suspend fun updateTask(task: ToDoTask){
        toDoDao.updateTask(task)
    }

    override suspend fun deleteTask(task: ToDoTask){
        toDoDao.deleteTask(task)
    }

    override suspend fun deleteAllTasks(){
        toDoDao.deleteAllTasks()
    }

    override fun searchTask(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchTask(searchQuery = searchQuery)
    }
}