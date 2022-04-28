package com.example.kmmtest.android.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmmtest.android.MainScreen
import com.example.kmmtest.android.ui.screens.detail.DetailScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController=navController,
        startDestination=NavItem.Main.route
    ){
        composable("main"){
            MainScreen{mediaItem->
                navController.navigate(NavItem.Detail.createNavRoute(mediaItem.id))
            }
        }
        composable(
            route = NavItem.Detail.route,
            arguments = NavItem.Detail.args
        ){backStackEntry->
            val id = backStackEntry.arguments?.getInt(NavArg.MediaId.key)
            requireNotNull (id)
            DetailScreen(
                mediaId=id,
                onUpClick = {navController.popBackStack()}
            )
        }
    }
}