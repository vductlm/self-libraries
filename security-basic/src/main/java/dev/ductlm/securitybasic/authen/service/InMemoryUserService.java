package dev.ductlm.securitybasic.authen.service;

import dev.ductlm.securitybasic.authen.model.UserDetails;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserService implements UserDetailService {

    private final List<UserDetails> users;

    public InMemoryUserService(List<UserDetails> users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws EntityNotFoundException {
        return this.users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst().orElseThrow(() -> new EntityNotFoundException("........"));
    }
}
