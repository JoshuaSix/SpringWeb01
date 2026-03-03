package com.ReactWeb.SpringWeb.repo;

import com.ReactWeb.SpringWeb.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepo extends JpaRepository<JobPost,Integer> {

        List<JobPost> findBypostProfileContainingOrPostDescContaining(String keyword1, String keyword2);
    }
