package com.students.main.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Semester {

	    private int semId;
	    
	    private int english;
	    private int maths;
	    private int science;
	    
	    public Semester(int semId)
	    {
	        this.semId = semId;
	    }
}
