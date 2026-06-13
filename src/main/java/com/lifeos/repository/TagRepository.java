package com.lifeos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeos.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
