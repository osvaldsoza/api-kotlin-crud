package com.soza.crud.repository

import com.soza.crud.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository:CrudRepository<Customer,Long> {

    fun findByLastName(name:String): List<Customer>
}