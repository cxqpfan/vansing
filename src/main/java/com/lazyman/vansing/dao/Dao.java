package com.lazyman.vansing.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * User: APPLE
 * Date: 11/8/14
 */

public abstract class Dao<T> {

    @PersistenceContext
    private EntityManager em;


    @Transactional(propagation = Propagation.REQUIRED)
    public void persist(T t) {
        em.persist(t);
    }

    public void flush()
    {
        em.flush();
    }

}
