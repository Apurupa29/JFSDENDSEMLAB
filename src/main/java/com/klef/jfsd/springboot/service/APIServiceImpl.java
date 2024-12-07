package com.klef.jfsd.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class APIServiceImpl implements APIService
{

  @Autowired
  private RestTemplate restTemplate;
  
//  @Override
//  public List<Object> displayAllStudents() 
//  {
//    Object[] students =  restTemplate.getForObject("http://localhost:2021/student/viewall", Object[].class);
//    return Arrays.asList(students);
//  }

//  @Override
//  public Object displayStudentById(int sid) 
//  {
//    return restTemplate.getForObject("http://localhost:2021/student/display?id="+sid, Object.class);
//    
//  }

  @Override
  public List<Object> displayAllUsers() {
    Object[] users =  restTemplate.getForObject("https://fakestoreapi.com/products", Object[].class);
    return Arrays.asList(users);
  }

//@Override
//public Object displayUserById(int uid) {
//	return restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+uid, Object.class);
//}

}