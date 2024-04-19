import java.time.LocalDate;
import java.time.Period;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate Day1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate Day2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        if(Day1.isBefore(Day2)) return 1;
        else return 0;
        
    }
}