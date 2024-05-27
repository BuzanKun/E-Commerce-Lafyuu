package com.example.e_commerce.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SearchHeader() {
    var search by remember { mutableStateOf("") }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            label = { Text(text = "Search") },
            leadingIcon = {
                Icon(
                    Icons.Rounded.Search,
                    contentDescription = null
                )
            },
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Rounded.FavoriteBorder, contentDescription = null, modifier = Modifier.size(40.dp))
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Outlined.Notifications, contentDescription = null, modifier = Modifier.size(40.dp))
        }
    }
    Divider(color = Color.Gray, thickness = 0.5.dp)
}