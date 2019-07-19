package com.entity;

/**
 * Browsinghistory entity. @author MyEclipse Persistence Tools
 */

public class Browsinghistory implements java.io.Serializable {

	// Fields

	private Integer browseId;
	private Goods goods;
	private String goodName;

	// Constructors

	/** default constructor */
	public Browsinghistory() {
	}

	/** full constructor */
	public Browsinghistory(Integer browseId, Goods goods, String goodName) {
		this.browseId = browseId;
		this.goods = goods;
		this.goodName = goodName;
	}

	// Property accessors

	public Integer getBrowseId() {
		return this.browseId;
	}

	public void setBrowseId(Integer browseId) {
		this.browseId = browseId;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getGoodName() {
		return this.goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

}