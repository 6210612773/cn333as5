package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,




) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Father", "0905431230", false, false, 1, false),
            ContactDbModel(2, "Mother", "0959873210", false, false, 1, false),
            ContactDbModel(3, "Sister", "0694451212", false, false, 1, false),
            ContactDbModel(4, "Bob", "0937577577", false, false, 2, false),
            ContactDbModel(5, "Mark", "0878787878", false, false, 2, false),
            ContactDbModel(6, "Oliver", "0999999990", false, false, 3, false),
            ContactDbModel(7, "Roger", "0999999990", false, false, 3, false),
            ContactDbModel(8, "Philip", "0999999990", false, false, 3, false),
            ContactDbModel(9, "KFC", "0912345678", false, false, 4, false),
            ContactDbModel(10, "Peter's Shop", "0912345678", false, false, 4, false),
            ContactDbModel(11, "Police", "191", false, false, 5, false),
            ContactDbModel(12, "Fire fighter", "199", false, false, 5, false),
            ContactDbModel(13, "Hospital", "1699", false, false, 5, false),
        )
    }
}


