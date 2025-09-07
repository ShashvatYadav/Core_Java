package com.Oops.Abstraction.Interface;

class GoogleMapImplementation implements GoogleMap {
	String address;
	boolean is_address_exist;
	@Override
	public void addAddress(String address) {
		// TODO Auto-generated method stub
		is_address_exist = true;
		this.address = address;
		System.out.println("Address Added Suscessfully");
	}

	@Override
	public void updateAddress(String address) {
		// TODO Auto-generated method stub
		if(is_address_exist) {
			this.address = address;
			System.out.println("Updated Address Suscessfully");
		} else {
			System.out.println("First add address");
		}
	}
	String getAddress() {
		return address;
	}
	@Override
	public boolean deletAddress() {
		// TODO Auto-generated method stub
		if(is_address_exist) {
			this.address = null;
			is_address_exist =false;
			System.out.println("Address Deleted Suscessfully");
			return true;
		} else {
			System.out.println("Add address First");
			return false;
		}
	}
	public static void main(String[] args) {
		GoogleMapImplementation gm = new GoogleMapImplementation();
		gm.addAddress("112/2A Gurgaon Harayana");;
		gm.updateAddress("Qspider Gurgaon harayana");
		gm.deletAddress();
		gm.updateAddress("Delhi");
		System.out.println(gm.getAddress());
	}
	
}
