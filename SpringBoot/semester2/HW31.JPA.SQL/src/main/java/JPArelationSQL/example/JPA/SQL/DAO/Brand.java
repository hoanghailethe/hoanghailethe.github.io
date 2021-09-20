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
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY, orphanRemoval = true)
    List<Category> categories;

    void removeFromCategory(Category category) {
        categories.remove(category);
    }

    void addToCategory(Category category) {
        categories.add(category);
        category.setBrand(this);
    }
}
