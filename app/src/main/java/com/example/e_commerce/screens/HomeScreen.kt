package com.example.e_commerce.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.e_commerce.components.Carousel
import com.example.e_commerce.components.CategoryDivider
import com.example.e_commerce.components.Header

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Header()
        Divider(color = Color.Gray, thickness = 0.5.dp)
        Carousel()
        CategoryDivider(name = "Category", destination = "category", navController)
        CategoryDivider(name = "Flash Sale", destination = "flashSale", navController)
        CategoryDivider(name = "Mega Sale", destination = "megaSale", navController)

    }
}