package com.soza.crud.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long
    var firstName:String
    var lastName:String

    constructor(firstName:String, lastName:String){
        this.firstName = firstName
        this.lastName = lastName
        this.id = 0
    }
}
