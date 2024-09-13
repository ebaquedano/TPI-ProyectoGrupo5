package com.example.misaludinterfaces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.misaludinterfaces.screen.Login
import com.example.misaludinterfaces.screen.Menu

import com.example.misaludinterfaces.screen.PantallaCuatro
import com.example.misaludinterfaces.screen.PantallaDos
import com.example.misaludinterfaces.screen.PantallaFinal
import com.example.misaludinterfaces.screen.PantallaTres
import com.example.misaludinterfaces.screen.PantallaUno
import com.example.misaludinterfaces.screen.Perfil
import com.example.misaludinterfaces.screen.Registracion
import com.example.misaludinterfaces.ui.theme.MiSaludInterfacesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiSaludInterfacesTheme {
                //Login()
                //Registracion()
                //Menu()
                //Perfil()
                //PantallaUno()
                //PantallaDos()
                //PantallaTres()
                //PantallaCuatro()
                PantallaFinal()

            }
        }
    }
}

