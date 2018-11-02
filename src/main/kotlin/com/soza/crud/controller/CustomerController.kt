package com.soza.crud.controller

import com.soza.crud.model.Customer
import com.soza.crud.repository.CustomerRepository
import com.soza.crud.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController

class CustomerController {

    @Autowired
   lateinit var service: CustomerService

    @GetMapping("/customers")
    fun listCustomers() =  service.findAll()

    @GetMapping("/customer{name}")
    fun findCustomerByLastName(@PathVariable name:String) = service.findByLastName(name)

    @PostMapping("/customer")
    fun saveCustomer(@RequestBody  customer: Customer) = service.save(customer)

    @DeleteMapping("/customer/{id}")
    fun deleteCustomer(@PathVariable id:Long) = service.deleteById(id)
}