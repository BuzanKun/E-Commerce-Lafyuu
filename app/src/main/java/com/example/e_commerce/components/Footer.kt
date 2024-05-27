package com.example.e_commerce.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Footer(navController: NavController) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth()
    ) {
        ButtonText(buttonImage = Icons.Outlined.Home, buttonName = "Home", destination = "home", navController)
        ButtonText(buttonImage = Icons.Outlined.Search, buttonName = "Explore", destination = "explore", navController)
        ButtonText(buttonImage = Icons.Outlined.ShoppingCart, buttonName = "Cart", destination = "cart", navController)
        ButtonText(buttonImage = Icons.Outlined.Email, buttonName = "Offer", destination = "offer", navController)
        ButtonText(buttonImage = Icons.Outlined.Person, buttonName = "Account", destination = "account", navController)
    }
}

@Composable
fun ButtonText(buttonImage: ImageVector, buttonName: String, destination: String, navController: NavController) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable { navController.navigate(destination) }
    ) {
        Icon(imageVector = buttonImage, contentDescription = buttonName)
        Text(text = buttonName, fontSize = 12.sp)
    }
}