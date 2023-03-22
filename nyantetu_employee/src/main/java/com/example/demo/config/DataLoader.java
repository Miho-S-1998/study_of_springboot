package com.example.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {
	
	private final DepartmentRepository repository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		
		var President=new Department();
		President.setName("所長");
		repository.save(President);
		
		var prePresident=new Department();
		prePresident.setName("副所長");
		repository.save(prePresident);
		
		var master=new Department();
		master.setName("駅長");
		repository.save(master);
		
		var preMaster=new Department();
		preMaster.setName("副駅長");
		repository.save(preMaster);
		
		var foodLeader=new Department();
		foodLeader.setName("食事係長");
		repository.save(foodLeader);
		
		var preFoodLeader=new Department();
		preFoodLeader.setName("副食事係長");
		repository.save(preFoodLeader);
		
		var food=new Department();
		food.setName("食事係");
		repository.save(food);
		
		var bath=new Department();
		bath.setName("お風呂係");
		repository.save(bath);
		
		var part=new Department();
		part.setName("アルバイト");
		repository.save(part);
	
	}

}
