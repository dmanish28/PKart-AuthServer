package com.pramati.kart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.userdetails.UserDetails;

import com.pramati.kart.entities.User;
import com.pramati.kart.enums.Role;
import com.pramati.kart.repository.UserRepository;
import com.pramati.kart.security.JpaUserDetailService;
import com.pramati.kart.security.UserDetailsImpl;

@SpringBootTest
class AuthServerApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Autowired
	ApplicationContext applicationContext ;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	JpaUserDetailService jpaUserDetailService ;
     
 
    /**
     * Test the valid user
     * */
    @Test
    public void testValidUser()
    {
    	
    	
        //Get the user by username from configured user details service
        Optional<User> user = userRepository.findByUsername ("manish");
        assertEquals("manish", user.get().getUsername());
        
    }
         
    /**
     * Test the INVALID user
     * */
    @Test //(expected = AccessDeniedException.class)
    public void testInvalidUser()
    {
    	 //Get the user by username from configured user details service
        Optional<User> user = userRepository.findByUsername ("manish1");
        assertFalse(user.isPresent());
    }
    
    
    @Test //(expected = AccessDeniedException.class)
    public void testLoadUserDetails()
    {
    	 //Get the user by username from configured user details service
    	User user = new User();
    	user.setUsername("manish");
    	user.setPassword("manish");
    	user.setRoles(Role.ROLE_USER);
    	UserDetails userDetailsExpected = new UserDetailsImpl(user);
        UserDetails userDetails = jpaUserDetailService.loadUserByUsername("manish");
        assertEquals(userDetailsExpected.getUsername(), userDetails.getUsername());
        assertEquals(userDetailsExpected.getPassword(), userDetails.getPassword());
    }
    
}
