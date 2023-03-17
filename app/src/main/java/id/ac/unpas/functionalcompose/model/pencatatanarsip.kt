package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class pencatatanarsip(
    @PrimaryKey val id: String,
    val tanggal: String,
    val tipe: String,
    val nomor: String,
    val instansi: String
)
