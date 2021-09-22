package com.edu.sparkinhoApp.database.entities

import com.edu.sparkinhoApp.models.dtos.UserDto
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Table

@Entity
@Table(name = "proj_user")
data class User (

    @Column(name = "user_id")
    @GeneratedValue
    val id: UUID? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "birthday")
    val birthday: Int

){
    constructor(userDto: UserDto) : this(
        id = userDto.id,
        name = userDto.name,
        birthday = userDto.birthday

    )

    @CreatedDate
    @Column(name = "created_date")
    lateinit var createdDate: LocalDateTime

    @Column(name = "update_date")
    lateinit var updateDate: LocalDateTime

}