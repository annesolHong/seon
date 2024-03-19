package com.ezen.sol13;

import java.util.ArrayList;

public interface Service {

	public void inserta(String name, int age, String address);

	public ArrayList<MyinfoDTO> print();

	public void delinfo(String name);

	public ArrayList<InfoDTO> payout();

	
}
