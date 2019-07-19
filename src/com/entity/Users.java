package com.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userPassword;
	private String userSchool;
	private String userImage;
	private Double userWallet;
	private String userPhone;
	private String userConsignee;
	private String userAdress;
	private String userCode;
	private String userState;
	private Set greatforms = new HashSet(0);
	private Set storeconcerns = new HashSet(0);
	private Set evaluateforms = new HashSet(0);
	private Set goodses = new HashSet(0);
	private Set messages = new HashSet(0);
	private Set orderforms = new HashSet(0);
	private Set goodcollections = new HashSet(0);
	private Set shoppingcarts = new HashSet(0);
	private Set refurdforms = new HashSet(0);
	private Set goodstores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Integer userId, String userName, String userPassword, String userSchool) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSchool = userSchool;
	}

	/** full constructor */
	public Users(Integer userId, String userName, String userPassword, String userSchool, String userImage,
			Double userWallet, String userPhone, String userConsignee, String userAdress, String userCode,
			String userState,Set greatforms, Set storeconcerns, Set evaluateforms, Set goodses, Set messages, Set orderforms,
			Set goodcollections, Set shoppingcarts, Set refurdforms, Set goodstores) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSchool = userSchool;
		this.userImage = userImage;
		this.userWallet = userWallet;
		this.userPhone = userPhone;
		this.userConsignee = userConsignee;
		this.userAdress = userAdress;
		this.userCode = userCode;
		this.userState=userState;
		this.greatforms = greatforms;
		this.storeconcerns = storeconcerns;
		this.evaluateforms = evaluateforms;
		this.goodses = goodses;
		this.messages = messages;
		this.orderforms = orderforms;
		this.goodcollections = goodcollections;
		this.shoppingcarts = shoppingcarts;
		this.refurdforms = refurdforms;
		this.goodstores = goodstores;
	}

	// Property accessors

	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSchool() {
		return this.userSchool;
	}

	public void setUserSchool(String userSchool) {
		this.userSchool = userSchool;
	}

	public String getUserImage() {
		return this.userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public Double getUserWallet() {
		return this.userWallet;
	}

	public void setUserWallet(Double userWallet) {
		this.userWallet = userWallet;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserConsignee() {
		return this.userConsignee;
	}

	public void setUserConsignee(String userConsignee) {
		this.userConsignee = userConsignee;
	}

	public String getUserAdress() {
		return this.userAdress;
	}

	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Set getGreatforms() {
		return this.greatforms;
	}

	public void setGreatforms(Set greatforms) {
		this.greatforms = greatforms;
	}

	public Set getStoreconcerns() {
		return this.storeconcerns;
	}

	public void setStoreconcerns(Set storeconcerns) {
		this.storeconcerns = storeconcerns;
	}

	public Set getEvaluateforms() {
		return this.evaluateforms;
	}

	public void setEvaluateforms(Set evaluateforms) {
		this.evaluateforms = evaluateforms;
	}

	public Set getGoodses() {
		return this.goodses;
	}

	public void setGoodses(Set goodses) {
		this.goodses = goodses;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getOrderforms() {
		return this.orderforms;
	}

	public void setOrderforms(Set orderforms) {
		this.orderforms = orderforms;
	}

	public Set getGoodcollections() {
		return this.goodcollections;
	}

	public void setGoodcollections(Set goodcollections) {
		this.goodcollections = goodcollections;
	}

	public Set getShoppingcarts() {
		return this.shoppingcarts;
	}

	public void setShoppingcarts(Set shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	public Set getRefurdforms() {
		return this.refurdforms;
	}

	public void setRefurdforms(Set refurdforms) {
		this.refurdforms = refurdforms;
	}

	public Set getGoodstores() {
		return this.goodstores;
	}

	public void setGoodstores(Set goodstores) {
		this.goodstores = goodstores;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}
	

}