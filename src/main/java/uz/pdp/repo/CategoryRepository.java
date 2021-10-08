package uz.pdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Category;
import uz.pdp.projection.CustomCategory;
import uz.pdp.projection.CustomClient;


import java.util.Optional;

@RepositoryRestResource (path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(String name);

}

