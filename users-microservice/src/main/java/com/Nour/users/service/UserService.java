package com.Nour.users.service;

import com.Nour.users.entities.Role;
import com.Nour.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
