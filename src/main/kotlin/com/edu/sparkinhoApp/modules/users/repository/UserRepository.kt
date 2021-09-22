package com.edu.sparkinhoApp.modules.users.repository

import com.edu.sparkinhoApp.database.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {
    fun getUserList(): List<User>
    fun saveUser(user: User): User
    fun getUser(id: Int): User?
    fun removeUser(id: Int): User?
    fun updateUser(id: Int, user: User): User
    fun getUserByToken(token: String): User?

}
