# school_management

Project by Shambhavi Jagadeesh

Assumptions made for the following project:

-The school management system has four tables- student, teacher, subject and class. Here one standard is considered with different sections.

-One teacher can handle only one subject. One class can have only one class teacher. One student can belong to only one class.

-The API used is REST API.

-CRUD operations can be performed on each table via the API.

-The authentication is done using JWT Token. The generation of the Token has been done once using the username “school” and password “password” and the secret key “shambhavi”. The Token is given below for further use. The Token has to be entered in the Header field of Postman with the key as Authorization and the value as:

	Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzY2hvb2wiLCJleHAiOjE2MjkwNjI5MzQsImlhdCI6MTYyOTA0NDkzNH0.VwgrpFD894iEO4GMQUqTtsy7I7AmO4f4L9rUBN-QxVfTCHa7vPwXrdzgqtBaamMFp0F5QGL_68W8D-Xv1w9Ngg

-The scheduler returns the number of students, teachers, subjects and classes in the form of a report every hour.



Tools used for the project:

Java 16

Spring Boot

PostgreSQL 12

Hibernate

Postman



URLs to check in postman

Subjects
	
	Get all: /subjects
	
	Get one: /subjects/{subjectId}
	
	Post: /subjects
	
	Put: /subjects
	
	Delete: /subjects

Teacher
	
	Get all: /teachers
	
	Get one: /teachers/{teacherId}
	
	Post: /teachers
	
	Put: /teachers
	
	Delete: /teachers

Classes
	
	Get all: /classes
	
	Get one: /classes/{classId}
	
	Post: /classes
	
	Put: /classes
	
	Delete: /classes

Student
	
	Get all: /students
	
	Get one: /students/{studentId}
	
	Post: /students
	
	Put: /students
	
	Delete: /students
	


NOTE1: In case the JWT Token has expired, execute /authenticate url and add

	{
					 "username": "school"
					 "password":  "password"
	}

in the body. You will get the new JWT Token, add that in the header.



NOTE2: The primary keys (classid, studentid, teacherid, subjectid) are auto-increment. Therefore there is no need to write them in JSON format in the body in POST. However, you will have to mention the id for PUT.

Example: For student
POST

	{
		"fname": "VAISHNAVI",
		"lname": "J",
		"dob": "23-04-2000",
		"phone": "7411063258",
		"address": "BANGALORE",
		"gender": "F",
		"classid": 3
	}

PUT  (add the updated values in place of "...")

	{
			"id": 5,
					"fname": "...",
					"lname": "...",
					"dob": "...",
					"phone": "...",
					"address": "...",
					"gender": "...",
					"classid": ...
	}





The project is a simplified example of school management system. Further improvements can be made to make it more efficient.

Authentication can be improved by creating a table for users in the database and a new JWT Token can be created for each user and checked with the database.

More tables can be added with additional information like marks, attendance, etc.

The report for scheduler can be retrieved in the form of a document instead viewing it on the console.



