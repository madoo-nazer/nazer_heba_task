package com.ntgclarity.smartcompound.dataaccess.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ntgclarity.smartcompound.common.entity.TicketHistory;
import com.ntgclarity.smartcompound.dataaccess.base.BaseDAO;
import com.ntgclarity.smartcompound.dataaccess.dao.TicketHistoryDAO;

@Repository
public class TicketHistoryDAOImpl extends BaseDAO implements TicketHistoryDAO {

	@Override
	public List<TicketHistory> getAllTicketHistorys() {

		return (List<TicketHistory>) super.getAll(TicketHistory.class);
	}

	@Override
	public TicketHistory getTicketHistory(Long id) {
		return  (TicketHistory) super.get(TicketHistory.class , id);
	}
	@Override
	public TicketHistory updateTicketHistory(TicketHistory ticketHistory) {
		// TODO Auto-generated method stub
		return (TicketHistory) super.update(ticketHistory);
	}

	/**
	 *methodCreater:nessma 
	 *create TicketHistory 
	 *this metohd will call saveOrUpdate() in the super class BaseDAO
	 
	  **/
	@Override
	public TicketHistory insertTicketHistory(TicketHistory ticketHistory) {
		
		return (TicketHistory) super.insert(ticketHistory);
		
		
	}
	@Override
	public List<TicketHistory> loadTicketHistorys(int first, int pageSize,
			String sortField, boolean ascending, Map<String, Object> filters) {
			
		return super.load(TicketHistory.class,first,pageSize,sortField,ascending,filters);
	}

	@Override
	public int getNumOfTicketHistorysRows(Map<String, Object> filters) {
		
		return super.getNumOfRows(TicketHistory.class,filters);
	}

}
