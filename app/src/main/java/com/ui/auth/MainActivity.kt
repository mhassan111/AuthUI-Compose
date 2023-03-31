package com.ui.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.ui.auth.ui.screens.RegisterScreen
import com.ui.auth.ui.screens.SettingsScreen
import com.ui.auth.ui.theme.BackgroundColor
import com.ui.auth.ui.theme.JetpackCompose4Theme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose4Theme {
                Surface(color = BackgroundColor, modifier = Modifier.fillMaxSize()) {
//LoginScreen()
                    RegisterScreen()
//                    ForgotPasswordScreen()
//                    SettingsScreen()
                }
            }
        }
    }

}

