package com.neusoft.test;

import com.neusoft.dao.AdminDao;
import elemeAdmin.src.com.neusoft.view.impl.AdminDaoImpl;
import com.neusoft.domain.Admin;

/**
 * @author Eric Lee
 * @date 2020/8/7 10:01
 */
public class TestAdmin {
    public static void main(String[] args) {
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.getAdminByNameByPass("zhangsan", "123");
        System.out.println(admin);
    }
}
