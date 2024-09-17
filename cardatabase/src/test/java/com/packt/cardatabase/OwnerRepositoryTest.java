package com.packt.cardatabase;

import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class OwnerRepositoryTest {
    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    void saveOwner() {
        ownerRepository.save(new Owner("Lucy", "Smith"));
        Assertions.assertThat(
                ownerRepository.findByFirstname("Lucy").isPresent()
        ).isTrue();
    }

    @Test
    void deleteOwners() {
        ownerRepository.save(new Owner("Jesús", "Rojas"));
        ownerRepository.deleteAll();
        Assertions.assertThat(ownerRepository.count()).isEqualTo(0);
    }
}
