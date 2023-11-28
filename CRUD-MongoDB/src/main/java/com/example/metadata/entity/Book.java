package com.example.metadata.entity;

//Person.java
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Document(collection = "book")
public class Book {
 @Id
 private String id;
 private String name;
 private int age;
 
 
 
// public Book(String id, String name, int age, String author) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.age = age;
//	this.author=author;
//}
//public String getId() {
//	return id;
//}
//public void setId(String id) {
//	this.id = id;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
//public String getAuthor() {
//	return author;
//}
//public void setAuthor(String author) {
//	this.author = author;
//}

 // Constructors, getters, setters
}