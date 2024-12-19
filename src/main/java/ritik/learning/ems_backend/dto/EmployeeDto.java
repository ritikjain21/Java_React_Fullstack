package ritik.learning.ems_backend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    //we built this class for transfer the data b/w client and server
    //we use employe dto as a response code in rest apis
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
