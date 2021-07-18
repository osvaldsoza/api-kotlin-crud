package com.soza.crud

import com.soza.crud.model.Anime
import com.soza.crud.repository.AnimeRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CrudApplication{


    @Bean
    fun init(repository: AnimeRepository) = CommandLineRunner{
        repository.save(Anime(1,"Dragon Ball Z"))
        repository.save(Anime(2,"Naruto"))
        repository.save(Anime(3,"Death Note"))
    }
}

fun main(args: Array<String>) {
    runApplication<CrudApplication>(*args)
}
