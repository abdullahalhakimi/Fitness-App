package com.example.fitnessapp.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fitnessapp.ui.activitytracker.ActivityTrackerScreen
import com.example.fitnessapp.ui.home.HomeScreen
import com.example.fitnessapp.ui.BottomNavScreen
import com.example.fitnessapp.ui.profile.ProfileScreen
import com.example.fitnessapp.ui.progressphoto.ProgressPhotoScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val items = listOf(
        BottomNavScreen.Home,
        BottomNavScreen.ActivityTracker,
        BottomNavScreen.ProgressPhoto,
        BottomNavScreen.Profile
    )
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White,
                content = {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    items.forEach { screen ->
                        val selected =
                            currentDestination?.hierarchy?.any { it.route == screen.route } == true
                        NavigationBarItem(
                            icon = {
                                Icon(
                                    painterResource(id = if (selected) screen.iconSelected else screen.iconUnSelected),
                                    contentDescription = "",
                                    tint = Color.Unspecified,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )
                            },
                            colors = NavigationBarItemDefaults.colors(
                                indicatorColor = White
                            ),
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    // Pop up to the start destination of the graph to
                                    // avoid building up a large stack of destinations
                                    // on the back stack as users select items
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    // Avoid multiple copies of the same destination when
                                    // reelecting the same item
                                    launchSingleTop = true
                                    // Restore state when reelecting a previously selected item
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = BottomNavScreen.Home.route,
            Modifier.padding(innerPadding)
        ) {
            composable(BottomNavScreen.Home.route) { HomeScreen() }
            composable(BottomNavScreen.ActivityTracker.route) { ActivityTrackerScreen() }
            composable(BottomNavScreen.ProgressPhoto.route) { ProgressPhotoScreen() }
            composable(BottomNavScreen.Profile.route) { ProfileScreen() }
        }
    }
}