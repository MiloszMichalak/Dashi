package com.menene.dashi.navigation.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RegisterScreen(navController: NavHostController) {
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
                val confirmPassword = mutableStateOf("")

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
                OutlinedTextField(
                    value = confirmPassword.value,
                    onValueChange = {
                        confirmPassword.value = it
                    },
                    label = { Text("Confirm Password") }
                )

                Button(
                    onClick = {},
                ) {
                    Text(text = "register")
                }
                Text(text = "login",
                    modifier = Modifier.onClick(
                        onClick = {
                            navController.navigate(Screen.Login) // Navigate to login screen
                        }
                    ))
            }
        }
    }
}