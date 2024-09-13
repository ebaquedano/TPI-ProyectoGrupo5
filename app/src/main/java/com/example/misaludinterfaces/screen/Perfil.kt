package com.example.misaludinterfaces.screen

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.misaludinterfaces.R

@Composable
fun Perfil() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.onPrimary
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.fondoverde),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds //
            )
        }

        Column(
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Card(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Spacer(modifier = Modifier.height(25.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.personatest2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)

                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Bienvenido Marcelo",
                    fontWeight = FontWeight.Black,
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(25.dp))

                var nombre = "Marcelo";

                Text(text = "Nombre: $nombre",
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start).padding(start = 20.dp)
                    )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Apellido: Navarro",
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start).padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Email : M.Navarro@gmail.com",
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start).padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Telefono de contacto: 1155667788",
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start).padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Contacto de emergencia: 1155667777",
                    fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start).padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = "Mi progreso",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Puntos de superacion",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Icon (
                        imageVector = Icons.Default.Favorite,
                        contentDescription = null,
                        tint = Color.Red
                    )
                    Icon (
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null
                    )
                    Icon (
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null,
                    )
                    Icon (
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(text = "Ataque de panico superado",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.icononook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))


                Text(text = "Ataque de Stress superado",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))


                Text(text = "Ataque de ansiedad superado",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.iconook),
                        contentDescription = null,
                        modifier = Modifier
                            .size(28.dp)

                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = { /* Handle register */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 50.dp),
                    colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))
                ) {
                    Text(text = "Salir", fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Black)

                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}