package coffee.cafe.repository;

import coffee.cafe.domain.product.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
