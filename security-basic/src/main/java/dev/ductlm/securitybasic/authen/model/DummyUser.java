package dev.ductlm.securitybasic.authen.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class DummyUser implements UserDetails {
    @Override
    public String getUsername() {
        return "Bill";
    }

    @Override
    public String getPassword() {
        return "1234";
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> "READ");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialNonExpired() {
        return true;
    }

    @Override
    public boolean isEnable() {
        return true;
    }
}
