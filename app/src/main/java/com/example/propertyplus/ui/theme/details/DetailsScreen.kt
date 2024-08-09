package com.example.propertyplus.ui.theme.details

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DetailsScreen(navController: NavController){

    Column (Modifier.fillMaxSize()){

        TopAppBar(
            title = { Text(text = "PropertyPlus") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription ="menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription ="notification", tint =Color.White )
                    
                }


            }
        )

        Box (modifier = Modifier
            .height(280.dp)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
        Image(
            painter = painterResource(id = R.drawable.home) ,
            contentDescription = "home",
            modifier = Modifier.fillMaxSize()
        )

        }

        Spacer(modifier = Modifier.height(20.dp))


        //Searchbar
        var search by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
        value = search,
        onValueChange = {search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = { Text(text = "What's your location")}

            )
        //End of searchbar
        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier
                .padding(20.dp)
                .horizontalScroll(rememberScrollState())
        ){
            //CARD1
            Card (){

                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center)
                {
                    Image(
                        painter = painterResource(id = R.drawable.home2) ,
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }

            Spacer(modifier = Modifier.width(30.dp))

            Card (){

                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center)
                {
                    Image(
                        painter = painterResource(id = R.drawable.home3) ,
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }

            Spacer(modifier = Modifier.width(30.dp))



            Card (){

                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center)
                {
                    Image(
                        painter = painterResource(id = R.drawable.home4) ,
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }

            }
            Spacer(modifier = Modifier.width(30.dp))


            Card (){

                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center)
                {
                    Image(
                        painter = painterResource(id = R.drawable.home5) ,
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
                Spacer(modifier = Modifier.width(30.dp))

            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}

