package com.boot.todo.actuator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "todo")
public class ToDoProperties {
private String path;
}