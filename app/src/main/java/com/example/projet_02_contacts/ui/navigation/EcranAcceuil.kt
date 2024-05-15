package com.example.projet_02_contacts.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.projet_02_contacts.ui.composable.UnContact

@Composable
 fun EcranAccueil(
     toContactInformation: () -> Unit,
     toCreationContact: () -> Unit,
     toModificationContact: () -> Unit,
     modifier: Modifier = Modifier
     ) {
         UnContact("Gill", "Stephane", modifier)
         UnContact("Lamoureux", "Isabelle", modifier)
         Spacer(modifier = modifier.height(10.dp))

     }