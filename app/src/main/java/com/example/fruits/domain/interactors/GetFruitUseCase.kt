package com.example.fruits.domain.interactors

import com.example.fruits.domain.FruitRepository
import com.example.fruits.domain.model.Fruit

class GetFruitUseCase (private val fruitRepository: FruitRepository){

    fun getFruit(fruitId: Int): Fruit {
        return fruitRepository.getFruit(fruitId)
    }
}