package com.example.a042_roomdatabase.repository

import com.example.a042_roomdatabase.room.Siswa
import com.example.a042_roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa{
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

