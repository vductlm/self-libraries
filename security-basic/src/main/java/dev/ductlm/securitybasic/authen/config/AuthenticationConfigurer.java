package dev.ductlm.securitybasic.authen.config;

import dev.ductlm.securitybasic.authen.model.DummyUser;
import dev.ductlm.securitybasic.authen.service.InMemoryUserService;
import dev.ductlm.securitybasic.authen.service.UserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AuthenticationConfigurer {

    @Bean
    public UserDetailService userDetailService() {
        return new InMemoryUserService(
                List.of(new DummyUser())
        );
    }

}
