package ritik.learning.ems_backend.service;

import org.springframework.stereotype.Service;
import ritik.learning.ems_backend.dto.EmployeeDto;
import ritik.learning.ems_backend.entity.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    //This Service notation tell to spring container to create spring bean for that class
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
