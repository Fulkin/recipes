package recipes.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Fulkin
 * Created on 23.02.2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotNull
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 8, message = "{password.size.too_short}")
    private String password;

    @JsonIgnore
    private String role;


}
