package com.example.textview

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextGeometricTransform
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textview.ui.theme.customFont

@Composable
fun TextViewLayout() {
    
    Text(text = "Anjali, how are you?", style = TextStyle(
        color = Color.Red,
        fontSize = 20.sp,
        fontFamily = customFont,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Italic,
        letterSpacing = 12.sp,
        textDecoration = TextDecoration.Underline,
        shadow = Shadow(
            color = Color.Red,
            offset = Offset(5f,5f),
            blurRadius = 0.3f
        ),
        textGeometricTransform = TextGeometricTransform(
            scaleX = 1.4f, skewX = 0.4f
        ),
        textAlign = TextAlign.End
    ),
        maxLines = 2
    )
}