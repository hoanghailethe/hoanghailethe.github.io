package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepo;

    Page<Product> pageAndSort(int page, String fieldSort, String SortDir) {
        Sort sort = Sort.by(fieldSort);
        sort= (SortDir.equals("asc"))? sort.ascending() : sort.descending();

        Pageable pageable = PageRequest.of(page-1, 10, sort);
        return productRepo.findAll(pageable);
    }

    void save(Product product){
        productRepo.save(product);
    }
    public Product get(Integer id) {
        return productRepo.findById(id).get();
    }
    public void delete(Integer id) {
        productRepo.deleteById(id);
    }
}
