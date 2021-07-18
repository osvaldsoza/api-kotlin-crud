package com.soza.crud.repository

import com.soza.crud.model.Anime
import org.springframework.data.repository.CrudRepository

interface AnimeRepository:CrudRepository<Anime,Long> {

}