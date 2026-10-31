package com.focusgram.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Background = Color(0xFF121713)
private val CardColor = Color(0xFF1C241E)
private val Sage = Color(0xFFA3B18A)
private val TextColor = Color(0xFFF0F1EB)
private val Muted = Color(0xFFA0A69D)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FocusgramApp() }
    }
}

@Composable
fun FocusgramApp() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize(), color = Background) {
            Column(Modifier.fillMaxSize().padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(Modifier.height(30.dp))
                Text("◎ Focusgram", color = Sage, fontSize = 32.sp, fontWeight = FontWeight.Bold)
                Spacer(Modifier.height(8.dp))
                Text("Fade your feed. Find your focus.", color = Muted, fontSize = 14.sp)
                Spacer(Modifier.height(35.dp))
                NavigationCard("⌂", "Home")
                NavigationCard("⌕", "Search")
                NavigationCard("✉", "Messages")
                NavigationCard("+", "Create")
                Spacer(Modifier.height(30.dp))
                Text("YOUR WEEK", color = Muted, fontSize = 12.sp, fontWeight = FontWeight.Medium)
                Spacer(Modifier.height(12.dp))
                Text("Your screen-time insights will appear here.", color = Muted, fontSize = 12.sp)
                Spacer(Modifier.weight(1f))
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Sage), shape = RoundedCornerShape(50.dp)) {
                    Text("◷  Focus Mode", color = Background, fontWeight = FontWeight.Bold)
                }
                Spacer(Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun NavigationCard(icon: String, title: String) {
    Row(Modifier.fillMaxWidth().padding(vertical = 6.dp).background(CardColor, RoundedCornerShape(18.dp)).padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(icon, color = Sage, fontSize = 25.sp)
        Spacer(Modifier.width(18.dp))
        Text(title, color = TextColor, fontSize = 18.sp, fontWeight = FontWeight.Medium)
    }
                       }
