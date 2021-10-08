package uz.pdp.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Product;
import uz.pdp.projection.CustomProduct;

import java.awt.print.Pageable;
import java.util.Optional;

@RepositoryRestResource(path="product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Long> {

}

