package com.ntgclarity.smartcompound.business.service;

import java.util.List;
import java.util.Map;

import com.ntgclarity.smartcompound.common.entity.Service;

public interface ServiceService {

	List<Service> getAllServices();

	Service getService(Long id);

	Service insertService(Service service);

	Service updateService(Service service);
	List<Service> loadServices(int first, int pageSize, String sortField,
			boolean ascending, Map<String, Object> filters);

	int getNumOfServicesRows(Map<String, Object> filters);

}
