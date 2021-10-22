package com.cjh.git.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("hot-fix");
        System.out.println("aa");
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("master");
        System.out.println("master-to");
    }

}
