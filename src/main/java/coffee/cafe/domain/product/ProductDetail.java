package coffee.cafe.domain.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_detail")
@Getter @Setter
public class ProductDetail {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "product_number") // 상품 번호
    private Product product;
}
