package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

class CallCreditInfo {

    @Composable
    fun Content() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                CallAlertItem()
                Spacer(modifier = Modifier.height(16.dp))
                EasyCreditsItem()
                Spacer(modifier = Modifier.height(16.dp))
                ReceiveCallItem()
            }
        }
    }

    @Composable
    fun CallAlertItem() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(20.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = "Call Alerts",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "When parking mode is turned on",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }

    @Composable
    fun EasyCreditsItem() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(20.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = "Easy Credits",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "With in-app recharge feature",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Easily add credits with our in-app recharge feature. 1 credit will be deducted per call. We are providing users with 25 free credits.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }

    @Composable
    fun ReceiveCallItem() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White, RoundedCornerShape(20.dp))
                .padding(16.dp)
        ) {
            Column {
                Text(
                    text = "Receive a Call",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "When your car is in danger",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Even if your mobile does not have an active internet connection, you will get a call alert when your vehicle is in parking mode.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}
