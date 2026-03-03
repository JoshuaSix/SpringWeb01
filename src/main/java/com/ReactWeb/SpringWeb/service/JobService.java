package com.ReactWeb.SpringWeb.service;

import com.ReactWeb.SpringWeb.model.JobPost;
import com.ReactWeb.SpringWeb.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
      @Autowired
      private JobRepo repo;

      public void addJob(JobPost jobPost){
          repo.save(jobPost);
      }

      public JobPost findJobById(int postId){
          return repo.findById(postId).get();
      }

      public List<JobPost> findAllJobs(){
          return repo.findAll();
      }


      public String updateJobPost(JobPost jobPost){
          repo.save(jobPost);
          return  "succesfully updated job";
      }

      public void deleteJob(int postId) {
          repo.deleteById(postId);
      }
}
