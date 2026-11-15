package dev.ductlm.securitybasic.authen.model;

import dev.ductlm.securitybasic.authen.database.UserEntity;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class SecurityUser implements UserDetails {

    private final UserEntity user;

    public SecurityUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.user.getAuthority();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialNonExpired() {
        return false;
    }

    @Override
    public boolean isEnable() {
        return false;
    }
}
