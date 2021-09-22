package com.edu.sparkinhoApp.models.dtos


import com.edu.sparkinhoApp.database.entities.User
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class UserDto(
    @JsonProperty("id")
    val id: UUID? = null,

    @JsonProperty("id")
    val name: String,

    @JsonProperty("birthday")
    val birthday: Int
){
    constructor(user: User): this(
        id = user.id,
        name = user.name,
        birthday = user.birthday
    )
}
