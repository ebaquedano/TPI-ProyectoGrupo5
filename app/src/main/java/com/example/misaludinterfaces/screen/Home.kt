package com.example.misaludinterfaces.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun Menu() {

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
                            painter = painterResource(id = R.drawable.fondoverde), // imagen
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

            WelcomeMessage()

        }


    }
}

@Composable
fun WelcomeMessage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
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
                Text(
                    text = "Bienvenido Marcelo",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1fa199)
                )
        Image(
            painter = painterResource(id = R.drawable.pasmentalhomedos),
            contentDescription = "profile pic",
            modifier = Modifier
                .size(250.dp)
                //.clip(CircleShape)
                //.background(Color(0xFF00C853))

        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "¿En qué puedo ayudarte?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Black,
            color = Color(0xFF38a7df)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /* Acción para Ataque de pánico */ },
            Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))) {
            Text("Ataque de pánico",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /* Acción para Ansiedad */ },
            Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))) {
            Text("Ansiedad",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { /* Acción para Estrés */ },
            Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))) {
            Text("Estrés",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Black)
        }
                Spacer(modifier = Modifier.height(15.dp))
                Button(onClick = { /* foro de ayuda */ },
                    Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))) {
                    Text("Foro de ayuda",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Black)
                }

    }
        }

       SmallExample { }
    }
}

@Composable
fun SmallExample(onClick: () -> Unit) {
    SmallFloatingActionButton(
        onClick = { onClick() },
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary
    ) {
        Image(
            painter = painterResource(id = R.drawable.sonido),
            contentDescription = null,
            modifier = Modifier
                .size(28.dp)
        )
    }
}

data class DrawerItems(

    val icon : ImageVector,
    val text : String,
    val badgeCount : Int,
    val hasBadge : Boolean
)