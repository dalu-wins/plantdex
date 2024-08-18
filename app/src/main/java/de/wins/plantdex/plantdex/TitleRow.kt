package de.wins.plantdex.plantdex

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TitleRow(
    plantsAsList: Boolean,
    onPlantsAsListToggled: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp).padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "My Plants", fontWeight = FontWeight.SemiBold)
        if (plantsAsList) {
            IconButton(onClick = { onPlantsAsListToggled() }) {
                Icon(Icons.Default.Dashboard, "Switch between dashboard and list view")
            }
        } else {
            IconButton(onClick = { onPlantsAsListToggled() }) {
                Icon(Icons.Default.List, "Switch between dashboard and list view")
            }
        }
    }
}