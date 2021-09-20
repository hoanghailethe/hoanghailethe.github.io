package JPArelationSQL.example.JPA.SQL.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private long price;

    //relation mapping other
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.LAZY)
    List<Detail> product_details;

    @ManyToOne
    @JoinColumn(name="category_id")
    Category category;

    void addDetail(Detail detail) {
        product_details.add(detail);
        detail.setProduct(this);
    }

    void removeDetail(Detail detail) {
        product_details.remove(detail);
    }
}
