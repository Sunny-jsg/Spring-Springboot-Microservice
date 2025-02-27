package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySQLDBReportDao implements ReportDao {

	@Override
	public void getData() {
		System.out.println("Getting data from mysql db ...");

	}

}
