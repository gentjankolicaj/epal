package org.epal.user_service.service;

import org.epal.user_service.domain.FavBusLine;
import org.epal.user_service.repository.FavBusLineRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class FavouriteServiceImplTest {

    @Mock   //Plays the role of Mockito.mock by creating mock object.
    private FavBusLineRepository favBusLineRepository;

    private final FavouriteService favouriteService = new FavouriteServiceImpl(favBusLineRepository);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test should pass if favourite bus line for user is saved")
    @Order(1)
    void save() {

    }

    @Test
    @DisplayName("Test should pass if existing favourite bus line is deleted")
    @Order(2)
    void delete() {
        assertThrows(Exception.class, () -> {
            favouriteService.delete(null, null);
        });
        assertThrows(Exception.class, () -> favouriteService.delete(-1L, -1L));
        assertDoesNotThrow(() -> favouriteService.delete(1L, 1L));
    }

    @Test
    @DisplayName("Test should pass if existing favourite bus line is found")
    @Order(3)
    void findBusLineByUserId() {

        List<FavBusLine> dummyData = new ArrayList<>();
        dummyData.add(new FavBusLine(1L, 1L, Instant.now(), null));
        dummyData.add(new FavBusLine(1L, 2L, Instant.now(), null));
        dummyData.add(new FavBusLine(2L, 2L, Instant.now(), null));

        Mockito.when(favBusLineRepository.findByBusLineId(0L)).thenReturn(null);
        assertThat(favouriteService.findBusLineByUserId(0L)).isNullOrEmpty();

        Mockito.when(favBusLineRepository.findByBusLineId(1L)).thenReturn(dummyData);
        assertThat(favouriteService.findBusLineByUserId(1L))
                .isNotNull()
                .hasSize(3);


    }
}