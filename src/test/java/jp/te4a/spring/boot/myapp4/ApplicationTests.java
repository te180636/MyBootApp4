package jp.te4a.spring.boot.myapp4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class HelloControllerTest
{
    @InjectMocks
    HelloController helloController;

    @BeforeEach
    public void each(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        String expected = "this is Spring Boot sample";
        String actual = helloController.index();
        assertEquals(expected,actual);
    }
}
