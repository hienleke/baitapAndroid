package DAO_tier;

// default package
// Generated Aug 9, 2019 8:39:34 PM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import data_tier.ConnectDBS;
import entitys.Nhanvien;

/**
 * Home object for domain model class Nhanvien.
 * @see .Nhanvien
 * @author Hibernate Tools
 */
@Stateless
public class NhanvienHome {

	private static final Log log = LogFactory.getLog(NhanvienHome.class);

	@PersistenceContext
	private EntityManager entityManager = ConnectDBS.getInstance();

	public void persist(Nhanvien transientInstance) {
		log.debug("persisting Nhanvien instance");
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(transientInstance);
			entityManager.getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Nhanvien persistentInstance) {
		log.debug("removing Nhanvien instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Nhanvien merge(Nhanvien detachedInstance) {
		log.debug("merging Nhanvien instance");
		try {
			Nhanvien result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Nhanvien findById(String id) {
		log.debug("getting Nhanvien instance with id: " + id);
		try {
			Nhanvien instance = entityManager.find(Nhanvien.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
