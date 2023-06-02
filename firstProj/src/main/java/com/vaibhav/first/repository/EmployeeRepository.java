 package com.vaibhav.first.repository;

import java.math.BigDecimal;

import javax.persistence.NamedNativeQuery;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vaibhav.first.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
//	@Transactional
//	@Modifying(clearAutomatically = true)
//	@Query("update Employee set name =:ename, id=:eid, dept=:edept, slalary=:esalary where id=:eid" )
//	void updateEmployee(@Param("ename") Employee employee. );

	@Transactional
	@Modifying
	@Query("delete from Employee where id=:id")
	void deleteEmployee(@Param("id") String id);
	
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Employee set name =:ename,gender=:egender,mobile=:emobile, id=:eid, department=:edept, salary=:esalary where id=:eid" )
	void updateEmployee(@Param("eid")String eid,@Param("ename") String ename,@Param("egender") String egender,@Param("emobile") String emobile,@Param("edept") String edept,@Param("esalary") String esalary);
	
	@Transactional
	//@Modifying
	@Query("from Employee where id =:eid")
	public Employee getEmployee(@Param("eid")String eid);
	
	
}
