package data_tier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO_tier.NhanvienHome;
import entitys.Nhanvien;

public class ConnectDBS {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
	private static EntityManager entityManager =null;
	private ConnectDBS()
	{
		
	}
	public static EntityManager getInstance()
	{
		if (entityManager==null)
			entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public static void main(String[] args) {
	
		Nhanvien nhanvien = new Nhanvien("xxx1s");

		NhanvienHome nvh = new NhanvienHome();
		nvh.persist(nhanvien);


		
		
	}
}
