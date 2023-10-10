package coffee.cafe.repository;

import coffee.cafe.domain.product.Product;
import coffee.cafe.domain.product.ProductDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class productRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Test
    void saveAndReadTest1() {
        Product product = new Product();
        product.setName("스프링 부트 JPA");
        product.setPrice(5000);
        product.setStock(500);
        productRepository.save(product);

        ProductDetail productDetail = new ProductDetail();
        productDetail.setProduct(product);
        productDetail.setDescription("스프링 부트와 JPA를 함께 볼 수 있는 책");
        productDetailRepository.save(productDetail);

        System.out.println("savedProduct : " + productDetailRepository.findById(productDetail.getId()).get().getProduct());
        System.out.println("savedProductDetail : " + productDetailRepository.findById(productDetail.getId()).get());
        // 엔티티 조회 시 연관된 엔티티도 함께 조회하는 것을 즉시 로딩
    }
}
