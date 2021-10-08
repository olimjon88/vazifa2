package uz.pdp.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.entity.Client;
import uz.pdp.projection.CustomClient;

import java.awt.print.Pageable;
import java.util.Optional;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Long> {

}
