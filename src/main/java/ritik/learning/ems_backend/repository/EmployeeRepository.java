package ritik.learning.ems_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ritik.learning.ems_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //with the help jpaRepo employeerepo get methods to perform operation
}
