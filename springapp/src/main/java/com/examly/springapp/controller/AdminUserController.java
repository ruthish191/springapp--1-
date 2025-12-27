package com.examly.springapp.controller;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
    
    @Autowired
    private AdminUserService adminUserService;
    
    @PostMapping("/create")
    public AdminUser addAdmin(@RequestBody AdminUser adminUser) {
        return adminUserService.saveAdminUser(adminUser);
    }
    
    @GetMapping("/{id}")
    public AdminUser getAdminById(@PathVariable Long id) {
        return adminUserService.getAdminUserById(id);
    }
    
    @PutMapping("/{id}")
    public AdminUser updateAdmin(@PathVariable Long id, @RequestBody AdminUser adminUser) {
        return adminUserService.updateAdminUser(id, adminUser);
    }
    
    @GetMapping
    public List<AdminUser> getAllAdmins() {
        return adminUserService.getAllAdminUsers();
    }
}