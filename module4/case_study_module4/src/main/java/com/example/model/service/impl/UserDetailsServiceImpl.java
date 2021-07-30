package com.example.model.service.impl;


import com.example.model.entity.employee.AppRole;
import com.example.model.entity.employee.AppUser;
import com.example.model.entity.employee.UserRole;
import com.example.model.repository.AppRoleRepository;
import com.example.model.repository.AppUserRepository;
import com.example.model.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private AppRoleRepository appRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AppUser appUser = this.appUserRepository.findByUserName(userName);

        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }

        System.out.println("Found User: " + appUser);

        // [ROLE_USER, ROLE_ADMIN,..]
        List<UserRole> userRoles = this.userRoleRepository.findByAppUser(appUser);

        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), //
                appUser.getEncrytedPassword(), grantList);

        return userDetails;
    }
    public AppUser findByIdAppUser(Long id){
        return appUserRepository.findById(id).orElse(null);
    }
    public void addAppUser(AppUser appUser){
        appUserRepository.save(appUser);
        UserRole userRole=new UserRole();
        userRole.setAppUser(appUser);
        AppRole appRole=appRoleRepository.findByRoleName("ROLE_USER");
        userRole.setAppRole(appRole);
        userRoleRepository.save(userRole);
    }
    public void addAppUser1(AppUser appUser){
        appUserRepository.save(appUser);
    }
    public void addUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
    public List<AppRole> findAllAppRole(){
        return (List<AppRole>) appRoleRepository.findAll();
    }
    public List<AppUser> findAllAppUser(){
        return (List<AppUser>) appUserRepository.findAll();
    }
    public AppRole findByIdAppRole(Long id){
        return appRoleRepository.findById(id).orElse(null);
    }

    public void addAppAdmin(AppUser appUser){
        appUserRepository.save(appUser);
        UserRole userRole=new UserRole();
        userRole.setAppUser(appUser);
        AppRole appRole=appRoleRepository.findByRoleName("ROLE_ADMIN");
        userRole.setAppRole(appRole);
        userRoleRepository.save(userRole);
    }
    public AppUser findByName(String name){
       return appUserRepository.findByUserName(name);

    }
}
