package dev.ductlm.securitybasic.authen.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
public class UserEntity {
    @Id
    private UUID id;

    private String username;
    private String password;
    private boolean isActive;
    private String authority;

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return isActive;
    }

    public Collection<? extends GrantedAuthority> getAuthority() {
        return List.of(() -> authority);
    }
}
