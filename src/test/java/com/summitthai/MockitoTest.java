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
    List<String> mockedList;

    @AfterEach
    public void tearDown() {
        mockedList.clear();
    }

    @Test
    void stub() {
        // Arrange
        when(mockedList.get(0)).thenReturn("first");
        MyCollection collection = new MyCollection(mockedList);

        // Act
        String actual = collection.search(0);

        // Assert
        assertEquals("first", actual);
    }

    @Test
    void stubThrowException() {
        // Arrange
        when(mockedList.get(0)).thenThrow(new IndexOutOfBoundsException());
        MyCollection collection = new MyCollection(mockedList);

        // Assert
        assertThrows(IndexOutOfBoundsException.class, () -> {
            collection.search(0);
        });
    }

    @Test
    public void mockAndVerify() {
        // Arrange
        MyCollection collection = new MyCollection(mockedList);

        // Act
        collection.save("one");

        // Assert
        verify(mockedList).add("one");
        verify(mockedList, times(1)).add("one");
    }
}
