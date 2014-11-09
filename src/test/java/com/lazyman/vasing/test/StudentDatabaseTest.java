package com.lazyman.vasing.test;

import com.lazyman.vansing.dao.StudentDao;
import com.lazyman.vansing.po.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

/**
 * User: APPLE
 * Date: 11/8/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext-database.xml"})
@WebAppConfiguration
@TransactionConfiguration(defaultRollback = true,transactionManager = "transactionManager")
@Transactional
public class StudentDatabaseTest {


    @Autowired
    private StudentDao studentDao;

    @Test
    public void testAdd()
    {

        Student student = new Student();
        student.setName("hrr1");
        student.setSchool("vansing");
        studentDao.persist(student);
        studentDao.flush();


    }
}
