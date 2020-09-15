package com.example.reactspringboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

}
