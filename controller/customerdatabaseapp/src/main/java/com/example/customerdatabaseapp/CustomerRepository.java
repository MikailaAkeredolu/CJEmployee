package com.example.customerdatabaseapp;
/*
JPA(Java Persistence Api) lets you do ORM (Object Relational Mapping) like SQL (relational database)
ORM lets you map your entity classes to sql tables
JPA lets you use ORM

Spring Data JPA - lets you connect to a database and lets you configure Entity classes

Get the dependencies into your POM file

 */

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long>{

}
