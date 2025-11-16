package com.hims.mapstructdemo.service;

import com.hims.mapstructdemo.dto.ProductDTO;
import com.hims.mapstructdemo.entity.Product;
import com.hims.mapstructdemo.mapper.ProductMapper;
import com.hims.mapstructdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductDTO createProduct(ProductDTO dto) {
        Product product = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(product));
    }

    public List<ProductDTO> getAllProducts() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
