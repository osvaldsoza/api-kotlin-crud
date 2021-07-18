package com.soza.crud.service

import com.soza.crud.model.Anime
import com.soza.crud.repository.AnimeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AnimeService {

    @Autowired
    lateinit var repository: AnimeRepository

    fun findAll() = repository.findAll()

    fun save(anime: Anime) = repository.save(anime)


    fun update(anime: Anime, id: Long): Anime {
        val animeFinded = repository.findById(id)
        var newAnime = Anime()
        animeFinded.ifPresent {
            animeFinded.get().name = anime.name
            newAnime = save(animeFinded.get())
        }
        return newAnime
    }

    fun deleteById(id: Long) = repository.deleteById(id)
}