package com.ahmed.aaoua.twitter.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmed.aaoua.twitter.R


//Start at 9:46 Finish at 10:17
@Composable
fun TopCard() {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color(0x47FFFEFE))
            .background(color = Color(0xFF111111).copy(0.5f)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {


        Column(
            modifier = Modifier
                .padding(vertical = 5.dp, horizontal = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier,
                shape = CircleShape
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0XFF7506B9), Color(0XFF3B07AA))
                            )
                        ),
                    contentAlignment = Alignment.CenterStart,

                    ) {

                    Image(
                        painter = painterResource(id = R.drawable.trump_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp, horizontal = 2.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.elon_musk_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .padding(start = 30.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)

                    )
                    Image(
                        painter = painterResource(id = R.drawable.andrew_tate_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .padding(start = 60.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)

                    )

                    Text(
                        text = "+ 700",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 110.dp, end = 15.dp)
                    )
                }
            }

            Text(
                text = "Money must be made...",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                ),
            )
        }

        Column(
            modifier = Modifier
                .padding(vertical = 5.dp, horizontal = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier,
                shape = CircleShape
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0XFF7506B9), Color(0XFF3B07AA))
                            )
                        ),
                    contentAlignment = Alignment.CenterStart,

                    ) {

                    Image(
                        painter = painterResource(id = R.drawable.adrien_bordy_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp, horizontal = 2.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.messi_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .padding(start = 30.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)

                    )
                    Image(
                        painter = painterResource(id = R.drawable.nina_semone_profile),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .padding(start = 60.dp)
                            .size(43.dp, 43.dp)
                            .clip(CircleShape)
                            .border(width = 1.dp, color = Color(0xFF000000), shape = CircleShape)

                    )

                    Text(
                        text = "+ 200",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .padding(start = 110.dp, end = 15.dp)
                    )
                }
            }

            Text(
                text = "How design for the...",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                ),
            )
        }
    }
}