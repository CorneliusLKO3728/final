package com.example.project.ui.theme.screens.movies
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project.ui.theme.screens.signup.Signupsc
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL


class Assign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Moviesc(navController = rememberNavController())

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Moviesc(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Home", color = Color.Black) /*TODO*/ },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { navController.navigate(HOME_URL) }) {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            },

        )
        
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            androidx.compose.material3.Text(
                text = "Movies",
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
                            painter = painterResource(id = R.drawable.dark),
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
                    text = "Every fall in a small Midwestern town, a supernatural specter named \"Sawtooth Jack\" arises from the cornfields and approaches the town's church, where violent gangs of young boys hungrily await their chance to confront the legendary nightmare in an annual harvest rite of life and death.",
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
                            painter = painterResource(id = R.drawable.gb),
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
                    text = "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started -- the iconic New York City firehouse -- to team up with the original Ghostbusters, who've developed a top-secret research lab to take busting ghosts to the next level.",
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
fun MoviescPreview() {
    Moviesc(navController = rememberNavController())

}