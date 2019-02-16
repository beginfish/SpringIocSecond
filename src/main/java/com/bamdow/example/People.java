package com.bamdow.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class People {

	private String name;
	
	
	/**
	 * @Qualifier注解 区分唯一bean
	 */
	@Autowired
	@Qualifier("apple")
	private Fruit fruit;
	
	public People(){
		
	}
	
	public People(String name){
		this.name = name;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(){
		if( fruit==null ){
			System.out.println(name+" don not have a fruits");
		}else{
			System.out.println(name+"eat..."+fruit);
		}
		
	}
}
