package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Orderform;
import com.entity.Page;
import com.entity.Refurdform;
import com.entity.Users;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao){
		this.adminDao=adminDao;
	}
	
	
	//登录
	@Override
	public List login(Admin a){
		return adminDao.login(a);
	}
	
	//管理员
	@Override
	public List<Admin> findAdmin(){
		return this.adminDao.findAdmin();
	}

	@Override
	public void updateAdmin(Admin a){
		
		Admin admin=adminDao.findAdminById(1);
		admin.setAdminName(a.getAdminName());
		admin.setAdminPassword(a.getAdminPassword());
		admin.setAdminImage(a.getAdminImage());
		this.adminDao.updateAdmin(admin);
		
	}
	@Override
	public Admin findAdminById(int id){
		return adminDao.findAdminById(id);
	}
	
	@Override
	public void insertAdmin(Admin a){
		Admin admin=new Admin();
		admin.setAdminId(a.getAdminId());
		admin.setAdminName(a.getAdminName());
		admin.setAdminPassword(a.getAdminPassword());
		admin.setAdminImage(a.getAdminImage());
		this.adminDao.insertAdmin(admin);
	}
	
	
	//消息
	@Override
	public Page queryForMessage(int pageSize, int page) {
		// TODO Auto-generated method stub
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getAllRowCount6(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Message> list = adminDao.findAllMessage(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList2(list);
		pageBean.init();
		return pageBean;
	}
	public Page queryForMessage1(int pageSize,int page){
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getMessageRowCount1(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Message> list = adminDao.findMessage1(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList2(list);
		pageBean.init();
		return pageBean;
	}
	public Page queryForMessage2(int pageSize,int page){
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getMessageRowCount2(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Message> list = adminDao.findMessage2(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList2(list);
		pageBean.init();
		return pageBean;
	}
	public Page queryForMessage3(int pageSize,int page){
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getMessageRowCount3(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Message> list = adminDao.findMessage3(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList2(list);
		pageBean.init();
		return pageBean;
	}
	@Override
	public void insertMessage1(Message m){
		try {
			Message message=new Message();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH: mm: ss");
			String d=sdf.format(new Date());
			Date date=sdf.parse(d);
			message.setMessageContent("您上传的商品未审核成功！");
			message.setUsers(m.getUsers());
			message.setSendTime(date);
			message.setMessageState("1");
			this.adminDao.insertMessage1(message);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertMessage2(Message m){
		try {
			Message message=new Message();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH: mm: ss");
			String d=sdf.format(new Date());
			Date date=sdf.parse(d);
			message.setMessageContent("您申请的商品退款未成功！");
			message.setUsers(m.getUsers());
			message.setSendTime(date);
			message.setMessageState("2");
			this.adminDao.insertMessage2(message);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertMessage3(Message m){
		try {
			Message message=new Message();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH: mm: ss");
			String d=sdf.format(new Date());
			Date date=sdf.parse(d);
			message.setMessageContent("您的商品已被强制下架！");
			message.setUsers(m.getUsers());
			message.setSendTime(date);
			message.setMessageState("3");
			this.adminDao.insertMessage2(message);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//用户管理
	@Override
	public Page queryForUser(int pageSize, int page) {
		// TODO Auto-generated method stub
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getAllRowCount7(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Users> list = adminDao.findAllUser(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList3(list);
		pageBean.init();
		return pageBean;
	}
	
	@Override
	public void deleteUser(Users u){
		Users user=adminDao.findUserById(u.getUserId());
		this.adminDao.deleteUser(user);
	}
	@Override
	 public Users findUserById(int userid){
		 return adminDao.findUserById(userid);
	 }
	@Override
	public void updateUser(Users u){
		Users user=adminDao.findUserById(u.getUserId());
		user.setUserState("bad");
		this.adminDao.updateUser(user);
	}
	
	
	//审核
	//分页
		@Override
		public Page queryForGood1(int pageSize, int page) {
			// TODO Auto-generated method stub
			final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
			final int length = pageSize; // 每页记录数
			int allRow = adminDao.getAllRowCount1(); // 总记录数
			int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
			final int currentPage = Page.countCurrentPage(page); // 当前页

			List<Goods> list = adminDao.findAllGood1(offset, length);
			// 把分页信息保存到Bean当中
			Page pageBean = new Page();
			pageBean.setPageSize(pageSize);
			pageBean.setCurrentPage(currentPage);
			pageBean.setAllRow(allRow);
			pageBean.setTotalPage(totalPage);
			pageBean.setList(list);
			pageBean.init();
			return pageBean;
		}
		@Override
		public Page queryForGood2(int pageSize, int page) {
			// TODO Auto-generated method stub
			final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
			final int length = pageSize; // 每页记录数
			int allRow = adminDao.getAllRowCount2(); // 总记录数
			int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
			final int currentPage = Page.countCurrentPage(page); // 当前页

			List<Goods> list = adminDao.findAllGood2(offset, length);
			// 把分页信息保存到Bean当中
			Page pageBean = new Page();
			pageBean.setPageSize(pageSize);
			pageBean.setCurrentPage(currentPage);
			pageBean.setAllRow(allRow);
			pageBean.setTotalPage(totalPage);
			pageBean.setList(list);
			pageBean.init();
			return pageBean;
		}

	@Override
	 public void updateGood(Goods g){
		 Goods good=adminDao.findGoodById(g.getGoodId());
		 good.setGoodstate("yifabu");
		 this.adminDao.updateGood(good);
	 }
	
	@Override
	 public void updateGood2(Goods g){
		 Goods good=adminDao.findGoodById(g.getGoodId());
		 good.setGoodstate("daixiugai");
		 this.adminDao.updateGood2(good);
	 }
	@Override
	 public Goods findGoodById(int goodid){
		 return adminDao.findGoodById(goodid);
	 }
	@Override
	 public Users findUserByGoodId(int goodid){
		return adminDao.findUserByGoodId(goodid);
	}
	
	//下架
	@Override
	public Page queryForGood3(int pageSize, int page) {
		// TODO Auto-generated method stub
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getAllRowCount3(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Goods> list = adminDao.findAllGood3(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}
	@Override
	 public void updateGood1(Goods g){
		 Goods good=adminDao.findGoodById(g.getGoodId());
		 good.setGoodstate("yixiajia");
		 this.adminDao.updateGood(good);
	 }
	
	
	//退款
	@Override
	public Page queryForRefurdform1(int pageSize, int page) {
		// TODO Auto-generated method stub
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getAllRowCount4(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Refurdform> list = adminDao.findRefurdform1(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList1(list);
		pageBean.init();
		return pageBean;
	}
	public Page queryForRefurdform2(int pageSize, int page) {
		// TODO Auto-generated method stub
		final int offset = Page.countOffset(pageSize, page); // 当前页开始记录
		final int length = pageSize; // 每页记录数
		int allRow = adminDao.getAllRowCount5(); // 总记录数
		int totalPage = Page.countTatalPage(pageSize, allRow); // 总页数
		final int currentPage = Page.countCurrentPage(page); // 当前页

		List<Refurdform> list = adminDao.findRefurdform2(offset, length);
		// 把分页信息保存到Bean当中
		Page pageBean = new Page();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(allRow);
		pageBean.setTotalPage(totalPage);
		pageBean.setList1(list);
		pageBean.init();
		return pageBean;
	}
	
	@Override
	public Refurdform findRefurdformById(int id){
		return this.adminDao.findRefurdformById(id);
	}
	@Override
	public void updateRefurdform(Refurdform rf){
		Refurdform refurdform=adminDao.findRefurdformById(rf.getRefurdformId());
		refurdform.setRefurdStatus("yituikuan");
		this.adminDao.updateRefurdform(refurdform);
	}
	@Override
	public void updateRefurdform1(Refurdform rf){
		Refurdform refurdform=adminDao.findRefurdformById(rf.getRefurdformId());
		refurdform.setRefurdStatus("tuikuanshibai");
		this.adminDao.updateRefurdform(refurdform);
	}
	@Override
	public Goods findGoodByRefurdId(int refurdid){
		return this.adminDao.findGoodByRefurdId(refurdid);
	}
	@Override
	public Users findUserByRefurdId(int refurdid){
		return this.adminDao.findUserByRefurdId(refurdid);
	}
	
}
