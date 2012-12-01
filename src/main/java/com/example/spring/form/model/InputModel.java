package com.example.spring.form.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class InputModel {
	private String name;
	@Min(0)
	@Max(200)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
