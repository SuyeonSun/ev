package coffee.cafe.domain.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "provider")
@Getter
@Setter
@NoArgsConstructor
public class Provider {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // 다대일 양방향
    // 공급 업체를 통해 등록된 상품을 조회
    @OneToMany(mappedBy = "provider", fetch = FetchType.EAGER)
    private List<Product> productList = new ArrayList<>();
}
