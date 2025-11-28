package com.example.a042_roomdatabase.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a042_roomdatabase.view.EntrySiswaScreen
import com.example.a042_roomdatabase.view.HomeScreen
import com.example.a042_roomdatabase.view.route.DestinasiEntry
import com.example.a042_roomdatabase.view.route.DestinasiHome


@Composable
fun SiswaApp(
    modifier: Modifier = Modifier,
) {
    val navController: NavHostController = rememberNavController()
    HostNavigasi(navController = navController)
}

