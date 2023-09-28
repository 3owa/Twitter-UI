package com.ahmed.aaoua.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ahmed.aaoua.twitter.R
import com.ahmed.aaoua.twitter.ui.theme.BlueColor


//Start at 9:38 Finish at 9:42
@Composable
fun AppBar() {

    Row(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(id = R.drawable.myprofile),
            contentDescription = "image description",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(23.dp,23.dp)
                .clip(CircleShape)
        )

        Icon(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "image description",
            tint = BlueColor,
            modifier = Modifier
                .padding(1.dp)
                .size(23.dp,23.dp)
        )


        Icon(
            painter = painterResource(id = R.drawable.sparks),
            contentDescription = "image description",
            tint = Color.White,
            modifier = Modifier
                .padding(1.dp)
                .size(23.dp,23.dp)
        )
    }
}