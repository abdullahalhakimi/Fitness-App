package com.example.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnessapp.ui.Screen
import com.example.fitnessapp.ui.choosegoal.ChooseGoalScreen
import com.aravind.composefitnessapp.ui.screen.completeprofile.CompleteProfileScreen
import com.example.fitnessapp.ui.getstarted.GetStartedScreen
import com.example.fitnessapp.ui.login.LoginScreen
import com.example.fitnessapp.ui.main.MainScreen
import com.example.fitnessapp.ui.onboarding.OnBoardingScreen
import com.example.fitnessapp.ui.registeruser.RegisterUserScreen
import com.example.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FitnessAppTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.GetStarted.route
                ) {
                    composable(Screen.GetStarted.route) {
                        GetStartedScreen(onGetStarted = { navController.navigate(Screen.OnBoarding.route) })
                    }
                    composable(Screen.OnBoarding.route) {
                        OnBoardingScreen(onBoardingFinished = { navController.navigate(Screen.RegisterUser.route) })
                    }
                    composable(Screen.RegisterUser.route) {
                        RegisterUserScreen(
                            onRegisterSuccess = { navController.navigate(Screen.CompleteProfile.route) },
                            onLoginClick = { navController.navigate(Screen.LoginScreen.route) },
                        )
                    }
                    composable(Screen.LoginScreen.route) {
                        LoginScreen(
                            onLoginSuccess = { navController.navigate(Screen.CompleteProfile.route) },
                            onRegisterClick = { navController.navigate(Screen.RegisterUser.route) },
                        )
                    }
                    composable(Screen.CompleteProfile.route) {
                        CompleteProfileScreen(onCompleteProfile = { navController.navigate(Screen.ChooseGoal.route) })
                    }
                    composable(Screen.ChooseGoal.route) {
                        ChooseGoalScreen(onGoalConfirmed = { navController.navigate(Screen.Main.route) })
                    }
                    composable(Screen.Main.route) {
                        MainScreen()
                    }
                }
            }
        }
    }
}