package com.example.project.ui.theme.screens.series


import android.content.Intent
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
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.compose.rememberNavController
import com.example.project.ui.theme.screens.signup.Signupsc
import com.example.wazitoecommerce.R


class Assign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Seriesc()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Seriesc() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Home", color = Color.Black) /*TODO*/ },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { "home" }) {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            },

            )

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            androidx.compose.material3.Text(
                text = "Series",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

        }
        //row 1

            //start of column 1
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
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
                            painter = painterResource(id = R.drawable.rolep),
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
                    text = "The story revolves around a girl, traumatized by her past who tries to run but is always followed by something. Amidst all the chaos, she crosses paths with a guy and they set out on a journey of healing.",
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
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Watch")
                        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://ww1.goojara.to/mXnGpd)"))
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
                            painter = painterResource(id = R.drawable.hod),
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
                    text = "House of the Dragon is an American fantasy drama television series created by George R. R. Martin and Ryan Condal for HBO. A prequel to Game of Thrones (2011–2019), it is the second television series in the A Song of Ice and Fire franchise. Condal and Miguel Sapochnik served as the showrunners for the first season.",
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
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Watch")
                        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://www.goojara.to/mdnGBd"))
                    }

                }

            }
            //end of column 2

        //end of row1
        Spacer(modifier = Modifier.height(20.dp))
    }

}

@Composable
@Preview(showBackground = true)
fun SeriescPreview() {
    Seriesc()

}