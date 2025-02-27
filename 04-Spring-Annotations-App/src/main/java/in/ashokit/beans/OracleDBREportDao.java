package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDBREportDao implements ReportDao {

	@Override
	public void getData() {

		System.out.println(" Getting OracleReport from db ... ");
	}

}
