package DAO_tier;

// default package
// Generated Aug 9, 2019 8:39:34 PM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entitys.Donhang;

/**
 * Home object for domain model class Donhang.
 * @see .Donhang
 * @author Hibernate Tools
 */
@Stateless
public class DonhangHome {

	private static final Log log = LogFactory.getLog(DonhangHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Donhang transientInstance) {
		log.debug("persisting Donhang instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Donhang persistentInstance) {
		log.debug("removing Donhang instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Donhang merge(Donhang detachedInstance) {
		log.debug("merging Donhang instance");
		try {
			Donhang result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Donhang findById(String id) {
		log.debug("getting Donhang instance with id: " + id);
		try {
			Donhang instance = entityManager.find(Donhang.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
