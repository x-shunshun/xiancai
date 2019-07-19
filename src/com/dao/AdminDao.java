package com.dao;

import java.util.List;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Orderform;
import com.entity.Page;
import com.entity.Refurdform;
import com.entity.Users;

public interface AdminDao {
	
	

	//管理员
	public List login(Admin a);
	public List<Admin> findAdmin();
	public void updateAdmin(Admin a);
	public Admin findAdminById(int id);
	public void insertAdmin(Admin a);
	
	//消息
	public List<Message> findAllMessage(final int offset,final int length);
	public int getAllRowCount6();
	public void insertMessage1(Message m);
	public void insertMessage2(Message m);
	public void insertMessage3(Message m);
	public List<Message> findMessage1(final int offset,final int length);
	public int getMessageRowCount1();
	public List<Message> findMessage2(final int offset,final int length);
	public int getMessageRowCount2();
	public List<Message> findMessage3(final int offset,final int length);
	public int getMessageRowCount3();
	
	//用户管理
	public List<Users> findAllUser(final int offset,final int length);
	public int getAllRowCount7();
	public void deleteUser(Users u);
	public Users findUserById(int userid);
	public void updateUser(Users u);
	
	//审核
	/* 分页查询 hql  查询条件  offset  开始记录  length  一次查询几条记录     @return 查询的记录集合 */
	public List<Goods> findAllGood1(final int offset,final int length);
	public List<Goods> findAllGood2(final int offset,final int length);
	/* 查询所有的记录数  hql 查询条件 return 总记录数  */
	public int getAllRowCount1();
	public int getAllRowCount2();
	public Users findUserByGoodId(int goodid);
	public Goods findGoodById(int goodid);
	public void updateGood(Goods g);//已上架
	public void updateGood2(Goods g);//待修改
	
	//下架
	public List<Goods> findAllGood3(final int offset,final int length);
	public int getAllRowCount3();
	public void updateGood1(Goods g);//已下架
	
	//退款
	public List<Refurdform> findRefurdform1(final int offset,final int length);
	public List<Refurdform> findRefurdform2(final int offset,final int length);
	public int getAllRowCount4();
	public int getAllRowCount5();
	public Refurdform findRefurdformById(int id);
	public void updateRefurdform(Refurdform rf);//同意退款
	public void updateRefurdform1(Refurdform rf);//拒绝退款
	public Goods findGoodByRefurdId(int refurdid);
	public Users findUserByRefurdId(int refurdid);
	
	
}
