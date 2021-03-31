package com.airscholar.currencyconverter.web.dto;

import java.util.Date;

public class ConverterDTO {

	private String fromCurrency;
	private Float fromCurrencyValue;
	private String toCurrency;
	private Float toCurrencyValue;
	private String userInfo;
	private Date currencyDate;
	

	public ConverterDTO() {
		super();
	}

	public ConverterDTO(String fromCurrency, Float fromCurrencyValue, String toCurrency, Float toCurrencyValue,
			String userInfo, Date currencyDate) {
		super();
		this.fromCurrency = fromCurrency;
		this.fromCurrencyValue = fromCurrencyValue;
		this.toCurrency = toCurrency;
		this.toCurrencyValue = toCurrencyValue;
		this.userInfo = userInfo;
		this.currencyDate = currencyDate;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public Float getFromCurrencyValue() {
		return fromCurrencyValue;
	}

	public void setFromCurrencyValue(Float fromCurrencyValue) {
		this.fromCurrencyValue = fromCurrencyValue;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Float getToCurrencyValue() {
		return toCurrencyValue;
	}

	public void setToCurrencyValue(Float toCurrencyValue) {
		this.toCurrencyValue = toCurrencyValue;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
	public Date getCurrencyDate() {
		return currencyDate;
	}

	public void setCurrencyDate(Date currencyDate) {
		this.currencyDate = currencyDate;
	}
}
