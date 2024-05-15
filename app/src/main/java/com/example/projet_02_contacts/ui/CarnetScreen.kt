package com.example.projet_02_contacts.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.projet_02_contacts.ui.composable.AddButton
import com.example.projet_02_contacts.ui.composable.UnContact
import com.example.projet_02_contacts.ui.navigation.ContactInformation
import com.example.projet_02_contacts.ui.navigation.EcranAccueil

@Composable
fun CarnetScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            BarreSup()
        },
        floatingActionButton = {
            AddButton()
        }

    ) { innerPadding -> // padding calculated by scaffold
        Column(
            modifier =
            Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues = innerPadding)
        ) {

        }

    }
}
    @Composable
    fun BarreSup(modifier: Modifier = Modifier) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(color = Color.Black),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "mon Carnet",
                style = MaterialTheme.typography.displaySmall,
                color = Color.White
            )

        }
    }


