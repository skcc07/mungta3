package com.demo.user.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User{

    @Override
    public String speak() {
        return "멍멍";
    }

    @Override
	public void eat(){
		energy = energy + 2;
	}
    
}
