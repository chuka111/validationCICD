package ie.atu;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class person {
    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = "title cannot be blank")
    private String title;
    @Min(value = 0, message ="employee ID must be greater than or equal to 0" )
    private int employeeID;
    @Min(value = 10, message ="age must be greater than or equal to 10" )
    private int age;
    @Email(message = "Invalid email address")
    private String email;
    @NotBlank(message = "position cannot be blank")
    private String position;
    @NotBlank(message = "department cannot be blank")
    private String department;
}
