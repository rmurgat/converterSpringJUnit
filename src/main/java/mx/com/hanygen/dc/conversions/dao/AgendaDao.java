package mx.com.hanygen.dc.conversions.dao;

import java.util.List;

import mx.com.hanygen.dc.conversions.bean.Agenda;

/**
 * This is just the interface to be implemented
 */
public interface AgendaDao {
	public List<Agenda> getAgendas();
	public void updateAgendaStatus(final int cdagenda);
}
