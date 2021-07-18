package com.soza.crud.controller

import com.soza.crud.model.Anime
import com.soza.crud.service.AnimeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController

@RequestMapping("/anime")
class AnimeController {

    @Autowired
    lateinit var service: AnimeService

    @GetMapping
    fun listCustomers() = service.findAll()

    @PostMapping
    fun saveCustomer(@RequestBody anime: Anime) = service.save(anime)

    @PutMapping("/{id}")
    fun updateCustomer(@RequestBody anime: Anime, @PathVariable id: Long): Anime = service.update(anime, id)

    @DeleteMapping("{id}")
    fun deleteCustomer(@PathVariable id: Long) = service.deleteById(id)
}