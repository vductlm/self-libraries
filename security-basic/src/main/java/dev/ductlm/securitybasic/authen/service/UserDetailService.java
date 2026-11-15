package dev.ductlm.securitybasic.authen.service;

import dev.ductlm.securitybasic.authen.model.UserDetails;
import jakarta.persistence.EntityNotFoundException;

public interface UserDetailService {

    UserDetails loadUserByUsername(String username) throws EntityNotFoundException;

}
