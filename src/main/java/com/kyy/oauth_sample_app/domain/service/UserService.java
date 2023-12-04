package com.kyy.oauth_sample_app.domain.service;

import com.kyy.oauth_sample_app.domain.model.Users;
import com.kyy.oauth_sample_app.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public void processOAuthPostLogin(String username, String provider) {
        Users existUsers = repo.findByUsername(username);

        if (existUsers == null) {
            Users newUsers = new Users();
            newUsers.setUsername(username);
            newUsers.setProvider(provider);
            newUsers.setEnabled(true);

            repo.save(newUsers);
        }
    }
}