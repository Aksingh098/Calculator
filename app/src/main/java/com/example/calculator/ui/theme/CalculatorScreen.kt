package com.example.calculator.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun mainScreen(){
    calculateDisplay(
        toCalculate = "",
        onCalcDisplayChange = {}

    )

}



@Composable
fun calculateDisplay(
    toCalculate:String,
    onCalcDisplayChange: (String) -> Unit

){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Calculator",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 30.sp

            )
        TextField(
            value =toCalculate ,
            onValueChange =onCalcDisplayChange,
            modifier = Modifier.padding(60.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        numpad()

    }
}


@Composable
fun numpad(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ) {
        Row {
            Button(
                onClick = { /*TODO*/ }
            ) {

            }
            Button(onClick = { /*TODO*/ }) {

            }
        }

    }

}


