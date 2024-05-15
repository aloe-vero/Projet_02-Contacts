package com.example.projet_02_contacts.ui.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UnContact(nom: String, prenom: String, modifier: Modifier = Modifier){

    Card( modifier = modifier
        .padding(8.dp)
        .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Row {

            IconContact()


            Text(
                text = nom,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = prenom,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(4.dp)
            )
        }
    }



}

@Composable
fun IconContact(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Filled.Face,
        tint = MaterialTheme.colorScheme.secondary,
        contentDescription = "face",
        modifier = Modifier
            .size(72.dp)
            .padding(4.dp)
    )
}
