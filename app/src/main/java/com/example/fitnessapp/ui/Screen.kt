package com.example.fitnessapp.ui

sealed class Screen(val route: String){
    object GetStarted : Screen("getStarted")
    object OnBoarding : Screen("onBoarding")
    object RegisterUser : Screen("registerUser")
    object LoginScreen : Screen("LoginScreen")
    object CompleteProfile : Screen("completeProfile")
    object ChooseGoal : Screen("chooseGoal")
    object Main : Screen("main")

}
