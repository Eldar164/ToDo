import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

@Composable
fun TaskCard(
    task: Task,
    toggleCompleted: (Task) -> Unit,
) {
    Card(
        modifier = Modifier
            .padding(SMALL_PADDING)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier
                .padding(SMALL_PADDING)
                .fillMaxWidth(),
            verticalAlignment = Layout.Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier
                    .padding(start = MEDIUM_PADDING)
                    .weight(1f),
                text = task.body,
                style = TextStyle(
                    textDecoration = if (task.completed) TextDecoration.LineThrough
                    else TextDecoration.None
                )
            )
            Checkbox(checked = task.completed, onCheckedChange = {
                toggleCompleted(task)
            })
        }
    }
}