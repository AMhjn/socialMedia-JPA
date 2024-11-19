package com.social.media.repositories;

import com.social.media.model.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<SocialGroup, Long> {
}
