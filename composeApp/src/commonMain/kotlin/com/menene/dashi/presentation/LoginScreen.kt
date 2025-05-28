package com.menene.dashi.presentation

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
import com.menene.dashi.presentation.components.EmailTextField
import com.menene.dashi.presentation.components.PasswordTextField
import com.menene.dashi.presentation.components.ShadowColumn
import com.menene.dashi.presentation.navigation.Screen
import com.menene.dashi.presentation.theme.DashiTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun LoginScreen(
    navController: NavHostController,
    viewModel: AuthViewModel
    ) {
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


                ShadowColumn {
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
}