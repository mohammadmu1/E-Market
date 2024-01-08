package com.MMu.EMarketBackEnd.Repository;

import com.MMu.EMarketBackEnd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
