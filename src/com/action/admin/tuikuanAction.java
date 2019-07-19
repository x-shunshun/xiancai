package com.action.admin;

import java.util.List;

import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Page;
import com.entity.Refurdform;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class tuikuanAction {
	private AdminService adminService;
	private List<Refurdform> list;
	private int refurdformId;
	private Users user;
	private Goods good;
	private Page pageBean,pageBean1;// 封装了分页信息和数据内容的pageBean
	private int page = 1; // 表示从网页中返回的当前页的值 默认为1 表示默认显示第一页内容
	
	
	
	
	public Page getPageBean1() {
		return pageBean1;
	}
	public void setPageBean1(Page pageBean1) {
		this.pageBean1 = pageBean1;
	}
	public Page getPageBean() {
		return pageBean;
	}
	public void setPageBean(Page pageBean) {
		this.pageBean = pageBean;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public List<Refurdform> getList() {
		return list;
	}
	public void setList(List<Refurdform> list) {
		this.list = list;
	}
	
	public int getRefurdformId() {
		return refurdformId;
	}
	public void setRefurdformId(int refurdformId) {
		this.refurdformId = refurdformId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Goods getGood() {
		return good;
	}
	public void setGood(Goods good) {
		this.good = good;
	}
	
	public String selectRefurdform1(){
		pageBean=adminService.queryForRefurdform1(4, page);
		list=this.pageBean.getList1();//获取数据    
		ActionContext.getContext().put("daituikuan", list);
		select();
		return "success";
	}
	public String selectRefurdform2(){
		pageBean1=adminService.queryForRefurdform2(4, page);
		list=this.pageBean1.getList1();//获取数据    
		ActionContext.getContext().put("yituikuan", list);
		select();
		return "success";
	}
	
	public String aggretuikuan(){
		Refurdform rf=new Refurdform();
		rf.setRefurdformId(refurdformId);
		adminService.updateRefurdform(rf);//修改状态
		Goods g=adminService.findGoodByRefurdId(refurdformId);
		double account=g.getGoodPrice();
		Users u=adminService.findUserByRefurdId(refurdformId);
		u.setUserWallet(account+u.getUserWallet());
	    rf.setUsers(u);
	    adminService.updateUser(u);
	    pageBean=adminService.queryForRefurdform1(4, page);
		list=this.pageBean.getList1();//获取数据    
		ActionContext.getContext().put("daituikuan", list);
	    select();
		return "success";
	}
	public String disaggretuikuan(){
		Refurdform rf=new Refurdform();
		rf.setRefurdformId(refurdformId);
		adminService.updateRefurdform1(rf);//修改状态
		 Message m=new Message();
		 Users u=adminService.findUserByRefurdId(refurdformId);
		 m.setUsers(u);
		 adminService.insertMessage2(m);
		 pageBean=adminService.queryForRefurdform1(4, page);
		 list=this.pageBean.getList1();//获取数据    
		 ActionContext.getContext().put("daituikuan", list);
		 select();
		return "success";
	}
	
	
	public void select(){
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		ActionContext.getContext().put("admin", admin);
	}

}
