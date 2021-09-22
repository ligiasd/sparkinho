package com.edu.sparkinhoApp.modules.users.service


import com.edu.sparkinhoApp.database.entities.User
import com.edu.sparkinhoApp.models.dtos.UserDto
import com.edu.sparkinhoApp.models.dtos.UserListDto
import com.edu.sparkinhoApp.modules.users.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class UserServiceImpl(
    private val userRepository: UserRepository
    ) : UserService {

    override fun getUserList(): List<UserListDto> {
        return userRepository.findAll()
            .map { UserListDto(it) }
    }

    override fun createUser(userDTO: UserDto): UserDto {
        val user = User(userDTO)
        val savedUser = userRepository.save(user)
        return UserDto(savedUser)
    }

    override fun getUser(id: UUID): UserDto {
        val user = userRepository.getById(id)
        return UserDto(user)
    }

    override fun deleteUser(id: Int): User {
        TODO("Not yet implemented")
    }

    override fun updateUser(id: Int, userDTO: User): User {
        TODO("Not yet implemented")
    }

    override fun getUserByToken(token: String): User {
        TODO("Not yet implemented")
    }
}