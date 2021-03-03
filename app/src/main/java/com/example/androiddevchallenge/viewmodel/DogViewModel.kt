package com.example.androiddevchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog

class DogViewModel : ViewModel() {
    val list: LiveData<List<Dog>> = MutableLiveData(
        listOf(
            Dog("Border Collie", R.drawable.border_collie, ""),
            Dog("Chow Chow", R.drawable.chow_chow, ""),
            Dog("Great White Bear", R.drawable.great_white_bear, ""),
            Dog("Huskies", R.drawable.huskies, ""),
            Dog("Husky", R.drawable.husky, ""),
            Dog("Japanese Shiba Inu", R.drawable.japanese_shiba_inu, ""),
            Dog("Japanese Silver Fox", R.drawable.japanese_silver_fox, ""),
            Dog("Labrador", R.drawable.labrador, ""),
            Dog("Mika", R.drawable.mika, ""),
            Dog("Papillon", R.drawable.papillon, ""),
            Dog("Pomeranian", R.drawable.pomeranian, ""),
            Dog("SaintBernard", R.drawable.saint_bernard, ""),
            Dog("Samoyed", R.drawable.samoyed, ""),
            Dog("Sharpei Chinese Dog", R.drawable.sharpei_chinese_dog, ""),
            Dog("SuMu", R.drawable.su_mu, "")
        )
    )
}