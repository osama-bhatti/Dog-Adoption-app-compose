package com.eagle.dogadoptionappcompose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eagle.dogadoptionappcompose.R

@Composable
fun genderTag(gender:String){
    val color =if (gender == "male" || gender == "Male") R.color.blue else R.color.red
    chipView(gender = gender, color = colorResource(id = color) )
}

@Composable
fun chipView(gender:String,color: Color){
    Box(modifier = Modifier
        .wrapContentWidth()
        .clip(RoundedCornerShape(12.dp))
        .background(color.copy(0.2f))) {
        Text(text = gender, modifier =Modifier.padding(12.dp,6.dp,12.dp,6.dp),
        style = MaterialTheme.typography.caption,
        color = color)
    }
}

@Preview
@Composable
fun PreviewGenderTag(){
    Surface{
        Column{
            genderTag(gender = "Male")
            genderTag(gender = "Female")
        }

    }
}