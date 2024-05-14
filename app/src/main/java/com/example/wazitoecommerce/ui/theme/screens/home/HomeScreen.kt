package com.example.project.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ANIME_URL
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.MOVIES_URL
import com.example.wazitoecommerce.navigation.SERIES_URL

class Assign : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homesc(navController = rememberNavController())

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Homesc(navController:NavHostController){
    Column (modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Home", color = Color.Black) /*TODO*/ },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { navController.navigate(HOME_URL) }) {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Home",
                        tint = Color.Red
                    )
                }
            },

            )
        //End of topappbar
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            androidx.compose.material3.Text(
                text = " ",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))


            //row 1

            //start of column 1

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
                        painter = painterResource(id = R.drawable.elite),
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
                text = "MOVIES",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Button(onClick = { navController.navigate(MOVIES_URL) }) {
                Text(text = "MORE MOVIE CONTENT")
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
                        painter = painterResource(id = R.drawable.mcu),
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
                text = "SERIES",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Button(onClick = { navController.navigate(SERIES_URL) }) {
                Text(text = "MORE SERIES CONTENT")

            }
            Spacer(modifier = Modifier.height(5.dp))


            //end of column 2

            //end of row1
            Spacer(modifier = Modifier.height(20.dp))


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
                        painter = painterResource(id = R.drawable.animep),
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
                text = "ANIME",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Button(onClick = { navController.navigate(ANIME_URL) }) {
                Text(text = "MORE ANIME CONTENT")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomescPreview(){
    Homesc(navController = rememberNavController())

}