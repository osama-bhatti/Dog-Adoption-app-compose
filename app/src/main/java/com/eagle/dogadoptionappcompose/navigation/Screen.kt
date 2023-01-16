package com.eagle.dogadoptionappcompose.navigation

import com.eagle.dogadoptionappcompose.R

sealed class Screen(val route : String, val resId : Int){
    object Home : Screen("home", R.string.text_home)
    object Details : Screen("details", R.string.text_details)
}
