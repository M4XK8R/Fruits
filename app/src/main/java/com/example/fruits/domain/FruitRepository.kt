package com.example.fruits.domain

import com.example.fruits.domain.model.Fruit

interface FruitRepository {

    fun addFruit(fruit: Fruit)

    fun deleteFruit(fruit: Fruit)

    fun editFruit(fruit: Fruit)

    fun getFruitList(): List<Fruit>

    fun getFruit(fruitId: Int): Fruit
}