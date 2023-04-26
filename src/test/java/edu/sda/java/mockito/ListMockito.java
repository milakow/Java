package edu.sda.java.mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;




import static org.mockito.Mockito.*;


public class ListMockito {
    @Test
    public void test() {
        List mockedList = mock(List.class);
        when(mockedList.get(0)).thenReturn("Johny");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(1));
    }

    @Test
    void verifyAdding() {
        List mockedList = mock();

        mockedList.add("Will");
        System.out.println("get(0): " + mockedList.get(0));
        verify(mockedList).add("Will");
    }

    @Test
    void returnValue() {
        List mockedList = mock();
        when(mockedList.get(0)).thenReturn("Will");

        assertThat(mockedList.get(0)).isEqualTo("Will");
    }


}
