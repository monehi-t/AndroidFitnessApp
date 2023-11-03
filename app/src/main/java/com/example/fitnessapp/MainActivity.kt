package com.example.fitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

//Student Information with Image
@Composable
fun ImageRow(
    drawableImageId: Int,
    name: String,
    studentNumber: String,
    weight: String,
    weightNum: String,
    glucose: String,
    glucoseNum: String,
    pressure: String,
    pressureNum: String
) {

    Column (modifier = Modifier.fillMaxWidth()){

        //Student Details and Image Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Image column
            Box(
                modifier = Modifier.size(80.dp)
            ) {
                Image(
                    painter = painterResource(id = drawableImageId),
                    contentDescription = "Student Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            //Student Info column
            Column {
                Text(
                    text = name,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = studentNumber,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }

        }

        //Student Health Information Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFFFC0CB))//make bg color pink
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            //Weight column
            Column {
                Text(
                    text = weight,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = weightNum,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(color = Color.White)
                )
            }

            //Glucose column
            Column {
                Text(
                    text = glucose,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = glucoseNum,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(color = Color.White)
                )
            }

            //Pressure column
            Column {
                Text(
                    text = pressure,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = pressureNum,
                    modifier = Modifier.padding(start = 16.dp),
                    style = TextStyle(color = Color.White)
                )
            }

        }

    }



}


@Preview
@Composable
fun MyScreen() {
    val drawableImageId = R.drawable._0231101_080802
    val name = "Monehi Tuoane, 23"
    val studentNumber = "219350744"
    val weight = "Weight"
    val weightNum = "100"
    val glucose = "Glucose"
    val glucoseNum = "65.5"
    val pressure = "Pressure"
    val pressureNum = "120/70"

    ImageRow(drawableImageId, name, studentNumber, weight, weightNum, glucose, glucoseNum, pressure, pressureNum)

}