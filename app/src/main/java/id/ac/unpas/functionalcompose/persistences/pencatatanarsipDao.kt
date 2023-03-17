package id.ac.unpas.functionalcompose.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.pencatatanarsip

@Dao
interface pencatatanarsipDao {
    @Query("SELECT * FROM pencatatanarsip")
    fun loadAll(): LiveData<List<pencatatanarsip>>
    @Query("SELECT * FROM pencatatanarsip WHERE id = :id")
    fun find(id: String): pencatatanarsip?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: pencatatanarsip)
    @Delete
    fun delete(item: pencatatanarsip)
}
