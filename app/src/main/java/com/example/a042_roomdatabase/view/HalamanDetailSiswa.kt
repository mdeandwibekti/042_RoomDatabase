package com.example.a042_roomdatabase.view

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a042_roomdatabase.repository.RepositoriSiswa
import com.example.a042_roomdatabase.view.route.DestinasiDetailSiswa
import com.example.a042_roomdatabase.viewmodel.DetailSiswa
import com.example.a042_roomdatabase.viewmodel.toDetailSiswa
import com.example.a042_roomdatabase.viewmodel.toSiswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn


class DetailViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel() {

}