package com.eagle.dogadoptionappcompose.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eagle.dogadoptionappcompose.R

@Composable
fun DogInfo(name : String, gender : String, location : String){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    ){
        Column(Modifier.align(Alignment.CenterVertically)) {
            Text(text = name,
                modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),
                color = MaterialTheme.colors.error,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h5
                )
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Icon(painter = painterResource(id = R.drawable.ic_location),
                    contentDescription =null,
                    modifier = Modifier.size(16.dp,16.dp),
                    tint = Color.Red)
                
                Text(text = location,
                modifier = Modifier.padding(8.dp,12.dp,12.dp,0.dp),
                color = MaterialTheme.colors.error,
                style = MaterialTheme.typography.caption)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "12 mins ago",
            modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),
            color = MaterialTheme.colors.error,
            style = MaterialTheme.typography.overline)
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            genderTag(gender = gender)
        }
    }
}

@Preview
@Composable
fun PreviewDogInfo(){
    Surface{
        DogInfo(name = "Pitbul", gender = "Male", location = "Lahore")
    }
}