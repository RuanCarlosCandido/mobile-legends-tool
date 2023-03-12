package org.proxy;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.models.HeroesResponse;

public class HeroesDataProxyIntegrationTest {

    @Test
    public void testGetData() {
        // Arrange
        HeroesDataProxy heroesDataProxy = new HeroesDataProxy();

        // Act
        Map<String, HeroesResponse> heroesResponses = heroesDataProxy.getData();

        // Assert
        Assertions.assertFalse(heroesResponses.isEmpty());
    }

}
