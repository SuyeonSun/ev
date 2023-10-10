package coffee.cafe.domain.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    // 일대일 단방향
    @OneToOne(mappedBy = "product")
    // PRICE  	STOCK  	NUMBER  	NAME
    // 일대일 양방향
    // @OneToOne
    // PRICE  	STOCK  	NUMBER  	PRODUCT_DETAIL_ID  	NAME
    private ProductDetail productDetail;
}
