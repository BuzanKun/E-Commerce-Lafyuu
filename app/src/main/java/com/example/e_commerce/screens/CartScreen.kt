package com.example.e_commerce.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_commerce.components.Footer
import com.example.e_commerce.components.GoBackHeader

@Composable
fun CartScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            GoBackHeader(title = "Your Cart", navController)
        }
        Divider(color = Color.Gray, thickness = 0.5.dp)
        Column(
            modifier = Modifier.weight(1f)
        ) {

        }
        Footer(navController)
    }
}