package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.AEDDAO;
import com.luv2code.springdemo.entity.AED;

@Service
public class AEDServiceImpl implements AEDService {

	// need to inject customer dao
	@Autowired
	private AEDDAO AEDDAO;
	
	@Override
	@Transactional
	public List<AED> getAED() {
		return AEDDAO.getAED();
	}

	@Override
	@Transactional
	public void saveAED(AED theAED) {

		AEDDAO.saveAED(theAED);
	}

	@Override
	@Transactional
	public AED getAED(int theId) {
		
		return AEDDAO.getAED(theId);
	}

	@Override
	@Transactional
	public void deleteAED(int theId) {
		
		AEDDAO.deleteAED(theId);
	}
}





