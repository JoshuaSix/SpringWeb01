package com.ReactWeb.SpringWeb.service;

import com.ReactWeb.SpringWeb.model.JobPost;
import com.ReactWeb.SpringWeb.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.function.EntityResponse;

public class JobService {
      @Autowired
      private JobRepo repo;

      public String add(JobPost jobPost){
          repo.save(jobPost);
          return "success";
      }

}
