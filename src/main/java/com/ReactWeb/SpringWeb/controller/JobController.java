package com.ReactWeb.SpringWeb.controller;

import com.ReactWeb.SpringWeb.model.JobPost;
import com.ReactWeb.SpringWeb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/test")
public class JobController {
    @Autowired
    private JobService service;


    @GetMapping("addjob")
    public List<JobPost> getAllJobs(){
        return service.findAllJobs();
    }
    @PostMapping("addjob")
    public String addJob(JobPost jobPost){
        service.addJob(jobPost);
        return "Success";
    }

    @GetMapping("jobPost/{postId}")
    public  JobPost findJobById(@PathVariable int postId){
        return service.findJobById(postId);
    }






//    @PostMapping()
//    public String handleForm(JobPost jobPost){
//        service.addJob(jobPost);
//        return "success";
//    }


//    @GetMapping("viewalljobs")
//    public String viewalljobs(Model model){
//        List<JobPost> jobPostList = service.getallJob();
//        System.out.println(jobPostList);
//        model.addAttribute("jobPosts",jobPostList);
//        return "viewalljobs";
//    }
}
