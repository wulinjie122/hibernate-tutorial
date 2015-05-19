package org.hibernate.tutorial.controller;


import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class UserControllerTest {

	@Test
	public void testhandle41(){
		RestTemplate template = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String,String>();
		form.add("userName","tom");
		form.add("password", "12456");
		form.add("age", "45");
		template.postForLocation("http://localhost:8080/hibernate-tutorial/user/handle41", form);
	}
}
