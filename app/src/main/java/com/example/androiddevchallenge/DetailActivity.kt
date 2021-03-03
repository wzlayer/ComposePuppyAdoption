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

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.viewmodel.DogViewModel

class DetailActivity : AppCompatActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intExtra = intent.getIntExtra("index", 0)

        val dogViewModel = ViewModelProvider(this).get(DogViewModel::class.java)

        val dog = dogViewModel.list.value?.get(intExtra)

        setContent {
            MyTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        dog?.let {
                            Image(
                                ImageBitmap.imageResource(dog.pic),
                                dog.name,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Spacer(
                                Modifier
                                    .height(20.dp)
                                    .fillMaxWidth()
                            )
                            Text(dog.detail, modifier = Modifier.padding(12.dp))
                        }
                    }
                }
            }
        }
    }
}
