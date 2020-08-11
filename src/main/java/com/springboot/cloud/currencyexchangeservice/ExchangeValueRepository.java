package com.springboot.cloud.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cloud.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);

}
