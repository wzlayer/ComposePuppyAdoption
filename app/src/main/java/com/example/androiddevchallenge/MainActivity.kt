/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.viewmodel.DogViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var dogViewModel: DogViewModel

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dogViewModel = ViewModelProvider(this).get(DogViewModel::class.java)

        setContent {
            MyTheme {
                dogViewModel.list.value?.let {
                    MyApp(dogs = it, this@MainActivity)
                }
            }
        }
    }
}

// Start building your app here!
@ExperimentalMaterialApi
@Composable
fun MyApp(dogs: List<Dog>, context: Context) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumn(contentPadding = PaddingValues(8.dp)) {
            items(dogs) { dog ->
                DogItem(
                    dog = dog,
                    Modifier.clickable(
                        onClick = {
                            val intent = Intent()
                            intent.setClass(context, DetailActivity::class.java)
                            val index = dogs.indexOf(dog)
                            intent.putExtra("index", index)
                            context.startActivity(intent)
                        }
                    )
                )
            }
        }
    }
}

@Composable
private fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(4.dp),
        backgroundColor = Color.White,
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(ImageBitmap.imageResource(dog.pic), dog.name)
            Text(dog.name)
        }
    }
}
