package com.springcore_1;

//1)question
	public class Customer {
		
		private int customerId;
		private String customerName;
		private int customerContact;
		private Address address;
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getCustomerContact() {
			return customerContact;
		}
		public void setCustomerContact(int customerContact) {
			this.customerContact = customerContact;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
					+ customerContact + ", address=" + address + "]";
		}
		}
		
