package com.example.demo.dbseeder;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Component
public class DBSeeder implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Student str1=new Student("Prince Uppal", "Science",8);
		Student str2=new Student("Chelsea", "English",7);
		Student str3=new Student("Pooja Bhasin", "Math",9);
		
		this.studentRepository.deleteAll();
		
		List<Student> list=Arrays.asList(str1,str2,str3);
		studentRepository.save(list);
		
	}

}
