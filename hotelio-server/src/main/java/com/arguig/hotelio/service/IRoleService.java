package com.arguig.hotelio.service;

import com.arguig.hotelio.model.Role;
import com.arguig.hotelio.model.User;

import java.util.List;

/**
 * @author arguig
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
