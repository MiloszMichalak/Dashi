package com.menene.dashi.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

@Composable
fun ShadowColumn(
    content: @Composable () -> Unit
){
    Column(
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                spotColor = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            .padding(50.dp, 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        content()
    }
}