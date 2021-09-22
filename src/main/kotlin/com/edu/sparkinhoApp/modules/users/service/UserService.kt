package com.edu.sparkinhoApp.modules.users.service

import com.edu.sparkinhoApp.database.entities.User
import com.edu.sparkinhoApp.models.dtos.UserDto
import com.edu.sparkinhoApp.models.dtos.UserListDto
import java.util.*

interface UserService {
    fun getUserList(): List<UserListDto>
    fun createUser(userDto: UserDto): UserDto
    fun getUser(id: UUID): UserDto
    fun deleteUser(id: Int): User
    fun updateUser(id: Int, userDTO: User): User
    fun getUserByToken(token: String): User
}