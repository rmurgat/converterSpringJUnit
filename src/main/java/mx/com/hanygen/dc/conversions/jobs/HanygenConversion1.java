package mx.com.hanygen.dc.conversions.jobs;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.com.hanygen.dc.conversions.bean.Agenda;
import mx.com.hanygen.dc.conversions.dao.AgendaDao;

/**
 * this a class to execute a data conversion using JUNIT Test Case and JDBC.
 * this implementation works with MySQL and got coded two methods: one to Get data and
 * other one to update the status field
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml", 
		                          "classpath:dataAccessContext.xml", 
		                          "classpath:dataSource.xml"})

public class HanygenConversion1 {
	
	@Autowired
	private AgendaDao agendaDao;
	
	/**
	 * this is the unique test case, and get Agendas rows, for each row, update status field
	 */
	@Test
	public void runScript() {
		List<Agenda> agendas = agendaDao.getAgendas();
		for(Agenda oagd: agendas) {
			agendaDao.updateAgendaStatus(oagd.getCdAgenda());
			System.out.println(oagd);
		}
	}
}
