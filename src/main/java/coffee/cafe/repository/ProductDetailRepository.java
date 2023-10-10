package coffee.cafe.repository;

import coffee.cafe.domain.product.Product;
import coffee.cafe.domain.product.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
