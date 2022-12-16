package com.app.springsecurity.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Log4j2
public class CustomSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // Security의 설정
        // 1. 요청(URL) 에 대한 인증과 허가에 대한 설정
        http.authorizeHttpRequests()
                .antMatchers("/sample/sample").authenticated()  // 해당 경로 요청시 인증을 요구
                .antMatchers("/sample/all").permitAll()
                .antMatchers("/sample/member").hasRole("USER")
                .antMatchers("/sample/admin").hasRole("ADMIN");

        // 2. form 기반 인증처리 : 커스텀 로그인 페이지 설정 -> 성공시 처리하는 핸들러 객체 등록
        http.formLogin();

        // 3. 허가 실패 403 : 권한 부족의 처리 핸들러 등록
        // 4. 로그아웃
        http.logout();

        // 5. 자동 로그인

        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();

    }


    // 테스트 환경
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails userDetails = User.builder()
                                    .username("user1")
                                    .password(passwordEncoder().encode("1111"))
                                    .roles("USER")
                                    .build();

        log.info(">>>>>>>>>>>>> userDetailService : " + passwordEncoder().encode("1111"));
        log.info(">>>>>>>>>>>>> " + userDetails);

        return new InMemoryUserDetailsManager(userDetails);
    }

}
