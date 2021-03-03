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
package com.example.androiddevchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog

class DogViewModel : ViewModel() {
    val list: LiveData<List<Dog>> = MutableLiveData(
        listOf(
            Dog(
                "Border Collie",
                R.drawable.border_collie,
                "This is the world's number one smart dog, with an IQ equivalent to an 8-year-old kid. Basically a smart dog that can learn by doing five instructions. The Border Collie is very friendly to friends but has obvious reservations to strangers and gets along well with children. He is also an excellent shepherd dog, he is willing to learn and is satisfied with it. "
            ),
            Dog(
                "Chow Chow",
                R.drawable.chow_chow,
                "Don't think that the fluffy-looking fur will be easy to hold, they usually disappoint you, because they don't like to be amusing."
            ),
            Dog(
                "Great White Bear",
                R.drawable.great_white_bear,
                " It grows quickly, don't look at it so small, it can grow huge in one go. Gentle and smart, it is strange that although he is a large dog, he is even more hypocritical than a small dog!"
            ),
            Dog(
                "Huskies",
                R.drawable.huskies,
                "There is such a cute dog in \"Nanuk of the North\". It is not only very cold-resistant but also very heat-resistant. It is an affectionate companion dog, and you will feel very warm with its company. "
            ),
            Dog(
                "Husky",
                R.drawable.husky,
                "The typical character of a husky is friendly, gentle, alert and likes to socialize. It will not show the strong territorial possessiveness of the guard dog, will not have too much suspicion of strangers, and will not attack other dogs. "
            ),
            Dog(
                "Japanese Shiba Inu",
                R.drawable.japanese_shiba_inu,
                "With a sense of lens, Shiba Inu is very popular in Japan and belongs to small dogs. He has a gentle and submissive personality, and is a dog that even girls would like very much. "
            ),
            Dog(
                "Japanese Silver Fox",
                R.drawable.japanese_silver_fox,
                "The Japanese silver fox is very strange. It is kind to children, but it is wary of adults, and it is not friendly to other animals. This kind of dog looks very similar to Pomeranian, all resembling the face of a fox, and is a German hybrid dog made in Japan. "
            ),
            Dog(
                "Labrador",
                R.drawable.labrador,
                "Faithful, calm, smart, reassuring with children, always self-sufficient and happy, guard against intruders, suitable for suburban life. I used to be a porter, but now it's red and purple. The Labrador Retriever has an excellent sense of smell. It was used to look for landmines during World War II. Now it is used as a police dog to sniff out illegal drugs."
            ),
            Dog(
                "Mika",
                R.drawable.mika,
                " It's very active, so give him time for activities. Moreover, the cat's ears are curled up as if they have been scalded, and they are easy to knot, so they need to be taken care of frequently. "
            ),
            Dog(
                "Papillon",
                R.drawable.papillon,
                "Papillons are extremely approachable, intelligent, happy, alert, and friendly. The physique looks stronger than the outside and likes outdoor sports. Very exclusive to the owner, jealous to the third party. "
            ),
            Dog(
                "Pomeranian",
                R.drawable.pomeranian,
                " The Pomeranian has gorgeous hair, which requires not only regular trimming but also daily grooming, and is not suitable for busy people. But as a small dog, Pomeranian is still a good family companion."
            ),
            Dog(
                "Saint Bernard",
                R.drawable.saint_bernard,
                " It is native to Denmark and has a long history in Switzerland. The Saint Bernard is a very large dog with a very docile personality and easy approach. It is loyal to its owner, likes to be with children, is suitable for companionship with children, and is very tolerant to children. Easy to train, good at lifesaving, and able to adapt to cold weather. "
            ),
            Dog(
                "Samoyed",
                R.drawable.samoyed,
                "Many people raise small sas, but Samoyeds are dogs who like to exercise freely. "
            ),
            Dog(
                "Sharpei Chinese Dog",
                R.drawable.sharpei_chinese_dog,
                "At present, it is a relatively rare breed. It used to be a fighting dog, so Sharpei's personality is very active."
            ),
            Dog(
                "SuMu",
                R.drawable.su_mu,
                "Su Mu is extremely intelligent, good personality, approachable, smart and sensitive, responds well to gentle obedience training, friendly, willing to please his master, and suitable for careful children. Cheerful and lively, strong feelings. Without proper socialization experience, one may be shy or nervous."
            )
        )
    )
}
