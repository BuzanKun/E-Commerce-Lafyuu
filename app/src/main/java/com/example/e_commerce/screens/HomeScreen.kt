package com.example.e_commerce.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.e_commerce.R
import com.example.e_commerce.components.Carousel
import com.example.e_commerce.components.CategoryDivider
import com.example.e_commerce.components.Footer
import com.example.e_commerce.components.ProductListRow
import com.example.e_commerce.components.SearchHeader
import com.example.e_commerce.data.DataProvider.pants
import com.example.e_commerce.data.DataProvider.shirts
import com.example.e_commerce.data.DataProvider.shoes

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        SearchHeader()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f)
        ) {
            Carousel()
            CategoryDivider(name = "Category", destination = "category", navController)
            ProductListRow(products = pants)
            CategoryDivider(name = "Flash Sale", destination = "flashSale", navController)
            ProductListRow(products = shirts)
            CategoryDivider(name = "Mega Sale", destination = "megaSale", navController)
            ProductListRow(products = shoes)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .height(160.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.product_shirts),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Recommended Product",
                        fontWeight = FontWeight.Bold,
                        fontSize = 36.sp,
                        color = Color.White,
                        lineHeight = 36.sp
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "We recommend the best for you", color = Color.White)
                }
            }
        }
        Footer(navController)
    }
}