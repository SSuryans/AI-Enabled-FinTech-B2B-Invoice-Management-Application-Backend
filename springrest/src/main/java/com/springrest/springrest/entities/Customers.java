package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id
	private long id;
	private String business_code;
	private String cust_number;
	private String name_customer;
	private String clear_date;
	private String buisness_year;
	private String doc_id;
	private String posting_date;
	private String due_in_date;
	private String baseline_create_date;
	private String cust_payment_terms;
	private String converted_usd;
	private String Aging_Bucket;
	public Customers(long id, String business_code, String cust_number, String name_customer, String clear_date,
			String buisness_year, String doc_id, String posting_date, String due_in_date, String baseline_create_date,
			String cust_payment_terms, String converted_usd, String aging_Bucket) {
		super();
		this.id = id;
		this.business_code = business_code;
		this.cust_number = cust_number;
		this.name_customer = name_customer;
		this.clear_date = clear_date;
		this.buisness_year = buisness_year;
		this.doc_id = doc_id;
		this.posting_date = posting_date;
		this.due_in_date = due_in_date;
		this.baseline_create_date = baseline_create_date;
		this.cust_payment_terms = cust_payment_terms;
		this.converted_usd = converted_usd;
		Aging_Bucket = aging_Bucket;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBusiness_code() {
		return business_code;
	}
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	public String getCust_number() {
		return cust_number;
	}
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	public String getName_customer() {
		return name_customer;
	}
	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}
	public String getClear_date() {
		return clear_date;
	}
	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}
	public String getBuisness_year() {
		return buisness_year;
	}
	public void setBuisness_year(String buisness_year) {
		this.buisness_year = buisness_year;
	}
	public String getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	public String getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	public String getDue_in_date() {
		return due_in_date;
	}
	public void setDue_in_date(String due_in_date) {
		this.due_in_date = due_in_date;
	}
	public String getBaseline_create_date() {
		return baseline_create_date;
	}
	public void setBaseline_create_date(String baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}
	public String getCust_payment_terms() {
		return cust_payment_terms;
	}
	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}
	public String getConverted_usd() {
		return converted_usd;
	}
	public void setConverted_usd(String converted_usd) {
		this.converted_usd = converted_usd;
	}
	public String getAging_Bucket() {
		return Aging_Bucket;
	}
	public void setAging_Bucket(String aging_Bucket) {
		Aging_Bucket = aging_Bucket;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", business_code=" + business_code + ", cust_number=" + cust_number
				+ ", name_customer=" + name_customer + ", clear_date=" + clear_date + ", buisness_year=" + buisness_year
				+ ", doc_id=" + doc_id + ", posting_date=" + posting_date + ", due_in_date=" + due_in_date
				+ ", baseline_create_date=" + baseline_create_date + ", cust_payment_terms=" + cust_payment_terms
				+ ", converted_usd=" + converted_usd + ", Aging_Bucket=" + Aging_Bucket + ", getId()=" + getId()
				+ ", getBusiness_code()=" + getBusiness_code() + ", getCust_number()=" + getCust_number()
				+ ", getName_customer()=" + getName_customer() + ", getClear_date()=" + getClear_date()
				+ ", getBuisness_year()=" + getBuisness_year() + ", getDoc_id()=" + getDoc_id() + ", getPosting_date()="
				+ getPosting_date() + ", getDue_in_date()=" + getDue_in_date() + ", getBaseline_create_date()="
				+ getBaseline_create_date() + ", getCust_payment_terms()=" + getCust_payment_terms()
				+ ", getConverted_usd()=" + getConverted_usd() + ", getAging_Bucket()=" + getAging_Bucket()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
}