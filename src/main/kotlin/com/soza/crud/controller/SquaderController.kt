package com.soza.crud.controller

import com.soza.crud.model.Squader
import com.soza.crud.service.SquaderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController

@RequestMapping("/squader")
class SquaderController {

    @Autowired
    lateinit var service: SquaderService

    @GetMapping
    fun findAll(): MutableIterable<Squader> = service.findAll()

    @PostMapping
    fun save(@RequestBody squader: Squader) = service.save(squader)

    @PutMapping("/{id}")

    fun update(@RequestBody squader: Squader, @PathVariable id: Long): Squader = service.update(squader, id)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = service.deleteById(id)
}