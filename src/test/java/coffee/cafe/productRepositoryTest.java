package coffee.cafe;

import coffee.cafe.repository.ProductDetailRepository;
import coffee.cafe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class productRepositoryTest {
    @Autowired
    ProductDetailRepository productDetailRepository;

    @Autowired
    ProductRepository productRepository;


}
