package com.levelup.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.levelup.app.ui.theme.LevelUpTheme

private val Background = Color(0xFF07110D)
private val Panel = Color(0xFF101D16)
private val Green = Color(0xFF74F7A2)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LevelUpTheme {
                LevelUpStarterScreen()
            }
        }
    }
}

@Composable
private fun LevelUpStarterScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = Background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 22.dp, vertical = 28.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "LEVEL UP",
                color = Green,
                fontSize = 32.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 2.sp,
            )
            Text(
                text = "Build your next level.",
                color = Color(0xFFB8C8BD),
                fontSize = 15.sp,
                modifier = Modifier.padding(top = 6.dp),
            )

            Spacer(modifier = Modifier.height(28.dp))

            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = Panel,
                shape = RoundedCornerShape(22.dp),
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "YOUR JOURNEY STARTS HERE",
                        color = Green,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.3.sp,
                    )
                    Text(
                        text = "Level 1",
                        color = Color.White,
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 12.dp),
                    )
                    Text(
                        text = "Your progress dashboard is being prepared.",
                        color = Color(0xFFB8C8BD),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 6.dp),
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(8.dp)
                            .background(Color(0xFF26372D), RoundedCornerShape(50.dp)),
                    )
                    Text(
                        text = "0 XP  •  Starter",
                        color = Green,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp),
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                InfoTile("QUESTS", "Coming soon", Modifier.weight(1f))
                InfoTile("SKILLS", "Coming soon", Modifier.weight(1f))
            }
            Text(
                text = "MVP FOUNDATION • VERSION 1.0.0",
                color = Color(0xFF718278),
                fontSize = 10.sp,
                letterSpacing = 1.sp,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 30.dp),
            )
        }
    }
}

@Composable
private fun InfoTile(title: String, detail: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = Panel,
        shape = RoundedCornerShape(16.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, color = Green, fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text(
                detail,
                color = Color(0xFFB8C8BD),
                fontSize = 13.sp,
                modifier = Modifier.padding(top = 8.dp),
            )
        }
    }
}
