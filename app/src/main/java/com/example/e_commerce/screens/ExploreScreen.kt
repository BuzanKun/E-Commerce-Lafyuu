package com.example.e_commerce.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.e_commerce.components.Footer
import com.example.e_commerce.components.SearchHeader

@Composable
fun ExploreScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SearchHeader()
        Column(
            modifier = Modifier.weight(1f)
        ) {

        }
        Footer(navController)
    }
}