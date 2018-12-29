package com.vend.cicd;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class MathControllerTest {
    @Spy
    @InjectMocks
    private MathController controller;

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void whenAddTwoNumberThanReturnSum() {
        Integer result = controller.add(10, 10);
        assertThat(result).isEqualTo(20);
    }

    @Test(expected = RuntimeException.class)
    public void whenValueOfBIsLessThanAThanReturnError() {
        controller.add(20, 10);
    }
}
