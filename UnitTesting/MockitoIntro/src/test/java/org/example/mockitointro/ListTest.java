package org.example.mockitointro;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    @Test
    void listTest() {

        List listMock  = mock(List.class);

        //i want to mock the listMock.size() => 3
        when(listMock.size()).thenReturn(3);

        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturns() {

        List listMock  = mock(List.class);

        //i want to mock the listMock.size() => 3
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size()); //last value is the default value which is to be returned after multiple returns

    }
    @Test
    void specificParameters() {

        List listMock  = mock(List.class);

        //i want to mock the listMock.size() => 3
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1)); //by default .get method returns null hende the test passes

    }

    @Test
    void genericParameters() {

        List listMock  = mock(List.class);

        //i want to mock the listMock.size() => 3
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeAnyString");
        assertEquals("SomeAnyString", listMock.get(0));


    }
}
