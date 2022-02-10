package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private UtilisateurRepository utilisateurService;
	@Test
	void contextLoads() {
	}
    @Test
        //persist test
    void testPersist(){
      Utilisateur user = new Utilisateur();
      user.setFullName("test");
      user.setEmail("test@gmail.com");
      Utilisateur userTest = utilisateurService.save(user);
      assertTrue(userTest.equals(user));
    }
   @Test
       //list user
    void testGetAll(){
       List<Utilisateur> list = utilisateurService.findAll();
       assertTrue(list.size() > 0);
   }
}
