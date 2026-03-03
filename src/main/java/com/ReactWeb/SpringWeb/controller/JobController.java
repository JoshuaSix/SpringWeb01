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
    public String addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return "successful!";
    }

    @GetMapping("jobPost/{postId}")
    public  JobPost findJobById(@PathVariable int postId){
        return service.findJobById(postId);
    }

    @PutMapping("addjob")
    public String updatejobPost(@RequestBody JobPost jobPost){
        service.updateJobPost(jobPost);
        return "update successful!";
    }

    @DeleteMapping("addjob/{postId}")
    public String deleteJobById(@PathVariable int postId){
        service.deleteJob(postId);
        return "delete successful!";
    }

    @GetMapping("/addjob/{keyword}")
    public List<JobPost> search(@PathVariable String keyword){
        return service.search(keyword);

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
