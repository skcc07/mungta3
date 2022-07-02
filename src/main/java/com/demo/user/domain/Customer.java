package com.demo.user.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("user")
public class Customer extends User{

    @Override
    public String speak() {
        return "냐옹";
    }

    @Override
	public void sleep(){
		energy = energy + 1;
        appearance = appearance + 1;
	}

}
