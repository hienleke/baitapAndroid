package DAO_tier;

// default package
// Generated Aug 9, 2019 8:39:34 PM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entitys.Linhkien;

/**
 * Home object for domain model class Linhkien.
 * @see .Linhkien
 * @author Hibernate Tools
 */
@Stateless
public class LinhkienHome {

	private static final Log log = LogFactory.getLog(LinhkienHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Linhkien transientInstance) {
		log.debug("persisting Linhkien instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Linhkien persistentInstance) {
		log.debug("removing Linhkien instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Linhkien merge(Linhkien detachedInstance) {
		log.debug("merging Linhkien instance");
		try {
			Linhkien result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Linhkien findById(String id) {
		log.debug("getting Linhkien instance with id: " + id);
		try {
			Linhkien instance = entityManager.find(Linhkien.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
