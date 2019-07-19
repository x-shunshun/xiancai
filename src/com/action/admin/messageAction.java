package com.action.admin;

import java.util.List;

import com.entity.Admin;
import com.entity.Message;
import com.entity.Page;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class messageAction {
	private List<Message> list;
	private List<Admin> adminlist;
	private AdminService adminService;
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
	

	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public List<Message> getList() {
		return list;
	}
	public void setList(List<Message> list) {
		this.list = list;
	}
	
	
	
	public List<Admin> getAdminlist() {
		return adminlist;
	}
	public void setAdminlist(List<Admin> adminlist) {
		this.adminlist = adminlist;
	}
	public String selectAll() {
		pageBean=adminService.queryForMessage(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList2();//获取数据    
		adminlist=adminService.findAdmin();
		ActionContext.getContext().put("message", list);
		ActionContext.getContext().put("admin", adminlist);
		return "success";
	} 

	public String selectshenhe() {
		pageBean=adminService.queryForMessage1(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList2();//获取数据    
		adminlist=adminService.findAdmin();
		ActionContext.getContext().put("message", list);
		ActionContext.getContext().put("admin", adminlist);
		return "success";
	} 
	public String selecttuikuan() {
		pageBean=adminService.queryForMessage2(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList2();//获取数据    
		adminlist=adminService.findAdmin();
		ActionContext.getContext().put("message", list);
		ActionContext.getContext().put("admin", adminlist);
		return "success";
	} 
	public String selectxiajia() {
		pageBean=adminService.queryForMessage3(4, page);//获取封装了分页信息和数据的pageBean  
		list=this.pageBean.getList2();//获取数据    
		adminlist=adminService.findAdmin();
		ActionContext.getContext().put("message", list);
		ActionContext.getContext().put("admin", adminlist);
		return "success";
	} 

	

}
