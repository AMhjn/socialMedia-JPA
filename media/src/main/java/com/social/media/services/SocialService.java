package com.social.media.services;

import com.social.media.model.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService {

    @Autowired
    SocialUserRepository socialUserRepository;

    public List<SocialUser> getAllUsers() {
        return socialUserRepository.findAll();
    }

    public SocialUser saveUSer(SocialUser socialUser) {
        return socialUserRepository.save(socialUser);
    }

    public SocialUser deleteUser(Long id) {
        SocialUser user = socialUserRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found !"));
        socialUserRepository.delete(user);
        return user;
    }
}
