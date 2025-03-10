package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="Account_tbl")
public class Account {
	private String HolderName;
	private String Branch;
	@EmbeddedId
	private AccountPK accountPK;

}
