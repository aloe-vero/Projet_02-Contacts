package com.example.projet_02_contacts.ui.composable

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable


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
        Icon(Icons.Filled.Edit, "Modify")
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