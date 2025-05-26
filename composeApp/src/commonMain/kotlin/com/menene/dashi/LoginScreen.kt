package com.menene.dashi.navigation.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.onClick
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.menene.dashi.navigation.Screen
import com.menene.dashi.ui.theme.DashiTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun LoginScreen(navController: NavHostController) {
    DashiTheme {
        Scaffold { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val email = mutableStateOf("")
                val password = mutableStateOf("")

                Text(
                    text = "Dashi",
                    style = MaterialTheme.typography.headlineLarge
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedTextField(
                        value = email.value,
                        onValueChange = {
                            email.value = it
                        }
                    )
                    OutlinedTextField(
                        value = password.value,
                        onValueChange = {
                            password.value = it
                        }
                    )
                }

                Button(
                    onClick = {},
                ) {
                    Text(text = "Login")
                }
                Text(text = "register",
                    modifier = Modifier.onClick(
                        onClick = {
                            navController.navigate(Screen.Register)
                        }
                    ))
            }
        }
    }
}