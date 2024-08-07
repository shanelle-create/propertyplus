package com.example.propertyplus.ui.theme.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.ui.theme.Pink32
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay


@Composable
fun SplashScreen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(Pink32),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)


        {
            var coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {

                delay(2000)


            }



            }
            Image(
                painter = painterResource(id = R.drawable.house) ,
                contentDescription ="home",
                modifier = Modifier
                    .size(300.dp),

                contentScale = ContentScale.Crop
            )







        }








}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}