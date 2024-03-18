package com.example.fitnessapp.ui.activitytracker

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnessapp.R
import com.example.fitnessapp.ui.theme.poppinsFamily

@Composable
fun ActivityTrackerScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        content = {
            item {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp, top = 25.dp, bottom = 25.dp)
                        .wrapContentHeight()
                        .fillMaxWidth()

                ) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            "Activity Tracker",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 20.sp,
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.align(alignment = Alignment.Center)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_options_menu),
                            contentDescription = null,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterEnd)
                                .background(
                                    color = MaterialTheme.colorScheme.surfaceVariant,
                                    shape = RoundedCornerShape(8.dp),
                                )
                                .padding(start = 13.dp, end = 13.dp, top = 16.dp, bottom = 16.dp)
                                .clickable { println("Button Clicked!") })
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                color = MaterialTheme.colorScheme.tertiaryContainer,
                                shape = RoundedCornerShape(12.dp),
                            )
                            .padding(start = 18.dp, end = 18.dp, top = 15.dp, bottom = 15.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                "Today Target",
                                color = MaterialTheme.colorScheme.onTertiaryContainer,
                                fontSize = 14.sp,
                                fontFamily = poppinsFamily,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier
                            )
                            Image(
                                painter = painterResource(id = R.drawable.ic_button_plus),
                                contentDescription = null
                            )
                        }
                        Spacer(modifier = Modifier.height(18.dp))
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = Color.White,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .padding(
                                        start = 12.dp,
                                        top = 8.dp,
                                        end = 12.dp,
                                        bottom = 8.dp
                                    ),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_glass),
                                    contentDescription = null,
                                    Modifier.size(45.dp)
                                )
                                Column(
                                    modifier = Modifier.padding(start = 5.dp),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.Start
                                ) {
                                    Text(
                                        "8L",
                                        fontSize = 14.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Medium,
                                        style = TextStyle(
                                            brush = Brush.horizontalGradient(
                                                listOf(
                                                    MaterialTheme.colorScheme.primary,
                                                    MaterialTheme.colorScheme.tertiary,
                                                )
                                            ),
                                        )
                                    )
                                    Text(
                                        "Water Intake",
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 12.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Normal,
                                        maxLines = 1
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = Color.White,
                                        shape = RoundedCornerShape(12.dp)
                                    )
                                    .padding(
                                        start = 16.dp,
                                        top = 8.dp,
                                        end = 12.dp,
                                        bottom = 8.dp
                                    ),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_steps_boots),
                                    contentDescription = null,
                                    Modifier.size(45.dp)
                                )
                                Column(

                                    modifier = Modifier.padding(start = 5.dp),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.Start
                                ) {
                                    Text(
                                        "2400",
                                        fontSize = 14.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Medium,
                                        style = TextStyle(
                                            brush = Brush.horizontalGradient(
                                                listOf(
                                                    MaterialTheme.colorScheme.primary,
                                                    MaterialTheme.colorScheme.tertiary,
                                                )
                                            ),
                                        )
                                    )
                                    Text(
                                        "Foot Steps",
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 12.sp,
                                        fontFamily = poppinsFamily,
                                        fontWeight = FontWeight.Normal,
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(25.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Latest Activity",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 16.sp,
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            "See more",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 12.sp,
                            fontFamily = poppinsFamily,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    val cardShape = RoundedCornerShape(16.dp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .shadow(
                                shape = cardShape,
                                spotColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                elevation = 20.dp
                            ),
                        shape = cardShape
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier

                                .padding(18.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_profile_pic),
                                contentDescription = null,
                                modifier = Modifier.size(55.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .weight(1f)
                            ) {
                                Text(
                                    text = "Drinking 300ml Water",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "About 3 minutes ago",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Normal,
                                    maxLines = 1
                                )
                            }
                            Icon(
                                imageVector = Icons.Rounded.MoreVert,
                                contentDescription = "Icon",
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.align(alignment = Alignment.Top)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .shadow(
                                shape = cardShape,
                                spotColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                elevation = 20.dp
                            ),
                        shape = cardShape
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(18.dp),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_profile_pic),
                                contentDescription = null,
                                modifier = Modifier.size(55.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .weight(1f)
                            ) {
                                Text(
                                    text = "Eat Healthy Snack",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "About 10 minutes ago",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Normal,
                                    maxLines = 1
                                )
                            }
                            Icon(
                                imageVector = Icons.Rounded.MoreVert,
                                contentDescription = "Icon",
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.align(alignment = Alignment.Top)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .shadow(
                                shape = cardShape,
                                spotColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                elevation = 20.dp
                            ),
                        shape = cardShape
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier

                                .padding(18.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_profile_pic),
                                contentDescription = null,
                                modifier = Modifier.size(55.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                                    .weight(1f)
                            ) {
                                Text(
                                    text = "Full-body Workout",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "Today, 10:00 am",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontFamily = poppinsFamily,
                                    fontWeight = FontWeight.Normal,
                                    maxLines = 1
                                )
                            }
                            Icon(
                                imageVector = Icons.Rounded.MoreVert,
                                contentDescription = "Icon",
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.align(alignment = Alignment.Top)
                            )
                        }
                    }
                }
            }
        }
    )
}

@Composable
@Preview
fun ActivityTrackerScreenPreview() {
    ActivityTrackerScreen()
}