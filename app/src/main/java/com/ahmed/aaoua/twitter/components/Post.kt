package com.ahmed.aaoua.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmed.aaoua.twitter.PostModel
import com.ahmed.aaoua.twitter.R


//54min
@Composable
fun Post(post:PostModel) {

    Column(
        modifier = Modifier
            .padding(top = 5.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(id = post.userImage),
                contentDescription = "image description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(66.dp)
            )

            Column(
                modifier = Modifier
                    .padding(start = 4.dp)
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = post.name,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )

                    Image(
                        painter = painterResource(id = R.drawable.tick_icon),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                            .size(15.dp, 15.dp)
                    )

                    Text(
                        text = post.userName,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFA7A4A4),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = post.time,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFA7A4A4),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(horizontal = 2.dp)
                    )

                }

                Text(
                    text = post.description,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Text(
                    text = post.url,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(300),
                        color = Color(0xFF1EA1F1),
                    ),
                    modifier = Modifier
                        .padding(vertical = 2.dp)
                )

                Image(
                    painter = painterResource(id = post.image),
                    contentDescription = "image description",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .width(288.dp)
                        .height(148.dp)
                )

                Row(
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .width(250.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.comment),
                            contentDescription = "image description",
                            tint = Color(0XFF8899A6),
                            modifier = Modifier
                                .size(16.dp,16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = post.comments,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(300),
                                color = Color(0xFF8899A6),
                            )
                        )
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.options),
                            contentDescription = "image description",
                            tint = Color(0XFF8899A6),
                            modifier = Modifier
                                .size(16.dp,16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = post.options,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(300),
                                color = Color(0xFF8899A6),
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.heart),
                            contentDescription = "image description",
                            tint = Color(0XFF8899A6),
                            modifier = Modifier
                                .size(16.dp,16.dp)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = post.heart,
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(300),
                                color = Color(0xFF8899A6),
                            )
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.save),
                            contentDescription = "image description",
                            tint = Color(0XFF8899A6),
                            modifier = Modifier
                                .size(16.dp,16.dp)
                        )
                    }
                }
            }

            Icon(
                painter = painterResource(id = R.drawable.more_hor),
                contentDescription = "image description",
                tint = Color(0XFF7B8086),
                modifier = Modifier
                    .size(13.dp, 13.dp)
            )

        }

        Row(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(66.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = post.userImage),
                    contentDescription = "image description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(45.dp)
                )
            }

            Text(
                text = "Show this thread",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF1EA1F1),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
        }

        Spacer(modifier = Modifier
            .padding(top = 7.dp)
            .height(1.dp)
            .fillMaxWidth()
            .background(color = Color(0x47C4C4C4))
        )
    }
}