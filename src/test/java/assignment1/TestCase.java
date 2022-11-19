package assignment1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {
    @Test
    void Next_Day() {
        Calender Calender = new Calender();
        Date d = new Date(19,11,2022);
        assertEquals(20 , Calender.next_day(d).day);
        assertEquals(11, Calender.next_day(d).month );
        assertEquals(2022 , Calender.next_day(d).year);
    }
    @Test
    void Next_Month() {
        Calender Calender = new Calender();
        Date d = new Date(30,11,2022);
        assertEquals(1 , Calender.next_day(d).day );
        assertEquals(12, Calender.next_day(d).month  );
        assertEquals(2022 , Calender.next_day(d).year );
    }
    @Test
    void Next_Year() {
        Calender Calender = new Calender();
        Date d = new Date(31,12,2022);
        assertEquals(1 , Calender.next_day(d).day);
        assertEquals(1, Calender.next_day(d).month );
        assertEquals(2023 , Calender.next_day(d).year);
    }
    @Test
    void LeapYear_Feb() {
        Calender Calender = new Calender();
        Date d = new Date(28,2,2000);
        assertEquals(29 , Calender.next_day(d).day );
        assertEquals(2, Calender.next_day(d).month  );
        assertEquals(2000 , Calender.next_day(d).year );
    }
    @Test
    void Not_LeapYear_Feb() {
        Calender Calender = new Calender();
        Date d = new Date(28,2,2022);
        assertEquals(1 , Calender.next_day(d).day );
        assertEquals(3, Calender.next_day(d).month  );
        assertEquals(2022 , Calender.next_day(d).year );
    }

}



