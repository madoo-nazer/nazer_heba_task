package com.ntgclarity.smartcompound.business.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntgclarity.smartcompound.business.service.ServiceService;
import com.ntgclarity.smartcompound.common.entity.Service;
import com.ntgclarity.smartcompound.dataaccess.dao.ServiceDAO;

@Service
public class ServiceServiceImpl implements ServiceService {

	@Autowired
	private ServiceDAO serviceDAO;
	
	@Override
	public List<Service> getAllServices() {
		return serviceDAO.getAllServices();
	}

	@Override
	public Service getService(Long id) {
		if(id !=null)
		{
			return serviceDAO.getService(id);
		}
		return null;
	}
	/**
	 *methodCreater:nessma 
	 *create Service 
	 *this metohd will call serviceDAO.insertService
	 
	  **/
	@Override
	public Service insertService(Service service) {
		
		return serviceDAO.insertService(service);
	}
	@Override
	public Service updateService(Service service) {
		// TODO Auto-generated method stub
		return serviceDAO.updateService(service);
		
	}

	@Override
	public List<Service> loadServices(int first, int pageSize,
			String sortField, boolean ascending, Map<String, Object> filters) {
		return serviceDAO.loadServices(first,pageSize,sortField,ascending,filters);
	}

	@Override
	public int getNumOfServicesRows(Map<String, Object> filters) {
	
		return  serviceDAO.getNumOfServicesRows(filters);
	}


}
