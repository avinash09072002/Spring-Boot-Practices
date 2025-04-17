package com.nt.service;

import java.util.List;

import com.nt.document.Teacher;

public interface ITeacherService {
	
	
	public List<Teacher> showTeacher();
	
	public Teacher saveTeacher(Teacher teacher);

}
