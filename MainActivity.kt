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

private val Midnight = Color(0xFF121713)
private val Card = Color(0xFF1C241E)
private val Sage = Color(0xFFA3B18A)
private val SageDark = Color(0xFF75866A)
private val MainText = Color(0xFFF0F1EB)
private val MutedText = Color(0xFFA0A69D)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FocusgramApp()
        }
    }
}

@Composable
fun FocusgramApp() {
    MaterialTheme(
        colorScheme = darkColorScheme(
            background = Midnight,
            surface = Card,
            primary = Sage,
            secondary = SageDark,
            onBackground = MainText,
            onSurface = MainText
        )
    ) {
        DashboardPlaceholder()
    }
}

@Composable
fun DashboardPlaceholder() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Midnight)
            .padding(horizontal = 24.dp, vertical = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(28.dp))
        Text("Focusgram", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Sage)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Fade your feed. Find your focus.", fontSize = 14.sp, color = MutedText)
        Spacer(modifier = Modifier.height(36.dp))

        val cards = listOf("Home", "Search", "Messages", "Create")
        cards.chunked(2).forEach { row ->
            Row(horizontalArrangement = Arrangement.spacedBy(14.dp)) {
                row.forEach { label ->
                    Surface(
                        modifier = Modifier.weight(1f).height(112.dp).padding(bottom = 14.dp),
                        color = Card,
                        shape = RoundedCornerShape(22.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(label, fontSize = 18.sp, fontWeight = FontWeight.SemiBold, color = MainText)
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        Text("WEEKLY SCREEN TIME", fontSize = 11.sp, letterSpacing = 1.5.sp, color = MutedText)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Your mindful usage summary will appear here.", fontSize = 13.sp, color = MutedText)
        Spacer(modifier = Modifier.weight(1f))
        Surface(color = Sage, shape = RoundedCornerShape(50.dp)) {
            Text("◷  Focus Mode", modifier = Modifier.padding(horizontal = 24.dp, vertical = 13.dp), color = Midnight, fontWeight = FontWeight.Bold)
        }
    }
}
