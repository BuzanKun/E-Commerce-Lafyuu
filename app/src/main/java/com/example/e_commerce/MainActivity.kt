package com.example.e_commerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce.screens.AccountScreen
import com.example.e_commerce.screens.CartScreen
import com.example.e_commerce.screens.CategoryScreen
import com.example.e_commerce.screens.ExploreScreen
import com.example.e_commerce.screens.FlashSaleScreen
import com.example.e_commerce.screens.HomeScreen
import com.example.e_commerce.screens.LoginScreen
import com.example.e_commerce.screens.MegaSaleScreen
import com.example.e_commerce.screens.OfferScreen
import com.example.e_commerce.screens.RegisterScreen
import com.example.e_commerce.ui.theme.ECommerceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ECommerceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ECommerceApp()
                }
            }
        }
    }
}

@Composable
fun ECommerceApp() {
    val navController = rememberNavController()

    val startDestination = "login"
    NavHost(navController = navController, startDestination = startDestination) {
        composable("login") { LoginScreen(navController = navController)}
        composable("register") { RegisterScreen(navController = navController)}
        composable("home") { HomeScreen(navController = navController)}
        composable("flashSale") { FlashSaleScreen(navController = navController)}
        composable("megaSale") { MegaSaleScreen(navController = navController)}
        composable("category") { CategoryScreen(navController = navController)}
        composable("explore") { ExploreScreen(navController = navController)}
        composable("cart") { CartScreen(navController = navController)}
        composable("offer") { OfferScreen(navController = navController)}
        composable("account") { AccountScreen(navController = navController)}
    }
}