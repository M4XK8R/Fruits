package com.example.fruits.domain.interactors

import com.example.fruits.domain.FruitRepository
import com.example.fruits.domain.model.Fruit

class GetFruitListUseCase(private val fruitRepository: FruitRepository) {

    fun getFruitList(): List<Fruit> {
        return fruitRepository.getFruitList()
    }
}