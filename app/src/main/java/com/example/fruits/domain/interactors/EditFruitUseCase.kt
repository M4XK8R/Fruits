package com.example.fruits.domain.interactors

import com.example.fruits.domain.FruitRepository
import com.example.fruits.domain.model.Fruit

class EditFruitUseCase (private val fruitRepository: FruitRepository){

    fun editFruit(fruit: Fruit) {
        fruitRepository.editFruit(fruit)
    }
}