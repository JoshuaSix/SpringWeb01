package com.ReactWeb.SpringWeb.controller;

import com.ReactWeb.SpringWeb.model.JobPost;
import com.ReactWeb.SpringWeb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller("/")
public class JobController {
    @Autowired
    private JobService service;

    @PostMapping("/addjob")
    public void addjob(){
        service.add(JobPost);
    }


    @GetMapping("/addjob")
    public void getAllJobs(){
    }

    @GetMapping("/addjob")
    public void getJob(){
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
