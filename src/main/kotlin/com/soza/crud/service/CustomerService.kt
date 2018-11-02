package com.soza.crud.service

import com.soza.crud.model.Customer
import com.soza.crud.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var repository: CustomerRepository

    fun findAll() = repository.findAll()

    fun findByLastName(name:String) = repository.findByLastName(name)

    fun save(customer: Customer) = repository.save(customer)

    fun deleteById(id:Long) = repository.deleteById(id)
}