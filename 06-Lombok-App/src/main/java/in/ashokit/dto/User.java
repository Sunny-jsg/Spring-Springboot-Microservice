package in.ashokit.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
	private Integer Id;
	private String Name;
	private String Gender;
	private Long phno;
	private Date dob;

}
