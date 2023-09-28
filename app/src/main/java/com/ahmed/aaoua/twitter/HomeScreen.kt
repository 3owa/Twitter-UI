package com.ahmed.aaoua.twitter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ahmed.aaoua.twitter.components.AppBar
import com.ahmed.aaoua.twitter.components.CustomBottomBar
import com.ahmed.aaoua.twitter.components.FloatingActionButton
import com.ahmed.aaoua.twitter.components.Post
import com.ahmed.aaoua.twitter.components.TopCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val posts = listOf<PostModel>(
        PostModel(
            "upwork",
            "@Upwork",
            "51m",
            "Ahmed Aaoua is diving deep into advanced Android development, exploring cutting-edge features and optimizing performance.",
            "github.com/3owa",
            R.drawable.upwork_icon,
            "900",
            "8.4 K",
            "5.3 K",
            R.drawable.post_image
        ),

        PostModel(
            "Andrew Tate",
            "@CobraTate",
            "3h",
            "Watch TateConfidential on Rumble",
            "rumble.com/c/tateconfidential",
            R.drawable.andrew_tate_profile,
            "1.3 K",
            "58.4 K",
            "125.3 K",
            R.drawable.andrew_post
        ),
        PostModel(
            "J.Trump",
            "@realDonaldTrump",
            "Aug 25",
            "",
            "DONALDJTRUMP.COM",
            R.drawable.trump_profile,
            "12.3 K",
            "230.4 K",
            "340.3 K",
            R.drawable.trump_post
        ),
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = Color.Black,
        topBar = { AppBar()},
        bottomBar = { CustomBottomBar()},
        floatingActionButton = { FloatingActionButton() }
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ){

                item {
                    TopCard()
                }


                items(posts){post->
                    Post(post)
                }
            }

        }
    }
}
