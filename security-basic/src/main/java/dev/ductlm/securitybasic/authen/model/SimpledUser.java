package dev.ductlm.securitybasic.authen.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class SimpledUser implements UserDetails {

    private final String username;
    private final String password;

    public SimpledUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
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

    public static UserBuilder withUsername(String username) {
        return new UserBuilder(username);
    }

    public static class UserBuilder {
        private final String username;
        private String password;

        public UserBuilder(String username) {
            this.username = username;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public SimpledUser build() {
            return new SimpledUser(this.username, this.password);
        }

    }

}
