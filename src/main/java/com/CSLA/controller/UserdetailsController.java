package com.CSLA.controller;

import com.CSLA.entity.Userdetails;
import com.CSLA.service.UserdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserdetailsController  {

    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    @GetMapping("/profile")
    public String userProfile() {
        return "User Profile";
    }

    @Autowired
    private UserdetailsService service;

    @PostMapping("/")
    @PreAuthorize("hasAnyAuthority('ROLE_Admin', 'ROLE_Manager', 'ROLE_User')")
    public ResponseEntity<Userdetails> createUserdetails(@RequestBody Userdetails userdetails) {
        Userdetails savedUserdetails = service.saveUserdetails(userdetails);
        return ResponseEntity.ok(savedUserdetails);
    }

}
