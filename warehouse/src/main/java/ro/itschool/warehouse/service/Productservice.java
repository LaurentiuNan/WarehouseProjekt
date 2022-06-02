package ro.itschool.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.itschool.warehouse.entitys.ProductModel;
import ro.itschool.warehouse.repository.ProductRepository;

import java.util.List;

@Component
public class Productservice {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getProducts(){

        List<ProductModel>productModels = productRepository.findAll();
        return productModels;
    }

    public void addProduct(ProductModel productModel){
        productRepository.save(productModel);
    }

    public void deleteProduct(int labelNumber){
        productRepository.deleteById(labelNumber);
    }
}
