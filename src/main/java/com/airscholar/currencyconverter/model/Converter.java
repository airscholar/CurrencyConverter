package com.airscholar.currencyconverter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "converter")
public class Converter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "from_currency")
	private String fromCurrency;
	@Column(name = "from_currency_value")
	private Float fromCurrencyValue;
	@Column(name = "to_currency")
	private String toCurrency;
	@Column(name = "to_currency_value")
	private Float toCurrencyValue;
	@Column(name = "user_info")
	private String userInfo;
	@Column(name="currency_date")
	private Date currencyDate;


	public Converter(String fromCurrency, Float fromCurrencyValue, String toCurrency, Float toCurrencyValue,
			String userInfo, Date currencyDate) {
		super();
		this.fromCurrency = fromCurrency;
		this.fromCurrencyValue = fromCurrencyValue;
		this.toCurrency = toCurrency;
		this.toCurrencyValue = toCurrencyValue;
		this.userInfo = userInfo;
		this.currencyDate = currencyDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
