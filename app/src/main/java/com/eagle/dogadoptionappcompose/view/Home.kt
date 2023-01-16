package com.eagle.dogadoptionappcompose.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.eagle.dogadoptionappcompose.component.ItemDogCard
import com.eagle.dogadoptionappcompose.component.TopBar
import com.eagle.dogadoptionappcompose.model.Dog


@Composable
fun Home(navController: NavHostController, dogList: List<Dog>, toggleTheme: () -> Unit) {
    LazyColumn {
        item {
            TopBar(
                onToggle = {
                    toggleTheme()
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(dogList) {
            dogList.forEach {
                ItemDogCard(
                    it,
                    onItemClicked = { dog ->
                        navController.navigate("details/${dog.id}/${dog.name}/${dog.location}")
                    }
                )
            }
        }
    }
}
