package com.example.student.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.student.entity.Student;
import com.example.student.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService sr;
	
	@RequestMapping("/greeting")
	public String greeting(){
		return "Hii";
	}
	
	  @RequestMapping(value = "/insert/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String insert(@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.insertStudent(st);
	        return "Inserted successfully";

	    }
	  @RequestMapping(value = "/update/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String update(@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.updateStudent(st);
	        return "updated successfully";

	    }
	  
	  @RequestMapping(value = "/delete/{name}/{hostel}/{course}/{college}/{gender}/{city}", method = RequestMethod.GET)
	    public String delete(@PathVariable("name") String name, @PathVariable("hostel") String hostel,
	            @PathVariable("course") String course, @PathVariable("college") String college, @PathVariable("gender") String gender,
	            @PathVariable("city") String city) {

	         Student st=new Student();
	         st.setName(name);
	         st.setHostel(hostel);
	         st.setCourse(course);
	         st.setCollege(college);
	         st.setCollege(college);
	         st.setGender(gender);
	         st.setCity(city);
	         sr.deleteStudent(st);
	        return "deleted successfully";

	    }
	  
	  @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
	    public String get(@PathVariable("name") Long key) {
	         Student obj= sr.getStudent(key);
	        return obj.toString();

	    }
}


