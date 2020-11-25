package com.capgemini.myapps.service;

import java.util.List;

import com.capgemini.myapps.model.Greeting;
import com.capgemini.myapps.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAllGreeting();

	Greeting getEditedGreeting(Greeting greeting);

	boolean deleteGreetingById(long id);
}
