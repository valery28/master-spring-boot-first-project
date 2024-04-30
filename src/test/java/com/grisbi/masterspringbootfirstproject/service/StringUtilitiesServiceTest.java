package com.grisbi.masterspringbootfirstproject.service;

import com.grisbi.masterspringbootfirstproject.domain.StringPayload;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class StringUtilitiesServiceTest {
    @InjectMocks
    StringUtilitiesService springUtilities;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void whenStringNotNull_thenReturnUpperCase(){
        String test = "abcde";
        String expected = "ABCDE";

        String result = springUtilities.toUpperCase(new StringPayload(test)).string();
        assert result.equals(expected);
    }
}
