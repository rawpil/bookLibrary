package com.itfbgroup.ivanovii.bookLibrary.service;

import com.itfbgroup.ivanovii.bookLibrary.repository.UserRepository;
import com.itfbgroup.ivanovii.bookLibrary.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ivanov Ivan
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findUserByUsername( username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        List<SimpleGrantedAuthority> authorities = Arrays.asList(
                new SimpleGrantedAuthority(user.getUsername().equals("admin")?"ROLE_ADMIN":"ROLE_USER"));

        return new User(user.getUsername(), user.getPassword(), authorities);
    }

}
