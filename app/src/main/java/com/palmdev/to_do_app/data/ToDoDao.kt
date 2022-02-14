package com.palmdev.to_do_app.data

import androidx.room.*
import com.palmdev.to_do_app.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {

    @Query("SELECT * FROM to_do_table")
    fun getAllTasks(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM to_do_table WHERE id = :taskId")
    fun getSelectedTask(taskId: Int): Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(task: ToDoTask)

    @Update
    suspend fun updateTask(task: ToDoTask)

    @Delete
    suspend fun deleteTask(task: ToDoTask)

    @Query("DELETE FROM to_do_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM to_do_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchTask(searchQuery: String): Flow<List<ToDoTask>>

    @Query("SELECT * FROM to_do_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM to_do_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END")
    fun sortByHighPriority(): Flow<List<ToDoTask>>
}