package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		AccountRepo bean = context.getBean(AccountRepo.class);
	/*	AccountPK pk = new AccountPK();
		pk.setAccNumber(20213808687l);
		pk.setAccType("Saving");
		Account acc = new Account();
		acc.setHolderName("Sunny Yadav");
		acc.setBranch("Bhopal");
		acc.setAccountPK(pk);
		bean.save(acc);
		System.out.println("record inserted....");*/
		AccountPK pk = new AccountPK();
		pk.setAccNumber(20213808687l);
		pk.setAccType("Saving");
		Optional<Account> optional = bean.findById(pk);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
	}
	

}
