package com.github.titovart.graal.stat.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "auth-service", url = "graal-auth.herokuapp.com")
interface AuthClient {

    @RequestMapping(method = [RequestMethod.GET], value = ["/me"])
    fun me(@RequestHeader("Authorization") token: String): ResponseEntity<AuthResponse>
}
