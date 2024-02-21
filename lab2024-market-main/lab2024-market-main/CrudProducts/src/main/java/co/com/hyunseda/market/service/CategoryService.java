/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.market.service;

import co.com.hyunseda.market.access.IProductRepository;
import co.com.hyunseda.market.market.Product;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Castro
 */
public class CategoryService {
    
    private IProductRepository repository;
    //private ICategoryRepository repositoryCategory;
    /**
     * Constructor que inicia la base de datos
     * @author Libardo, Julio
     */
    public CategoryService(IProductRepository repository) {
        this.repository = repository;
    }
    
    
    public List<Product> findAllProductsByCategory() {
        List<Product> products = new ArrayList<>();
        products = repository.findAll();

        return products;
    }
    
    public ResultSet FindAllCategories(){
        //ResultSet rs = repositoryCategory.
        return null;
        //ResultSet rs = repositoryCategory.
    }
}
