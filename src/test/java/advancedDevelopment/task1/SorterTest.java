package advancedDevelopment.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SorterTest {

    @Test
    public void checkSorter(){
        //given
        List<String> stringList = new ArrayList<>();
        stringList.add("Atos");
        stringList.add("Portos");
        stringList.add("Burek");

        //when
        List<String> result = Sorter.sortDescending(stringList);

        //then
        assertThat(result).isEqualTo(List.of("Portos", "Burek", "Atos"));

    }

}