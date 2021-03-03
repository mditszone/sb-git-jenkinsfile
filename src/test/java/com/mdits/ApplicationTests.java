package com.mdits;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mdits.Application;
import com.mdits.dao.UserRepository;
import com.mdits.model.User;
import com.mdits.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class ApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

//	@Test
//	public void getUsersTest() {
//		when(repository.findAll()).thenReturn(Stream
//				.of(new User(376, "Danile", 31, "USA"), 
//						new User(958, "Huy", 35, "UK")).collect(Collectors.toList()));
//		assertEquals(2, service.getUsers().size());
//	}


//	@Test
//	public void saveUserTest() {
//		User user = new User(999, "Pranya", 33, "Pune");
//		when(repository.save(user)).thenReturn(user);
//		assertEquals(user, service.addUser(user));
//	}

	@Test
	public void deleteUserTest() {
		User user = new User(999, "Pranya", 33, "Pune");
		service.deleteUser(user);
		verify(repository, times(1)).delete(user);
	}

}
