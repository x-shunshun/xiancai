package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.entity.Admin;
import com.entity.Goods;
import com.entity.Message;
import com.entity.Orderform;
import com.entity.Refurdform;
import com.entity.Users;

public class AdminDaoImpl  implements AdminDao{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	//管理员
	 @Override
		public List login(Admin a){
			    List list=null;
			    Session session=sessionFactory.getCurrentSession();
				Criteria c=session.createCriteria(Admin.class);
				Example example=Example.create(a);
				c.add(example);
				list=c.list();	
			return list;
		}
	 
	 @Override
	 public List<Admin> findAdmin(){
		    String hql = "from Admin";
			Query query=getSession().createQuery(hql);
			List<Admin> list =query.list();
			return list;
	 }
	 
	 @Override
	 public Admin findAdminById(int id){
		Admin a=null;
		a=(Admin)this.getSession().get(Admin.class, id);
	    return a;
	 }
	 
	 @Override
	 public void updateAdmin(Admin a){
		 getSession().update(a);
	 }
	 
	 @Override
	 public void insertAdmin(Admin a){
		 getSession().save(a);
	 }
	 
	 //消息
	 @Override
	 public List<Message> findAllMessage(final int offset,final int length){
		    String hql = "from Message";
			Query query=getSession().createQuery(hql);
			query.setFirstResult(offset);
			query.setMaxResults(length);
			List<Message> list =query.list();
			return list;
	 }
	 @Override
		public int getAllRowCount6() {
			 String hql = "from Message";
			 Query query=getSession().createQuery(hql);
			return query.list().size();
		}
	 
	 @Override
		public List<Message> findMessage1(int offset, int length) {
			String hql = "from Message where messageState=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "1"); 
			 query.setFirstResult(offset);
			query.setMaxResults(length);
			List<Message> list=query.list();
			System.out.println("listsize:"+list.size());
			return list;
		}
		
		@Override
		public int getMessageRowCount1() {
			 String hql = "from Message where messageState=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "1"); 
			return query.list().size();
		}
	 
		 @Override
			public List<Message> findMessage2(int offset, int length) {
				String hql = "from Message where messageState=?";
				 Query query=getSession().createQuery(hql);
				 query.setParameter(0, "2"); 
				 query.setFirstResult(offset);
				query.setMaxResults(length);
				List<Message> list=query.list();
				return list;
			}
			
			@Override
			public int getMessageRowCount2() {
				 String hql = "from Message where messageState=?";
				 Query query=getSession().createQuery(hql);
				 query.setParameter(0, "2"); 
				return query.list().size();
			}
			 @Override
				public List<Message> findMessage3(int offset, int length) {
					String hql = "from Message where messageState=?";
					 Query query=getSession().createQuery(hql);
					 query.setParameter(0, "3"); 
					 query.setFirstResult(offset);
					query.setMaxResults(length);
					List<Message> list=query.list();
					return list;
				}
				
				@Override
				public int getMessageRowCount3() {
					 String hql = "from Message where messageState=?";
					 Query query=getSession().createQuery(hql);
					 query.setParameter(0, "3"); 
					return query.list().size();
				}
		
		
	 @Override
	 public void insertMessage1(Message m){
		 getSession().save(m);
	 }
	 @Override
	 public void insertMessage2(Message m){
		 getSession().save(m);
	 }
	 @Override
	 public void insertMessage3(Message m){
		 getSession().save(m);
	 }
	 
	 
	 //用户管理
	 @Override
	 public List<Users> findAllUser(final int offset,final int length){
		 String hql = "from Users where userState=?";
	   	Query query=getSession().createQuery(hql);
	    query.setParameter(0, "good"); 
	   	query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Users> list =query.list();
		return list; 
	 }
	 @Override
		public int getAllRowCount7() {
			 String hql = "from Users where userState=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "good"); 
			return query.list().size();
		}
	 @Override
	 public void deleteUser(Users u){
		 getSession().delete(u);
	 }
	 @Override
	 public Users findUserById(int userid){
		 Users u=null;
		u=(Users)this.getSession().get(Users.class, userid);
		  return u;
	 }
	 @Override
	 public void updateUser(Users u){
		 getSession().update(u);
	 }
	 
	 
	 //审核
	 //分页
		
		@Override
		public List<Goods> findAllGood1(int offset, int length) {
			String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "daishenhe"); 
			 query.setFirstResult(offset);
			query.setMaxResults(length);
			List<Goods> list=query.list();
			System.out.println("listsize:"+list.size());
			return list;
		}
		
		@Override
		public int getAllRowCount1() {
			 String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "daishenhe"); 
			return query.list().size();
		}
		@Override
		public List<Goods> findAllGood2(int offset, int length) {
			String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "yifabu"); 
			 query.setFirstResult(offset);
			 query.setMaxResults(length);
			List<Goods> list=query.list();
			System.out.println("listsize:"+list.size());
			return list;
		}

		@Override
		public int getAllRowCount2() {
			 String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "yifabu"); 
			return query.list().size();
		}
	 @Override
	 public void updateGood(Goods g){
		 getSession().update(g);
	 }
	 @Override
	 public void updateGood2(Goods g){
		 getSession().update(g);
	 }
	 
	 @Override
	public Goods findGoodById(int goodid){
		 Goods g=null;
		 g=(Goods)this.getSession().get(Goods.class, goodid);
		return g;
	}
	 @Override
	 //通过goodID查询用户
	 public Users findUserByGoodId(int goodid){
		 Goods g=null;
		 g=(Goods)this.getSession().get(Goods.class, goodid);
		 Users u= g.getUsers();
		 return u;
	 }
	 
	 
	 //下架
	 @Override
		public List<Goods> findAllGood3(int offset, int length) {
			String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "yixiajia"); 
			 query.setFirstResult(offset);
			 query.setMaxResults(length);
			List<Goods> list=query.list();
			System.out.println("listsize:"+list.size());
			return list;
		}

		@Override
		public int getAllRowCount3() {
			 String hql = "from Goods where goodstate=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "yixiajia"); 
			return query.list().size();
		}
	 @Override
	 public void updateGood1(Goods g){
		 getSession().update(g);
	 }
	 
	 
	 //退款
	 @Override
	 public List<Refurdform> findRefurdform1(final int offset,final int length){
		 String hql = "from Refurdform where refurdStatus=?";
		 Query query=getSession().createQuery(hql);
		 query.setParameter(0, "daituikuan");
		 query.setFirstResult(offset);
		 query.setMaxResults(length);
		 List<Refurdform> list=query.list();
		 System.out.println("listsize:"+list.size());
		 return list;
	 }
	 @Override
	 public List<Refurdform> findRefurdform2(final int offset,final int length){
		 String hql = "from Refurdform where refurdStatus=?";
		 Query query=getSession().createQuery(hql);
		 query.setParameter(0, "yituikuan");
		 query.setFirstResult(offset);
		 query.setMaxResults(length);
		 List<Refurdform> list=query.list();
		 System.out.println("listsize:"+list.size());
		 return list;
	 }
	 @Override
		public int getAllRowCount4() {
			 String hql = "from Refurdform where refurdStatus=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "daituikuan"); 
			return query.list().size();
		}
	 @Override
		public int getAllRowCount5() {
			 String hql = "from Refurdform where refurdStatus=?";
			 Query query=getSession().createQuery(hql);
			 query.setParameter(0, "yituikuan"); 
			return query.list().size();
		}
	 @Override
	 public Refurdform findRefurdformById(int id){
		 Refurdform rf=null;
		 rf=(Refurdform)this.getSession().get(Refurdform.class, id);
		 return rf;
	 }
	 @Override
	 public void updateRefurdform(Refurdform rf){
		 getSession().update(rf);
	 }
	 @Override
	 public void updateRefurdform1(Refurdform rf){
		 getSession().update(rf);
	 }
	
	 @Override
	 public Goods findGoodByRefurdId(int refurdid){
		 Refurdform rf=null;
		 rf=(Refurdform)this.getSession().get(Refurdform.class, refurdid);
		 Goods g=rf.getGoods();
		 return g;
	 }
	 @Override
	 public Users findUserByRefurdId(int refurdid){
		 Refurdform rf=null;
		 rf=(Refurdform)this.getSession().get(Refurdform.class, refurdid);
		 Users u= rf.getUsers();
		 return u;
	 }
	 

}
