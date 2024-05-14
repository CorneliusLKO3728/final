package com.example.wazitoecommerce.ui.theme.screens.splash





import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.SIGNUP_URL

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashSC : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashSC()
            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(2000)
            }
        }
    }
}

@Composable
fun Splashsc(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan) ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        navController.navigate(SIGNUP_URL)

        Image(painter = painterResource(id = R.drawable.play), contentDescription ="tiktok",
            modifier = Modifier
                .size(150.dp)
            ,
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "ENTERTAINMENTEX",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(40.dp)
            ,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)


    }

}
@Preview(showBackground = true)
@Composable
fun SplashscPreview(){
    Splashsc(navController = rememberNavController())

}