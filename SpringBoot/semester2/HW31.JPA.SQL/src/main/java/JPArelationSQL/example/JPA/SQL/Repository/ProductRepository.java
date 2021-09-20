package JPArelationSQL.example.JPA.SQL.Repository;

import JPArelationSQL.example.JPA.SQL.DAO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
