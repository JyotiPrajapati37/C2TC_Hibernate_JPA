package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entity.Student;

public class StudentDaoImpl implements StudentDao 
{
	private EntityManager entityManager;
	public StudentDaoImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public Student getStudentById(int id) {
		Student student= entityManager.find(Student.class, id);
		// TODO Auto-generated method stub
		return student;
	}
	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}
	
	
}

