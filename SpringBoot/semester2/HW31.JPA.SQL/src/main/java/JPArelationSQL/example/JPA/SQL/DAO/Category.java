package JPArelationSQL.example.JPA.SQL.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Category {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy="category", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false)
    List<Product> products;

    @ManyToOne
    @JoinColumn(name="brand_id")
    Brand brand;

}
