@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package com.example.e_commerce.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.e_commerce.R

@Composable
fun Carousel() {
    val products = listOf(
        R.drawable.product_camera,
        R.drawable.product_glasses,
        R.drawable.product_shirts,
        R.drawable.product_shoes,
        R.drawable.product_toys
    )

    val pagerState = rememberPagerState {products.size}
    Box(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .height(160.dp)
    ){
        HorizontalPager(
            state = pagerState,
            key = {products[it]}
        ) {index ->
            Image(
                painter = painterResource(id = products[index]),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                )
        }
    }

}