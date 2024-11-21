package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.example.myapplication.screens.TaskScreen
import com.example.myapplication.view_models.TaskViewModel

class MainActivity : ComponentActivity() {
    // this is how we can instantiate our view model for now
    private val viewModel by viewModels<TaskViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTestApplicationTheme {
                // let's pass our view model to our TaskScreen
                TaskScreen(viewModel)
            }
        }
    }
}

// we can create a parameter for our viewModel in the TaskScreen
@Composable
fun TaskScreen(viewModel: TaskViewModel) {
// ...