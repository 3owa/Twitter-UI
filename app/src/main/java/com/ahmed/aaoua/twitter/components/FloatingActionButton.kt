package com.ahmed.aaoua.twitter.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ahmed.aaoua.twitter.ui.theme.BlueColor


//2min
@Composable
fun FloatingActionButton() {

    androidx.compose.material3.FloatingActionButton(
        onClick = {},
        containerColor = BlueColor,
        shape = CircleShape
    ) {

        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = "image description",
            tint = Color.White,
            modifier = Modifier
                .padding(1.dp)
                .size(23.dp, 23.dp)
        )

    }
}