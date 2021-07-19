package com.soza.crud.service

import com.soza.crud.model.Squader
import com.soza.crud.repository.SquaderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SquaderService {

    @Autowired
    lateinit var repository: SquaderRepository

    fun findAll(): MutableIterable<Squader> = repository.findAll()

    fun save(squader: Squader) = repository.save(squader)

    fun update(squader: Squader, id: Long): Squader {
        val animeFinded = repository.findById(id)
        var newAnime = Squader()
        animeFinded.ifPresent {
            animeFinded.get().name = squader.name
            newAnime = save(it)
        }
        return newAnime
    }

    fun deleteById(id: Long) = repository.deleteById(id)
}