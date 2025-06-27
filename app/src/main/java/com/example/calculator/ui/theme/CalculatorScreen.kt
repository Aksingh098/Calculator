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
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun calculateDisplay() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        val colorScheme = MaterialTheme.colorScheme
        var expression by remember { mutableStateOf("alfj") }
        var result by remember { mutableStateOf("aklfjhka") }

        Spacer(modifier = Modifier.height(250.dp))


       Text(
           text = expression,
           maxLines = 1,
           textAlign = TextAlign.End,
           fontSize = 40.sp,
           fontWeight = FontWeight.Bold,
           color = colorScheme.onSurface,
           overflow = TextOverflow.Ellipsis
           )
        //Spacer(modifier = Modifier.height(10.dp))
        Text(
            text =result,
            maxLines = 1,
            textAlign = TextAlign.End,
            fontSize = 28.sp,
            color = colorScheme.onSurfaceVariant,
            overflow = TextOverflow.Ellipsis
            )





        numpad(onSymbolClick = {}

        )

    }
}


@Composable
fun numpad(
    onSymbolClick: (String) -> Unit
) {
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
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "AC",
                    fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("%") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "%",
                    fontSize = 35.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("⌫") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)

            ) {
                Text(text = "⌫",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("/") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
            ) {
                Text(text = "/",
                    fontSize = 30.sp)


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
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )

            ) {
                Text(text = "7",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("8") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "8",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("9") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "9",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("*") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
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
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )

            ) {
                Text(text = "4",
                    fontSize = 30.sp)


            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("5") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "5",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("6") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "6",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("-") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
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
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )

            ) {
                Text(text = "1",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("2") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "2",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("3") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "3",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("+") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp)
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
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )

            ) {
                Text(text = "00",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("0") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = "0",
                    fontSize = 30.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick(".") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFD3D3D3),
                    contentColor = Color.Black

                )
            ) {
                Text(text = ".",
                    fontSize = 50.sp)

            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { onSymbolClick("=") },
                shape = CircleShape,
                modifier = Modifier.size(85.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =Color(0xFFFFA500)
                )
            ) {
                Text(text = "=",
                    fontSize = 40.sp)

            }
        }


    }

}


