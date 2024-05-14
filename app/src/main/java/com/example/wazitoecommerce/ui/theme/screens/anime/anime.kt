package com.example.wazitoecommerce.ui.theme.screens.anime



import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.HOME_URL


class Assign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Animesc()

        }
    }
}

fun startActivity(intent: Intent) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Animesc() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Home", color = Color.Black) /*TODO*/ },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { HOME_URL }) {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            },

            )

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            androidx.compose.material3.Text(
                text = "Recently Released Anime",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

        }
        //row 1

        //start of column 1
        Column(
            modifier = Modifier.padding(start = 10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.op),
                        contentDescription = "destination",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favourite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
            }
            Text(
                text = "ONE PIECE is a legendary high-seas quest unlike any other. Luffy is a young adventurer who has longed for a life of freedom ever since he can remember. He sets off from his small village on a perilous journey to find the legendary fabled treasure, ONE PIECE, to become King of the Pirates!",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "star",)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star",)
            }
            Text(
                text = "443 reviewers",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Black,
            )

            Row() {
                Button(onClick = {
                    val intent = Intent(
                        Intent.ACTION_VIEW,
                        android.net.Uri.parse("https://animesuge.to/anime/one-piece-ov8")
                    )
                }) {
                    Text(text = "Watch")


                }
            }


            //end of column 1
            Spacer(modifier = Modifier.width(40.dp))


            //start of column 2

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hashira),
                        contentDescription = "destination",
                        modifier = Modifier.fillMaxSize(),

                        )
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "favourite",
                        tint = Color.White,
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(15.dp)
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
            }
            Text(
                text = "In the Hashira Training Arc, Tanjiro, Zenitsu, and Inosuke undergo rigorous training with the Hashira to become stronger and prepare for their final battle against Muzan Kibutsuji",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = Color.Blue
                )
                Icon(imageVector = Icons.Default.Star, contentDescription = "star",)
                Icon(imageVector = Icons.Default.Star, contentDescription = "star",)
            }
            Text(
                text = "443 reviewers",
                fontFamily = FontFamily.Serif,
                fontSize = 15.sp,
                color = Color.Black,
            )

            Row() {
                Button(
                    onClick = {
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse("https://animesuge.to/anime/one-piece-ov8")
                        }
                        startActivity(intent)
                    }
                ) {
                    Text("Watch")
                }

            }
            //end of column 2
        }
        //end of row1
        Spacer(modifier = Modifier.height(20.dp))
    }
}



@Composable
@Preview(showBackground = true)
fun AnimescPreview() {
    Animesc()

}