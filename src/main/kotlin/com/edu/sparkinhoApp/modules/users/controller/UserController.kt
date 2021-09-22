package com.edu.sparkinhoApp.modules.users.controller

import com.edu.sparkinhoApp.models.dtos.UserDto
import com.edu.sparkinhoApp.models.dtos.UserListDto
import com.edu.sparkinhoApp.modules.users.service.UserService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun getUserList():List<UserListDto> = userService.getUserList()

    @PostMapping
    fun createUser(@RequestBody userDto: UserDto): UserDto = userService.createUser(userDto)

    @GetMapping("{id}")
    fun getUser(@PathVariable id: UUID): UserDto = userService.getUser(id)
}