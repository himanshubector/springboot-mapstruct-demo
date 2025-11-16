package com.hims.mapstructdemo.mapper;

import com.hims.mapstructdemo.dto.ProductDTO;
import com.hims.mapstructdemo.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO dto);
}

