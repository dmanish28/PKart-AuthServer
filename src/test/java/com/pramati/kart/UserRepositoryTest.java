package com.pramati.kart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.pramati.kart.entities.User;
import com.pramati.kart.repository.UserRepository;

import junit.framework.Assert;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class UserRepositoryTest{

//	@Autowired
//	ApplicationContext applicationContext ;
//	
//	@Autowired
//	UserRepository userRepository;
//     
// 
//    /**
//     * Test the valid user
//     * */
//    @Test
//    public void testValidUser()
//    {
//    	
//    	
//        //Get the user by username from configured user details service
//        Optional<User> user = userRepository.findByUsername ("manish");
//        assertEquals("manish", user.get().getUsername());
//        
//    }
//         
//    /**
//     * Test the INVALID user
//     * */
//    @Test //(expected = AccessDeniedException.class)
//    public void testInvalidUser()
//    {
//    	 //Get the user by username from configured user details service
//        Optional<User> user = userRepository.findByUsername ("manish1");
//        assertFalse(user.isPresent());
//    }
}
