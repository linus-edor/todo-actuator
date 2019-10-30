package com.boot.todo.actuator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.todo.actuator.model.ToDo;
import com.boot.todo.actuator.repository.ToDoRepository;

@SpringBootApplication
public class TodoActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoActuatorApplication.class, args);
	}

	@Bean
	public CommandLineRunner insertAndView(ToDoRepository repository, ApplicationContext context) {
		return args -> {
			repository.save(new ToDo("Do homework"));
			repository.save(new ToDo("Workout in the mornings", true));
			repository.save(new ToDo("Make dinner tonight"));
			repository.save(new ToDo("Clean the studio", true));
			repository.findAll().forEach(el -> {
				System.out.println(el);
			});
		};
	}

}
