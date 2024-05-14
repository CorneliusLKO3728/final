package com.example.wazitoecommerce.navigation

import android.graphics.Movie
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.ui.theme.screens.home.Homesc
import com.example.project.ui.theme.screens.login.Loginsc
import com.example.project.ui.theme.screens.movies.Moviesc
import com.example.project.ui.theme.screens.series.Seriesc
import com.example.project.ui.theme.screens.signup.Signupsc
import com.example.wazitoecommerce.ui.theme.screens.anime.Animesc
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.Splashsc

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(SPLASH_URL){
            Splashsc(navController = navController)
        }
        composable(SIGNUP_URL){
            Signupsc(navController = navController)
        }
        composable(LOGIN_URL){
            Loginsc(navController = navController)
        }

        composable(HOME_URL){
            Homesc(navController = navController)
        }
        composable(ANIME_URL){
            Animesc()
        }
        composable(SERIES_URL){
            Seriesc()
        }
        composable(MOVIES_URL){
            Moviesc(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
    }
}