package com.soza.crud

import com.soza.crud.model.Squader
import com.soza.crud.repository.SquaderRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CrudApplication{


    @Bean
    fun init(repository: SquaderRepository) = CommandLineRunner{
        repository.save(Squader(1,"Delson"))
        repository.save(Squader(2,"Tacila"))
        repository.save(Squader(3,"Osvaldo"))
    }
}

fun main(args: Array<String>) {
    runApplication<CrudApplication>(*args)
}
