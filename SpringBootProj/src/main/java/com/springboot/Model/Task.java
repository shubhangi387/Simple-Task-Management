package com.springboot.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String title;
	    private String description;
	    @Enumerated(EnumType.STRING)
	    @Column(nullable = false)
	    private Status status;
	    private LocalDate dueDate;
	public enum Status {
        PENDING,
        IN_PROGRESS,
        COMPLETED
    }

}
