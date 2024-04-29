package com.example.projet_02_contacts.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.CatchingPokemon
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Mode
import androidx.compose.material.icons.filled.ReadMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.projet_02_contacts.R

@Composable
fun CarnetScreen(modifier: Modifier = Modifier){
    Scaffold(
         topBar = {
             BarreSup()
             },
         ){ innerPadding -> // padding calculated by scaffold
         Column (modifier =
         Modifier
             .background(MaterialTheme.colorScheme.background)
             .padding(paddingValues = innerPadding)
         ){
             UnContact("Gill", "Stephane", modifier)
             UnContact("Lamoureux", "Isabelle", modifier)
             Spacer(modifier = modifier.height(10.dp))
             AddButton()
         }
    }

}

@Composable
 fun BarreSup(modifier: Modifier = Modifier) {
     Row( modifier = modifier
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

@Composable
fun AddButton() {
    FloatingActionButton(
        onClick = { },
    ) {
        Icon(Icons.Filled.Add, "Add")
    }
}

@Composable
fun DeleteButton() {
    FloatingActionButton(
        onClick = { },
    ) {
        Icon(Icons.Filled.Delete, "Pencil")
    }
}

@Composable
fun ModifyButton() {
    FloatingActionButton(
        onClick = { },
    ) {
        Icon(Icons.Filled.Mode, "Modify")
    }
}

@Composable
fun ApproveButton() {
    FloatingActionButton(
        onClick = { },
    ) {
        Icon(Icons.Filled.Check, "Approve")
    }
}

@Composable
fun CancelButton() {
    FloatingActionButton(
        onClick = { },
    ) {
        Icon(Icons.Filled.Close, "Cancel")
    }
}