package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Teacher;
import com.nt.repository.ITeacherRepository;

@Service
public class TeacherServiceImplementation implements ITeacherService {

	@Autowired
	private ITeacherRepository repository;
	
@Override
	public List<Teacher> showTeacher() {
		// TODO Auto-generated method stub
	   List<Teacher> teachrsList=repository.findAll();
	    return teachrsList;
	}
@Override
public Teacher saveTeacher(Teacher teacher) {
	
	        Teacher teachers=repository.save(teacher);
	return teachers;
}

}
