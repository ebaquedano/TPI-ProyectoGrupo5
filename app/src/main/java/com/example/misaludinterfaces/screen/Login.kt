package com.example.misaludinterfaces.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.misaludinterfaces.R
@Preview
@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }



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
                contentScale = ContentScale.FillBounds // La imagen ocupará todo el espacio del Box
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
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
                    Image(
                        painter = painterResource(id = R.drawable.logomejoradodoscontexto),
                        contentDescription = null,
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                            .clip(CircleShape)
                            .clip(RoundedCornerShape(8.dp))

                    )
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Usuario") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null
                            )
                        },
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                    )
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Contraseña") },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = null
                            )
                        },
                        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                        trailingIcon = {
                            val image = if (passwordVisible)
                                painterResource(id = R.drawable.ic_visibility)
                            else
                                painterResource(id = R.drawable.ic_visibility_off)

                            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                Icon(painter = image, contentDescription = null)
                            }
                        },
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                    )
                    TextButton(
                        onClick = { /* Handle forgot password */ },
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Text(text = "¿Olvidaste tu contraseña?",
                            fontSize = 20.sp
                            )
                    }
                    Button(
                        onClick = { /* Handle login */ },
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp).height(50.dp),
                        colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))
                    ) {
                        Text(text = "Iniciar sesión",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Black
                            )
                    }
                    Button(
                        onClick = { /* Handle register */ },
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp).height(50.dp),
                        colors = ButtonDefaults.buttonColors( containerColor = Color(0xFF38a7df))
                    ) {
                        Text(text = "Registrarse",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Black
                            )
                    }

                }
            }
        }
    }
}