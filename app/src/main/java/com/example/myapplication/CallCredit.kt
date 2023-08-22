package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting()
                        CallCreditScreen()
                        CreditText()
                        Proceed()
                        CallCreditInfo().Content()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .height(180.dp)
            .fillMaxWidth()
            .background(color = Color.LightGray, shape = RoundedCornerShape(20.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "10",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Available Credits",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }


    Box(
        modifier = Modifier
            .padding(20.dp)
    ){
    Text(
        text = "Purchase Credits",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )


    }
}

@Composable
fun CreditCountBox(
    count: Int,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            ImageAndCount(imageResId = R.drawable.ic_launcher_background, onClick = onDecrement)
            Text(
                text = count.toString(),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp, end = 16.dp),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            ImageAndCount(imageResId = R.drawable.ic_launcher_foreground, onClick = onIncrement)
        }
    }
}

@Composable
fun ImageAndCount(imageResId: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = ImageVector.vectorResource(id = imageResId),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onPrimary)
        )
    }
}

@Composable
fun CallCreditScreen() {
    Surface(
        modifier = Modifier.wrapContentHeight(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .padding(vertical = 16.dp)
                .wrapContentHeight(align = Alignment.Bottom)
                .padding(horizontal = 16.dp)
        ) {
            CreditCountBox(
                count = 100,
                onIncrement = {},
                onDecrement = {}
            )
        }
    }
}

@Composable
fun CreditText() {
    Box(
        modifier = Modifier
            .padding(20.dp)
            .wrapContentHeight()
            .fillMaxWidth()
            .background(color = Color.LightGray, shape = RoundedCornerShape(20.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Credit Value",
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(
                text = "1 Call alert = 1 credits",
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(
                text = "Lifetime validity",
                fontSize = 14.sp,
                color = Color.Black
            )

            Button(
                onClick = { CallCreditInfo() },
                modifier = Modifier
                    .padding(16.dp)
                    .height(48.dp)
                    .wrapContentHeight(),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "More Info", fontSize = 16.sp, color = Color.White)

            }
        }

    }
}


@Composable
fun Proceed() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(
            onClick = { /* Handle button click here */ },
            modifier = Modifier
                .padding(20.dp)
                .height(48.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue) ) {
            Text(text = "PROCEED", fontSize = 16.sp, color = Color.White)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Column {
            Greeting()
            CallCreditScreen()
            CreditText()
            Proceed()
        }
    }
}