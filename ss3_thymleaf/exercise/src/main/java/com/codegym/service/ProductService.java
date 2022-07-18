package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.repository.ProductRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }
//    public static final Map<Integer, Product> productlist;
//
//    static {
//        productlist = new HashMap<>();
//        productlist.put(1, new Product(1, "Iphone 11", 1000, "new", "Apple"));
//        productlist.put(2, new Product(2, "Samsung Galaxy S20", 1200, "old", "Samsung"));
//        productlist.put(3, new Product(3, "Macbook Pro", 1500, "new", "Apple"));
//        productlist.put(4, new Product(4, "Thinkpad", 1400, "99%", "Berlin"));
//        productlist.put(5, new Product(5, "Dell", 1300, "80%", "Miami"));
//    }
//
//    @Override
//    public List<Product> findAll() {
//        return new ArrayList<>(productlist.values());
//    }
//
//    @Override
//    public void save(Product product) {
//        productlist.put(product.getId(), product);
//    }
//
//    @Override
//    public Product findById(int id) {
//        return productlist.get(id);
//    }
//
//    @Override
//    public void update(int id, Product product) {
//        productlist.put(id, product);
//
//    }
//
//    @Override
//    public void remove(int id) {
//        productlist.remove(id);
//    }
//
//    @Override
//    public List<Product> searchByName(String name) {
//        List<Product> productList = new ArrayList<>();
//        for (Product value: productlist.values()) {
//            if(value.getName().contains(name)){
//                productList.add(value);
//            }
//        }
//        return productList;
//    }
}