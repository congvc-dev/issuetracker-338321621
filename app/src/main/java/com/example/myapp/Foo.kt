package com.example.myapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.ramcosta.composedestinations.scope.NavGraphBuilderDestinationScope
import com.ramcosta.composedestinations.spec.NavGraphSpec

context (NestedNavGraphBuilder)
@Composable
inline fun <reified VM : ViewModel> NavGraphBuilderDestinationScope<*>.sharedViewModel(
    navController: NavController,
): VM {
    val viewModelStoreOwner = remember(navBackStackEntry) {
        navController.getBackStackEntry(parent.route)
    }

    return TODO("blob of code")
}

@Stable
data class NestedNavGraphBuilder(
    val navGraphBuilder: NavGraphBuilder,
    val parent: NavGraphSpec,
)
