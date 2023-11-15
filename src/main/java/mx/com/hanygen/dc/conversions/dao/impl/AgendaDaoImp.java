package mx.com.hanygen.dc.conversions.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import mx.com.hanygen.dc.conversions.bean.Agenda;
import mx.com.hanygen.dc.conversions.dao.AgendaDao;


/**
 * This is the DAO implementation to AGD010_AGENDA entity, here we will see the 
 * example to fetch rows and in same way, the code to update status to each row  
 */
public class AgendaDaoImp extends SimpleJdbcDaoSupport implements AgendaDao {
	
	private static String fetchSQL = "SELECT cd_agenda, st_agenda, st_shortcut, cd_usuario, nb_shortimage, nb_agenda, tx_comment FROM AGD010_AGENDA ";
	private static String updateAgendaSQL = "UPDATE AGD010_AGENDA SET st_agenda=? WHERE cd_agenda=?";
	
	@SuppressWarnings("deprecation")
	public List<Agenda> getAgendas() {
		try {
			
			return getSimpleJdbcTemplate().query(fetchSQL, new ParameterizedRowMapper<Agenda>() {

				@Override
				public Agenda mapRow(ResultSet rs, int rowNum) throws SQLException {
					Agenda data = new Agenda();
					data.setCdAgenda(rs.getInt("cd_agenda"));
					data.setStAgenda(rs.getString("st_agenda"));
					data.setStShortCut(rs.getString("st_shortcut"));
					data.setCdUsuario(rs.getString("cd_usuario"));
					data.setNbShortImage(rs.getString("nb_shortimage"));
					data.setNbAgenda(rs.getString("nb_agenda"));
					data.setTxComment(rs.getString("tx_comment"));
					return data;
				}
				
			});
			
		} catch(Exception ex) {
			System.out.println(ex);
		}
		return null;
	}
	
	public void updateAgendaStatus(final int cdagenda) {
		getSimpleJdbcTemplate().update(updateAgendaSQL, "TM",cdagenda);
	}
	
}
