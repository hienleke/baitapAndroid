package DAO_tier;

// default package
// Generated Aug 9, 2019 8:39:34 PM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entitys.Danhmuclinhkien;

/**
 * Home object for domain model class Danhmuclinhkien.
 * @see .Danhmuclinhkien
 * @author Hibernate Tools
 */
@Stateless
public class DanhmuclinhkienHome {

	private static final Log log = LogFactory.getLog(DanhmuclinhkienHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Danhmuclinhkien transientInstance) {
		log.debug("persisting Danhmuclinhkien instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Danhmuclinhkien persistentInstance) {
		log.debug("removing Danhmuclinhkien instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Danhmuclinhkien merge(Danhmuclinhkien detachedInstance) {
		log.debug("merging Danhmuclinhkien instance");
		try {
			Danhmuclinhkien result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Danhmuclinhkien findById(String id) {
		log.debug("getting Danhmuclinhkien instance with id: " + id);
		try {
			Danhmuclinhkien instance = entityManager.find(Danhmuclinhkien.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
