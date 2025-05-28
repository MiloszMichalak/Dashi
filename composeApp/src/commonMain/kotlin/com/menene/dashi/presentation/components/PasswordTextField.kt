package com.menene.dashi.presentation.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import dashi.composeapp.generated.resources.Res
import dashi.composeapp.generated.resources.password
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun PasswordTextField(
    password: String,
    onPasswordChange: (String) -> Unit,
    placeholder: StringResource = Res.string.password
) {
    OutlinedTextField(
        value = password,
        onValueChange = onPasswordChange,
        placeholder = { Text(stringResource(placeholder)) },
        keyboardOptions = KeyboardOptions.Default.copy(
            autoCorrectEnabled = false,
            imeAction = ImeAction.Next,
            keyboardType = KeyboardType.Password
        ),
        singleLine = true
    )
}