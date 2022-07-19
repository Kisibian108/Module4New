package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Transactional
@Repository
public class ProductRepositoryImpl implements IProductRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager
                .createQuery("SELECT s FROM Product as s", Product.class);
        return query.getResultList();
    }

    @Override
    public void update(int id, Product product) {
        entityManager.merge(product);
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
//        entityManager.remove(entityManager.merge(student));
//        entityManager.find(Student.class, 5); // tìm kiếm
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }


    @Override
    public void remove(int id) {
        entityManager.remove(entityManager.find(Product.class, id));
    }
}
