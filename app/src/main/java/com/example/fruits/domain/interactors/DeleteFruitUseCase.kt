package com.example.fruits.domain.interactors

import com.example.fruits.domain.FruitRepository
import com.example.fruits.domain.model.Fruit

class DeleteFruitUseCase(private val fruitRepository: FruitRepository) {

    fun deleteFruit(fruit: Fruit) {
        fruitRepository.deleteFruit(fruit)
    }
}