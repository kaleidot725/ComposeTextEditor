package jp.kaleidot725.texteditor.state

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import java.util.UUID

@Stable
data class TextFieldState(
    val id: String = UUID.randomUUID().toString(),
    val value: TextFieldValue = TextFieldValue(),
    val isSelected: Boolean,
    val textStyle: TextStyle,
    val textSelectedStyle: TextStyle
)
