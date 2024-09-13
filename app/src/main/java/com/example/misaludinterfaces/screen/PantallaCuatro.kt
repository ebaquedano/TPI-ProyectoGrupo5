package com.example.misaludinterfaces.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.misaludinterfaces.R
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaCuatro() {

    val drawerItem = listOf(
        DrawerItems(Icons.Default.Face, "Mi Perfil", 0, false),
        DrawerItems(Icons.Filled.Settings, "Configuracion", 0, false),
        DrawerItems(Icons.Filled.ExitToApp, "Salir", 32, true),
    )

    var selectedItem by remember {
        mutableStateOf(drawerItem[0])
    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(drawerContent = {
        ModalDrawerSheet {

            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(Color(0xFFFFFFFF)),
                    contentAlignment = Alignment.Center
                ) {

                        Image(
                            painter = painterResource(id = R.drawable.fondoverde), // Reemplaza con tu imagen
                            contentDescription = "Imagen de ejemplo",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )

                    Column(
                        Modifier.wrapContentSize(),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.personatest2),
                            contentDescription = "profile pic",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFE7F1F0))

                        )
                        Text(
                            text = "Marcelo Pérez",
                            Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp),
                            fontSize = 22.sp,
                            textAlign = TextAlign.Center
                        )
                    }


                }
                drawerItem.forEach{
                    NavigationDrawerItem(label = { Text(text = it.text) }
                        , selected = it == selectedItem
                        , onClick = {
                            selectedItem = it

                            scope.launch {
                                drawerState.close()
                            }

                        },
                        modifier = Modifier.padding(horizontal = 16.dp)
                        , icon = {
                            Icon(imageVector = it.icon, contentDescription = it.text)
                        }
                        , badge = {
                            if (it.hasBadge){
                                BadgedBox(badge = {
                                    Badge {
                                        Text(text = it.badgeCount.toString(), fontSize = 17.sp)
                                    }
                                }) {

                                }
                            }
                        }
                    )
                }

            }
        }
    }, drawerState = drawerState) {

        Scaffold(topBar = {
            TopAppBar(title = { Text(text = "Mi salud") },
                navigationIcon = {
                    IconButton(onClick = {
                        scope.launch {
                            drawerState.open()
                        }
                    }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu Icon")
                    }

                }
            )
        }) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fondoverde),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds // La imagen ocupará todo el espacio del Box
                )
            }

            WelcomeMessage5()

        }


    }
}

@Composable
fun WelcomeMessage5() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Ataque de panico",
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Slider(value = 4f,
            valueRange = 1f..4f,
            onValueChange = {null})
        Text(text = "Paso 4 : La imaginacion guiada",
            fontSize = 25.sp,
            color = Color.White
        )
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.pasocuatrocerrarojos),
                    contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                        .background(Color.White)

                )
                Spacer(modifier = Modifier.height(40.dp))



        Text(
            text = "Cerrar los ojos y pensar en un lugar tranquilo, prestando atención a todos los sentidos del ambiente que te rodea",
            fontSize = 25.sp,
            fontWeight = FontWeight.Black,
            color = Color(0xFF1fa199),
            modifier = Modifier.padding(horizontal = 35.dp)

        )

                Spacer(modifier = Modifier.height(100.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top// Alineación central horizontal
        ) {
            Button(
                onClick = {
                    // Acción para el botón Cancelar
                },
                modifier = Modifier.weight(1f).height(50.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.caritafeliz),
                    contentDescription = null,
                    modifier = Modifier
                        .size(28.dp)
                )
                Text("Mejor",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.padding(start = 5.dp))
            }
        Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {

                },
                modifier = Modifier.weight(1f).height(50.dp),
                colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))
            ) {

                Image(
                    painter = painterResource(id = R.drawable.llamarcontactosos),
                    contentDescription = null,
                    modifier = Modifier
                        .size(31.dp)
                )
                Text("Contacto",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Black)
            }
        }
    }

        }
    }

}


data class DrawerItems5(

    val icon : ImageVector,
    val text : String,
    val badgeCount : Int,
    val hasBadge : Boolean
)