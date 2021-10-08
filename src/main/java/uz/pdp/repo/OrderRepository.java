package uz.pdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Order;
import uz.pdp.projection.CustomOrder;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Long> {

}