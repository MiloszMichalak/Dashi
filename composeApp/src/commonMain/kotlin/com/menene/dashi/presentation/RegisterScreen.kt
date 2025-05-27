package com.menene.dashi.navigation.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.onClick
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.menene.dashi.components.EmailTextField
import com.menene.dashi.components.PasswordTextField
import com.menene.dashi.presentation.navigation.Screen
import com.menene.dashi.presentation.theme.DashiTheme
import dashi.composeapp.generated.resources.Res
import dashi.composeapp.generated.resources.confirm_password

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
                    EmailTextField(
                        email = email.value,
                        onEmailChange = {
                            email.value = it
                        }
                    )
                    PasswordTextField(
                        password = password.value,
                        onPasswordChange = {
                            password.value = it
                        }
                    )
                    PasswordTextField(
                        password = confirmPassword.value,
                        onPasswordChange = {
                            confirmPassword.value = it
                        },
                        placeholder = Res.string.confirm_password
                    )
                }

                Button(
                    onClick = {},
                ) {
                    Text(text = "register")
                }
                Text(text = "login",
                    modifier = Modifier.onClick(
                        onClick = {
                            navController.navigate(Screen.Login)
                        }
                    ))
            }
        }
    }
}