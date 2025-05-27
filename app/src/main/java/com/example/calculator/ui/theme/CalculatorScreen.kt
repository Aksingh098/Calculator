package com.example.calculator.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun mainScreen() {
    var toCalculate by remember { mutableStateOf("") }


    calculateDisplay(
        toCalculate = toCalculate,
        onCalcChange = { toCalculate = it }


    )

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun calculateDisplay(
    toCalculate: String,
    onCalcChange: (String) -> Unit


) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Calculator",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 30.sp

        )
        BasicTextField(
            value = toCalculate,
            onValueChange = onCalcChange,
            modifier = Modifier
                .padding(top = 50.dp, start = 4.dp)
                .height(200.dp),
            textStyle = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right
//                overflow = TextOverflow.Ellipsis
            ),
            maxLines = 1,


            )



        Spacer(modifier = Modifier.height(20.dp))
        numpad()

    }
}


@Composable
fun numpad() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "AC",
                    fontSize = 25.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "%",
                    fontSize = 35.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "⌫",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "/",
                    fontSize = 30.sp)


            }
        }
        Row(
            modifier = Modifier.padding(20.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "7",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "8",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "9",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "×",
                    fontSize = 39.sp)

            }
        }
        Row(
            modifier = Modifier.padding(20.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "4",
                    fontSize = 30.sp)


            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "5",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "6",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "-",
                    fontSize = 60.sp)

            }
        }
        Row(
            modifier = Modifier.padding(20.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "1",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "2",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "3",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "+",
                    fontSize = 40.sp)

            }
        }


    }

}


