package com.example.project.ui.theme.screens.signup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun Signupsc(navController:NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var isError = false


    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Join the Fun!", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Username") },
            isError = isError && name.isEmpty()
        )
        if (isError && name.isEmpty()) {
            Text(text = "Username cannot be empty")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            isError = isError && email.isEmpty()
        )
        if (isError && name.isEmpty()) {
            Text(text = "Email cannot be empty")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError && (password.isEmpty() || password != confirmPassword)
        )
        if (isError && (password.isEmpty() || password != confirmPassword)) {
            Text(text = "Password cannot be empty or does not match confirmation")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            isError = isError && password != confirmPassword
        )
        if (isError && password != confirmPassword) {
            Text(text = "Passwords do not match")
        }
        Spacer(modifier = Modifier.height(16.dp))
        val context = LocalContext.current
        val authViewModel =AuthViewModel(navController,context)
        Button(
            onClick = {
                authViewModel.signup(name, email ,password)
            }
        ) {
            Text(text = "Create an account")
        }
        Button(onClick = { navController.navigate(LOGIN_URL) }) {
            Text(text = "Already have an account?Login instead")

        }
    }
}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview() {
    Signupsc(navController = rememberNavController())

}