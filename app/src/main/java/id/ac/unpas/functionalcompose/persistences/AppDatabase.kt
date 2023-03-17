package id.ac.unpas.functionalcompose.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.functionalcompose.model.pencatatanarsip

@Database(entities = [pencatatanarsip::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pencatatanarsipDao(): pencatatanarsipDao
}