package com.example.myapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

context (NestedNavGraphBuilder)
@Composable
inline fun <reified VM : ViewModel> sharedViewModel(
    navController: NavController,
    navBackStackEntry: NavBackStackEntry,
): VM {
    val viewModelStoreOwner = remember(navBackStackEntry) {
        navController.getBackStackEntry(route)
    }

    return TODO("blob of code")
}

@Stable
data class NestedNavGraphBuilder(
    val route: String,
)
