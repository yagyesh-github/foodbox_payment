package com.general.stores.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Response")
public class Response {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		 
//		private Long myResponseId;
		
		private String ResonseId;
		
		private int amount;
		
		private String status;
		
		@ManyToOne
		private Customer customer;
		
		private String paymentId;

//		public Long getMyResponseId() {
//			return myResponseId;
//		}
//
//		public void setMyResponseId(Long myResponseId) {
//			this.myResponseId = myResponseId;
//		}

		public String getResonseId() {
			return ResonseId;
		}

		public void setResonseId(String resonseId) {
			ResonseId = resonseId;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public String getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}
		
		
		
		
}
