package com.edu.sparkinhoApp.models.dtos


import com.edu.sparkinhoApp.database.entities.User
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class UserListDto(
    @JsonProperty("id")
    val id: UUID?,

    @JsonProperty("name")
    val name: String
){
    constructor(user: User): this(
        id = user.id,
        name = user.name
    )
}
