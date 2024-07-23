package com.practice.service;

import com.practice.domain.product.StoreProduct;
import com.practice.repository.StoreProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreProductRepository storeProductRepository;

    public StoreProduct getProduct(StoreProduct product) {
        Optional<StoreProduct> findProduct = storeProductRepository.findByStoreIdAndProductId(product.getStoreId(), product.getProductId());
        if (findProduct.isEmpty()) {
            throw new RuntimeException("해당 재고가 존재하지 않습니다");
        }
        return findProduct.get();
    }

    public void saveAll(List<StoreProduct> products) {
        storeProductRepository.saveAll(products);
    }
}
