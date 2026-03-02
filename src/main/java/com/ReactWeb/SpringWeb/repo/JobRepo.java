package com.ReactWeb.SpringWeb.repo;

import com.ReactWeb.SpringWeb.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<JobPost,Integer> {

    JobPost updateJobPost(JobPost jobPost);
}
