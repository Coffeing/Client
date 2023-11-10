package com.coffeeing.client.domain.model

data class HomeCoffeeing(
    val id: Int,
    val image: String,
    val title: String,
    val numPeople: Int,
    val district: String,
    val meetTime: String,
    val like: Int,
    val iflike: Boolean,
    val tag: String
)