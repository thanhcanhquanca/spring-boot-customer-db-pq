package com.example.sp_customer_db_pq.service.role;

import com.example.sp_customer_db_pq.model.Role;
import com.example.sp_customer_db_pq.service.IGenerateService;

public interface IRoleService extends IGenerateService<Role> {
    Role findByName(String name);
}
