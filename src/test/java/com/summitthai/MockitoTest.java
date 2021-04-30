package com.summitthai;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @Mock
    List<String> api;

    @AfterEach
    public void tearDown() {
        api.clear();
    }

    @Test
    void stub() {
        // Arrange
        when(api.get(0)).thenReturn("first");
        MyCollection collection = new MyCollection(api);

        // Act
        String actual = collection.search(0);

        // Assert
        assertEquals("Hello first", actual);
    }

    @Test
    void stubReturnThrowException() {
        // Arrange
        when(api.get(0)).thenThrow(new IndexOutOfBoundsException());
        MyCollection collection = new MyCollection(api);

        // Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            collection.search(0);
        });
    }

    @Test
    void stubDoThrowException() {
        // Arrange
        doThrow(new IndexOutOfBoundsException()).when(api).add("XXX 0");
        MyCollection collection = new MyCollection(api);

        // Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            collection.save("0");
        });
    }

    @Test
    public void mockAndVerify() {
        // Arrange
        MyCollection collection = new MyCollection2(api);

        // Act
        collection.save("one");
        collection.save("two");

        // Assert
        verify(api).add("YYY one");
        verify(api).add("YYY two");
        verify(api, times(1)).add("YYY one");
        verify(api, times(1)).add("YYY two");
    }
}

class MyCollection2 extends MyCollection {

    public MyCollection2(List<String> list) {
        super(list);
    }

    @Override
    protected String getXxx() {
        return "YYY";
    }
}