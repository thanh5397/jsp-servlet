package com.phamvanthanh.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.phamvanthanh.dto.PortfolioDetailDTO;
import com.phamvanthanh.service.IPortfolioDetailService;

@RestController
public class PortfolioDetailAPI {
	
	@Autowired
	private IPortfolioDetailService portfolioDetailService;
	
	@GetMapping(value = "/api/detail/{id}")
	public PortfolioDetailDTO showNew(@PathVariable(value="id",required = false) Long id) {
		PortfolioDetailDTO portfolioDetailDTO = new PortfolioDetailDTO();
		portfolioDetailDTO = portfolioDetailService.findOne(id);
		return portfolioDetailDTO;
	}
}
