package com.example.fruits.domain.interactors

import com.example.fruits.domain.FruitRepository
import com.example.fruits.domain.model.Fruit

class AddFruitUseCase (private val fruitRepository: FruitRepository){

    fun addFruit(fruit: Fruit) {
       fruitRepository.addFruit(fruit)
    }
}