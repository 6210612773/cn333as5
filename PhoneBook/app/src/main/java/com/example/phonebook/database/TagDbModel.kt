package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#FADAE0","Family"),
            TagDbModel(2, "#FFFDC2","Friend"),
            TagDbModel(3, "#00B8FF","Work"),
            TagDbModel(4, "#EB8C00","Shop&Business"),
            TagDbModel(5,"#A32020","Emergency")

        )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}
