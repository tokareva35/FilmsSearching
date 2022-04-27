package kz.tokarev.myapplication.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import kz.tokarev.myapplication.data.Entity.Film
import kz.tokarev.myapplication.data.dao.FilmDao

@Database(entities = [Film::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}