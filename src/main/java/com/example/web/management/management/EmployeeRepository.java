package com.example.web.management.management;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    Employee findById(long id);
}
