package com.in28minutes.spring.basics.springin5steps.profiles;

public class NormalCache implements Cacheable {

	@Override
	public void doSomething() {
		System.out.println("Normal Cache");
	}

}
