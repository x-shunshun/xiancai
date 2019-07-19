package com.action.admin;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.entity.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.service.AdminService;

public class adminAction {
	private int adminId;
	private String adminName;
	private String adminPassword;
	private String adminImage;
	private AdminService adminService;
	private List<Admin> list;
	private String uploadContentType;
	private String uploadFileName;
	private File upload;
	//Admin admin =new Admin();
	
	
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public String getAdminImage() {
		return adminImage;
	}
	public void setAdminImage(String adminImage) {
		this.adminImage = adminImage;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public List<Admin> getList() {
		return list;
	}
	public void setList(List<Admin> list) {
		this.list = list;
	}
	
	public String select() {
		list=adminService.findAdmin();
		System.out.println(list);
		for(Admin a:list){
			System.out.println(a.getAdminName());
		}
		return "success";
	} 
	
	public String selectById() {
		Admin admin =new Admin();
		admin=adminService.findAdminById(1);
		ActionContext.getContext().put("admin", admin);
		System.out.println(admin.getAdminName());
		//<Context crossContext="true" debug="0" docBase="D:\MyEclipseWorkspaces\.metadata\.me_tcat85\webapps\admin_manage\images" path="" reloadable="true"/> 
		return "success";
	} 
	
	public String update()throws Exception{
		String path=ServletActionContext.getServletContext().getRealPath("/images");
		File filepath=new File(path);
		String filename=System.currentTimeMillis()+uploadFileName;
		FileUtils.copyFile(upload, new File(filepath,filename));
		Admin a=new Admin();
		
		a.setAdminName(adminName);
		a.setAdminPassword(adminPassword);
		a.setAdminImage("\\"+filename);
		System.out.println(path+"\\"+filename);
		adminService.updateAdmin(a);
		a=adminService.findAdminById(1);
		ActionContext.getContext().put("admin", a);
		return "success";
	}

	
	public String insert()throws Exception{
		String path=ServletActionContext.getServletContext().getRealPath("/images");
		File filepath=new File(path);
		String filename=System.currentTimeMillis()+uploadFileName;
		FileUtils.copyFile(upload, new File(filepath,filename));
		Admin a=new Admin();
		a.setAdminId(adminId);
		a.setAdminName(adminName);
		a.setAdminPassword(adminPassword);
		a.setAdminImage("\\"+filename);
		System.out.println(path+"\\"+filename);
		adminService.insertAdmin(a);
		return "success";
	}
	public String uploadFile()throws Exception{
		String path=ServletActionContext.getServletContext().getRealPath("/images");
		File filepath=new File(path);
		String filename=System.currentTimeMillis()+uploadFileName;
		FileUtils.copyFile(upload, new File(filepath,filename));
		return path+filename;
	}

}
