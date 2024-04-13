package com.example.myrecipeapp

data class Category(
    var strCategory : String,
    var strCategoryThumb : String,
    var strCategoryDescription : String
)

data class CategroiesResponse(
    val categories : List<Category>
)
