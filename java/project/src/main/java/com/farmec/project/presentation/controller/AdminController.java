package com.farmec.project.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmec.project.presentation.payload.response.RoleMessage;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    
    @PostMapping("/index")
    public ResponseEntity<?> index() {

        return  ResponseEntity.ok(new RoleMessage("admin成功したよ!"));
    }
}
