package com.springcore_1;


	public class Address {
		
		private String streetName;
		private String cityName;
		private String stateName;
		private int zipId;
		private String countryName;
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public int getZipId() {
			return zipId;
		}
		public void setZipId(int zipId) {
			this.zipId = zipId;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Address [streetName=" + streetName + ", cityName=" + cityName + ", stateName=" + stateName
					+ ", zipId=" + zipId + ", countryName=" + countryName + "]";
		}

}

