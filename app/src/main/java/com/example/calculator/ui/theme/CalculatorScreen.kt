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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.objecthunter.exp4j.ExpressionBuilder



@Composable
fun calculateDisplay() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        val colorScheme = MaterialTheme.colorScheme
        var expression by remember { mutableStateOf("") }
        var result by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(150.dp))


        Text(
            text =result,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1,
            textAlign = TextAlign.End,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,

            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(80.dp))


       Text(
           text = expression,
           modifier = Modifier.fillMaxWidth(),
           maxLines = 1,
           textAlign = TextAlign.End,
           fontSize = 40.sp,
           fontWeight = FontWeight.Bold,

           overflow = TextOverflow.Ellipsis
           )
        //Spacer(modifier = Modifier.height(10.dp))






        numpad(onSymbolClick = {symbol ->
            when(symbol){
                "AC" -> {
                    expression = ""
                    result = ""
                }
                "⌫" -> {
                    if(expression.isNotEmpty()){
                        expression = expression.dropLast(1)

                    }
                }
                "=" ->{
                    val sanitized = expression
                        .replace("%","/100")
                        .replace("÷","/")
                        .replace("×","*")
                    /*
                    ExpressionBuilder("2+3*4")
                    Creates an object that holds your math expression as raw text
                    The string "2+3*4" is just stored in memory, nothing processed yet
                    .build()
                    Parses the string into a data structure the computer can understand
                    Validates the syntax (checks if the math expression is correctly written)
                    Converts the text into an internal format optimized for calculation
                    Returns an Expression object that's ready for computation
                    */
                    val evaluated  = ExpressionBuilder(sanitized).build().evaluate()
                   result = evaluated.toString()

                }
                else -> {
                    expression += symbol
                }

            }



        }

        )

    }
}


@Composable
fun numpad(
    onSymbolClick: (String) -> Unit
) {
    val numberButtonColors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurfaceVariant
    )

    val operatorButtonColors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary
    )

    val specialButtonColors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.secondary,
        contentColor = MaterialTheme.colorScheme.onSecondary
    )

    val equalsButtonColors = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.tertiary,
        contentColor = MaterialTheme.colorScheme.onTertiary
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(11.dp),
           horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { onSymbolClick("AC") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = specialButtonColors


            ) {
                Text(text = "AC",
                    fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("%") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = operatorButtonColors
            ) {
                Text(text = "%",
                    fontSize = 35.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("⌫") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = specialButtonColors

            ) {
                Text(text = "⌫",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("÷") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = operatorButtonColors
            ) {
                Text(text = "÷",
                    fontSize = 40.sp)


            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(11.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { onSymbolClick("7") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors

            ) {
                Text(text = "7",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("8") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "8",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("9") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "9",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("×") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = operatorButtonColors
            ) {
                Text(text = "×",
                    fontSize = 39.sp)

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(11.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { onSymbolClick("4") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors

            ) {
                Text(text = "4",
                    fontSize = 30.sp)


            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("5") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "5",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("6") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "6",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("-") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = operatorButtonColors
            ) {
                Text(text = "-",
                    fontSize = 60.sp)

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(11.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { onSymbolClick("1") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors

            ) {
                Text(text = "1",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("2") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "2",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("3") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "3",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("+") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = operatorButtonColors
            ) {
                Text(text = "+",
                    fontSize = 40.sp)

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(11.dp),
            Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { onSymbolClick("00") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors

            ) {
                Text(text = "00",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("0") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = "0",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick(".") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = numberButtonColors
            ) {
                Text(text = ".",
                    fontSize = 50.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("=") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = equalsButtonColors
            ) {
                Text(text = "=",
                    fontSize = 40.sp)

            }
        }


    }

}


