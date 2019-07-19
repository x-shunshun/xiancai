package com.action.admin;

import java.util.List;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Page;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class usermanageAction {

	private AdminService adminService;
	private List<Users> list;
	private int userId;
	private Page pageBean;// 封装了分页信息和数据内容的pageBean
	private int page = 1; // 表示从网页中返回的当前页的值 默认为1 表示默认显示第一页内容
	
	
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public List<Users> getList() {
		return list;
	}

	public void setList(List<Users> list) {
		this.list = list;
	}


	public String selectAllUser(){
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		pageBean=adminService.queryForUser(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList3();//获取数据    
		for(Users u:list){
			System.out.println(u.getUserName());
		}
		ActionContext.getContext().put("admin", admin);
		ActionContext.getContext().put("user", list);
		return "success";
	}
	/*
	 * public String userDelete(){
		Users u=new Users();
		u.setUserId(userId);
		adminService.deleteUser(u);
		select();
		return "success";
	}
	 * */
	
	
	public String userDelete(){
		Users u=new Users();
		u.setUserId(userId);
		adminService.updateUser(u);;
		select();
		return "success";
	}
	
	public void select(){
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		pageBean=adminService.queryForUser(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList3();//获取数据    
		for(Users u:list){
			System.out.println(u.getUserName());
		}
		ActionContext.getContext().put("admin", admin);
		ActionContext.getContext().put("user", list);
	}
	
	

}
