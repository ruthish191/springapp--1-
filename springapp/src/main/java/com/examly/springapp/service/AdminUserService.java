package com.examly.springapp.service;

import com.examly.springapp.model.AdminUser;
import java.util.List;

public interface AdminUserService {
    AdminUser saveAdminUser(AdminUser adminUser);
    AdminUser getAdminUserById(Long id);
    AdminUser updateAdminUser(Long id, AdminUser adminUser);
    List<AdminUser> getAllAdminUsers();
}