package com.example.fitnessapp.ui.home

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.R
import com.example.fitnessapp.ui.theme.poppinsFamily

@Composable
fun HomeScreen() {
    LazyColumn(
        content = {
            item {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 25.dp, bottom = 25.dp)
                        .wrapContentSize()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                "Welcome Back,",
                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                fontSize = 12.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Normal
                            )
                            Text(
                                "Abdullah",
                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                fontSize = 20.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Bold
                            )

                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.ic_icon_notification),
                                contentDescription = null,
                                modifier = Modifier
                                    .background(
                                        color = MaterialTheme.colorScheme.surfaceVariant,
                                        shape = RoundedCornerShape(8.dp)
                                    )
                                    .padding(10.dp)
                                    .clickable { println("Button Clicked!") }
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(18.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bg_home_header),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.matchParentSize(),
                            alignment = Alignment.Center

                        )

                        Column(

                            modifier = Modifier
                                .height(150.dp)
                                .padding(start = 18.dp, top = 22.dp, bottom = 12.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                "BMI (Body Mass Index)",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                "You have a normal weight",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.weight(1f)
                            )
                            Button(

                                modifier = Modifier
                                    .wrapContentSize()
                                    .padding(start = 0.dp, end = 0.dp, bottom = 0.dp)
                                    .background(
                                        color = Color.White,
                                        shape = RoundedCornerShape(15.dp)
                                    )
                                    .height(30.dp),
                                onClick = { },
                                contentPadding = PaddingValues(start = 12.dp, end = 12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                            ) {
                                Text(
                                    "View More",
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 10.sp,
                                    fontFamily = poppinsFamily, fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(18.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                color = MaterialTheme.colorScheme.primaryContainer,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .padding(15.dp)
                    ) {
                        Text(
                            text = "Today Target",
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontSize = 14.sp,
                            fontFamily = poppinsFamily, fontWeight = FontWeight.Medium
                        )
                        Button(
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(start = 0.dp, end = 0.dp, bottom = 0.dp)
                                .background(
                                    brush = Brush.horizontalGradient(
                                        listOf(
                                            MaterialTheme.colorScheme.primary,
                                            MaterialTheme.colorScheme.tertiary,
                                        )
                                    ),
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .height(30.dp),
                            onClick = { },
                            contentPadding = PaddingValues(start = 12.dp, end = 12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
                        ) {
                            Text(
                                "Check", color = Color.White, fontSize = 12.sp,
                                fontFamily = poppinsFamily, fontWeight = FontWeight.Normal
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(22.dp))
                    Text(
                        text = "Activity Status",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 16.sp,
                        fontFamily = poppinsFamily,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 2.dp
                        ),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Top,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .padding(15.dp)
                        ) {
                            Text(
                                text = "Heart Rate",
                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                fontSize = 12.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.Medium
                            )

                            Text(
                                text = "78 BPM",
                                fontSize = 14.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.primary,
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(22.dp))
                    Row(modifier = Modifier.fillMaxSize()) {
                        Card(
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 2.dp
                            ),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(end = 10.dp)
                                .height(220.dp),
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp)
                            ) {
                                Row {
                                    VerticalProgress(
                                        progress = 50f,
                                        modifier = Modifier.padding(
                                            start = 12.dp,
                                            top = 0.dp,
                                            end = 12.dp,
                                            bottom = 0.dp
                                        )
                                    )
                                }
                                Column(
                                    modifier = Modifier.padding(
                                        start = 12.dp,
                                        top = 0.dp,
                                        end = 12.dp
                                    )
                                ) {
                                    Text(
                                        "Water Intake",
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 12.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Medium,
                                        lineHeight = 12.sp
                                    )

                                    Text(
                                        text = "4 Liters",
                                        fontSize = 14.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.SemiBold,
                                        color = MaterialTheme.colorScheme.primary,
                                    )
                                }
                            }
                        }
                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier
                                .weight(0.5f)
                                .padding(start = 10.dp),
                        ) {
                            Column(
                                modifier = Modifier.padding(10.dp)
                            ) {
                                Column(
                                    modifier = Modifier.padding(
                                        start = 12.dp,
                                        top = 0.dp,
                                        end = 12.dp
                                    )
                                ) {
                                    Text(
                                        "Sleep",
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 12.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Medium
                                    )
                                    Text(
                                        text = "8h 20m",
                                        fontSize = 14.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.SemiBold,
                                        color = MaterialTheme.colorScheme.primary,
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(22.dp))
                }
            }
        },
        modifier = Modifier.fillMaxSize(),
    )

}

@Composable
fun VerticalProgress(
    progress: Float,
    modifier: Modifier = Modifier
) {
    val mProgress = animateFloatAsState(targetValue = progress / 100, label = "")
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .width(20.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(if ((1 - mProgress.value) == 0f) 0.0001f else (1 - mProgress.value))
                .fillMaxWidth()
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .weight(mProgress.value)
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            MaterialTheme.colorScheme.primary,
                            MaterialTheme.colorScheme.tertiary,

                            )
                    )
                )
        )
    }
}