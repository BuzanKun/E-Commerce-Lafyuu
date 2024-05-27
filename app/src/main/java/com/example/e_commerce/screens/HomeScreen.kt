package com.example.e_commerce.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.e_commerce.components.Carousel
import com.example.e_commerce.components.CategoryDivider
import com.example.e_commerce.components.Footer
import com.example.e_commerce.components.SearchHeader

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SearchHeader()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.verticalScroll(rememberScrollState())
                .weight(1f)
        ) {
            Carousel()
            CategoryDivider(name = "Category", destination = "category", navController)
            CategoryDivider(name = "Flash Sale", destination = "flashSale", navController)
            CategoryDivider(name = "Mega Sale", destination = "megaSale", navController)
        }
        Footer(navController)
    }
}