package com.menene.dashi.auth.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.hilt.navigation.compose.hiltViewModel
import com.menene.dashi.core.theme.ui.Dimens
import dagger.hilt.android.lifecycle.HiltViewModel
import com.menene.dashi.R

@Composable
fun LoginScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.medium_padding)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val viemodel: LoginViewModel  = hiltViewModel() 
            var email = viemodel.email.value
            var password = viemodel.password.value

            Text(
                modifier = Modifier
                    .padding(bottom = Dimens.large_padding),
                text = "Login to your account",
                style = MaterialTheme.typography.headlineLarge,
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = Dimens.medium_padding),
                value = email,
                onValueChange = { email = it },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = Dimens.large_padding),
                value = password,
                onValueChange = { password = it },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.medium)
            ) {
                Text("Login")
            }
        }
    }
}