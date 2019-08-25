package DAO_tier;

// default package
// Generated Aug 9, 2019 8:39:34 PM by Hibernate Tools 3.5.0.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import entitys.CtHoadon;
import entitys.CtHoadonId;

/**
 * Home object for domain model class CtHoadon.
 * @see .CtHoadon
 * @author Hibernate Tools
 */
@Stateless
public class CtHoadonHome {

	private static final Log log = LogFactory.getLog(CtHoadonHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CtHoadon transientInstance) {
		log.debug("persisting CtHoadon instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CtHoadon persistentInstance) {
		log.debug("removing CtHoadon instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CtHoadon merge(CtHoadon detachedInstance) {
		log.debug("merging CtHoadon instance");
		try {
			CtHoadon result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CtHoadon findById(CtHoadonId id) {
		log.debug("getting CtHoadon instance with id: " + id);
		try {
			CtHoadon instance = entityManager.find(CtHoadon.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
