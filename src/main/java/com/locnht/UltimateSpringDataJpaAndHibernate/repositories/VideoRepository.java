package com.locnht.UltimateSpringDataJpaAndHibernate.repositories;

import com.locnht.UltimateSpringDataJpaAndHibernate.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
