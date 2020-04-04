package com.jyotirmayadas;

import com.jyotirmayadas.repositories.ProductRepository;
import com.jyotirmayadas.services.ProductService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@SpringBootTest
class UnitTestApplicationTests {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    /*
    @Before ---> @BeforeEach
    @BeforeClass ---> @BeforeAll
    @After
    @AfterClass
     */

    @BeforeAll
    public static void beforeClass() {
        System.out.println(":|");
    }

    @BeforeEach
    public void before() {
        System.out.println(":)");
    }

    @Test
    public void noProductReturnedTest() {
        given(productRepository.getProductNames()).willReturn(Collections.emptyList());

        List<String> res = productService.getProductNameWithEvenNoOfChar();

        assertTrue(res.isEmpty());
    }

    @Test
    public void moreProductsAreFoundTest() {
        given(productRepository.getProductNames()).willReturn(Arrays.asList("aa", "bbbb", "ccccc"));

        List<String> res = productService.getProductNameWithEvenNoOfChar();

        assertEquals(2, res.size());

//        verify(productRepository, times(2)).addProduct(any());
    }
}
