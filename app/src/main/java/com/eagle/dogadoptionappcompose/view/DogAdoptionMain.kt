package com.eagle.dogadoptionappcompose.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.eagle.dogadoptionappcompose.data.FakeDogDatabase
import com.eagle.dogadoptionappcompose.navigation.Screen

@Composable
fun DogAdoptionMain(toggleTheme: ()-> Unit){
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route){
       composable(route = Screen.Home.route){
           Home(navController = navController, dogList = FakeDogDatabase.dogList,toggleTheme)
       } 
        
       composable(route = "${Screen.Details.route}/{id}/{title}/{location}", arguments = listOf(navArgument("id"){type = NavType.IntType})){
           Details(navController = navController, id = it.arguments?.getInt("id") ?: 0)
       } 
    }
}