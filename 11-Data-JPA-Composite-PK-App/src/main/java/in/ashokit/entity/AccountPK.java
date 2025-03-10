package in.ashokit.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AccountPK {
	private Long AccNumber;
	private String AccType;

}
