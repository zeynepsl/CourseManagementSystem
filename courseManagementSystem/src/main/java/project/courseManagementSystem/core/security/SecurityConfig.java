package project.courseManagementSystem.core.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebSecurity //bir projede web güvenliği sağlamak için kullanılan birincil spiring güvenlik anatasyonu.
@EnableGlobalMethodSecurity(prePostEnabled = true) //ek açıklamalara dayanır, yöntem düzeyinde güvenlik sağlamak için kullanılır.

public class SecurityConfig extends WebSecurityConfigurerAdapter{	
	/*
	 SecurityConfig sınıfı WebSecurityConfigurerAdapter'ı extend eder 
	 ve özel güvenlik yapılandırmaları sağlamak için bazı yöntemlerini geçersiz kılar
	 */
	@Autowired
    private CustomUserDetailsService userDetailsService;

	
	//Parolaları şifrelemek için Spring security tarafından sağlanan BCryptPasswordEncoder sınıfını kullanıyoruz
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //stackoverflow:
    //uygulamayı başlattıgında login olmanı istemez:
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests().antMatchers("/*").permitAll()
                .and()
                .csrf().disable();

    }
    /*java guides:
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/**").permitAll()
                .antMatchers("/api/auth/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
                }
        /*
         .antMatchers("/api/auth/**").permitAll() -->>
         güvenlik yapılandırmasıyla herkesin giriş yapmasına 
         ve REST API'sine kaydolmasına izin veriyoruz:
         */
    

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    //    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        UserDetails ramesh = User.builder().username("ramesh").password(passwordEncoder()
//                .encode("password")).roles("USER").build();
//        UserDetails admin = User.builder().username("admin").password(passwordEncoder()
//                .encode("admin")).roles("ADMIN").build();
//        return new InMemoryUserDetailsManager(ramesh, admin);
//    }
}
