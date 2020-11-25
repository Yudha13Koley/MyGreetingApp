package com.capgemini.myapps.service;

import com.capgemini.myapps.model.Greeting;
import com.capgemini.myapps.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);
}
