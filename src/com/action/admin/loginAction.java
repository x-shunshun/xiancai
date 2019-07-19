package com.action.admin;

import java.util.List;

import com.entity.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class loginAction {
	private AdminService adminService;
	private String adminName;
	private String adminPassword;
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public String execute()throws Exception{
		Admin a=new Admin();
		a.setAdminName(adminName);
		a.setAdminPassword(adminPassword);
		System.out.println(a.getAdminName());
		List list=adminService.login(a);
		if(list.size()>0){
			a=adminService.findAdminById(1);
			ActionContext.getContext().put("admin", a);
			//ActionContext.getContext().getSession().put("admin", a);
		return "success";
		}else{
			return "error";
		}
	}
	
	public String select(){
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		ActionContext.getContext().put("admin", admin);
		return "success";
	}

}
