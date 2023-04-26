package edu.sda.java.tdd;
import static org.mockito.Mockito.*;
import java.util.List;
public class ListMockito {
    List mockedList = mock(List.class);
    when(mockedList.get(0)).thenReturn("Johny");

    
}
