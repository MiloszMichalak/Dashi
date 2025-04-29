 package com.menene.dashi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.menene.dashi.core.navigation.NavGraph
import com.menene.dashi.core.theme.ui.DashiTheme
import dagger.hilt.android.AndroidEntryPoint

 @AndroidEntryPoint
 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DashiTheme {
                val navController = rememberNavController()

                NavGraph(navController)
            }
        }
    }
}
