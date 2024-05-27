package com.example.e_commerce.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.e_commerce.components.Footer
import com.example.e_commerce.components.GoBackHeader

@Composable
fun OfferScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            GoBackHeader(title = "Offer", navController)
        }
        Divider(color = Color.Gray, thickness = 0.5.dp)
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .height(80.dp)
                        .background(color = Color.Blue)
                ){
                    Column(
                        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                    ) {
                        Text(text = "Use BUZANK Cupon For", color = Color.White)
                        Text(text = "Get 90% Off", color = Color.White)
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .height(160.dp)
                        .clickable { navController.navigate("flashSale") }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.product_shirts),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier.padding(top = 20.dp, start = 16.dp)
                    ) {
                        Text(
                            text = "Super Flash Sale",
                            fontWeight = FontWeight.Bold,
                            fontSize = 28.sp,
                            color = Color.White,
                            lineHeight = 28.sp
                        )
                        Text(
                            text = "50% Off",
                            fontWeight = FontWeight.Bold,
                            fontSize = 28.sp,
                            color = Color.White,
                            lineHeight = 28.sp
                        )
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .height(160.dp)
                        .clickable { navController.navigate("megaSale") }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.product_sepatu),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Column(
                        modifier = Modifier.padding(top = 20.dp, start = 16.dp)
                    ) {
                        Text(
                            text = "90% Off Super Mega Sale",
                            fontWeight = FontWeight.Bold,
                            fontSize = 28.sp,
                            color = Color.White,
                            lineHeight = 28.sp
                        )
                        Text(
                            text = "Happy Birthday Lafyuu",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
        Footer(navController)
    }
}