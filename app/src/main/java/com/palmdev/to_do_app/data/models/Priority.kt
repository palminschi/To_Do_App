package com.palmdev.to_do_app.data.models

import androidx.compose.ui.graphics.Color
import com.palmdev.to_do_app.ui.theme.HighPriorityColor
import com.palmdev.to_do_app.ui.theme.LowPriorityColor
import com.palmdev.to_do_app.ui.theme.MediumPriorityColor
import com.palmdev.to_do_app.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    LOW(LowPriorityColor),
    MEDIUM(MediumPriorityColor),
    HIGH(HighPriorityColor),
    NONE(NonePriorityColor)
}