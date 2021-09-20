package JPArelationSQL.example.JPA.SQL.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data @AllArgsConstructor
@Entity @Table
public class Detail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;

    @ManyToOne
    @JoinColumn(name="product_id")
    Product product;

}
