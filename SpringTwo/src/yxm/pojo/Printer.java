package yxm.pojo;

import yxm.interfaces.Ink;
import yxm.interfaces.Paper;

public class Printer {
	
	//品牌
	private String  Brand;
	
	//墨盒
	Ink ink;
	
	//纸张
	Paper paper;
	
	
	
	public String getBrand() {
		return Brand;
	}



	public void setBrand(String brand) {
		Brand = brand;
	}



	public Ink getInk() {
		return ink;
	}



	public void setInk(Ink ink) {
		this.ink = ink;
	}



	public Paper getPaper() {
		return paper;
	}



	public void setPaper(Paper paper) {
		this.paper = paper;
	}



	public String Printerinfo() {
		return this.Brand+"品牌 正在使用"+this.ink.getColor()+"打印内容在"+this.paper.getPaper()+"!";
	}

}
