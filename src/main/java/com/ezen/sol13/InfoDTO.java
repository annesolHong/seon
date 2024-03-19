package com.ezen.sol13;

public class InfoDTO {
	
	int id,tel;
	String name;
	ScoreDTO scoredto;
	InsaDTO insadto;
	
	
	public InfoDTO() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ScoreDTO getScoredto() {
		return scoredto;
	}

	public void setScoredto(ScoreDTO scoredto) {
		this.scoredto = scoredto;
	}

	public InsaDTO getInsadto() {
		return insadto;
	}

	public void setInsadto(InsaDTO insadto) {
		this.insadto = insadto;
	}
	
	

}
