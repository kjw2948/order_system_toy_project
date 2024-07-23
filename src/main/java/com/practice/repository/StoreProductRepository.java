package com.practice.repository;

import com.practice.domain.product.StoreProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StoreProductRepository extends CrudRepository<StoreProduct, Integer> {
    public Optional<StoreProduct> findByStoreIdAndProductId(int storeId, int productId);
}
