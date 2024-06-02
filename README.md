<h1> Spring-Boot REST-API CRUD </h1>
# Project Description:
======================

Constructed a robust Spring Boot Hibernate/JPA project focusing on comprehensive CRUD ( Create, Read, Update, Delete ) operations for the Student model. 
Leveraging JPARepository for streamlined database interactions and EntityManager for precise transaction management,
the application ensures efficient data handling. Notably, global exception handling is implemented using @ControllerAdvice at the class level and @ExceptionHandler at the method level,
enhancing error resilience and providing a smoother user experience. MySQL serves as the database backend, with connection details configured in a YAML file for easy deployment on localhost."

Information : 


# RestController : 
	- @RestController = @Controller + @RequestBody

# PathVariable :
	- its annotation which we can provide in API
	- variable api and variable in method argument should same with syntax @PathVarible Integer id
	
# Exception Handling in Spring Boot :
	- define ErrorResponse POJO class
	- Define Exception with extends RuntimeException
	- define method which return ResponseEntity<ErrorResponse POJO,HTTPCode> and annoted with @ExceptionHandler	
	
# Global Exception Handle :
	- @ControllerAdvice - real time use of AOP
	- create Class with annotation @ControllerAdvice
	- add methods with @ExceptionHandler annotation

# REST API Design Best Practices :
-------------------------------
  - user appropriate API naming convention
  - Use correct HTTP calls to API
  - return correct HTTP response
   	* 1## : informational
   	* 2## : Successful
   	* 3## : Redirectional
   	* 4## : Client Side error
   	* 5## : Server error
  - User Versioning
  - Add security
  - Maintain Statelessness
  - Add filtering, Sorting or Pagination
  - Context Negotiation
  - Handle error gracefully
  - Use Documentation like Swagger/openAI
  
 #Creating REST API Project for EMPLOYEE 
 # Spring Data RES T:
 	- data-rest endpoints are HATEOAS complaint (Hypermedia As The Engine Of Application State)
 	- support pagination,filter
 	- Extending and adding custom queries
 	- Query Domain Specific Language (Query DSL)
 	- To implement REST API using Data-rest need below three thing
 		1. Entity
 		2. EntityRepository extends JpaRepository<Entity,Primary_key_type>{}
 		3. add data-rest dependency in pom.xml
		 	<dependency>
		    	<groupId>org.springframework.boot</groupId>
		    	<artifactId>spring-boot-starter-data-rest</artifactId>
			</dependency>
   for custom path give this annotation on repository class
	- @RepositoryRestResource(path="member")
 
 
  
   	
