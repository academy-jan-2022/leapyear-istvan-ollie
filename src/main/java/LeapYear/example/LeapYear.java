package LeapYear.example;

public class LeapYear {

    public boolean check(int i) {
        if (i % 4 == 0 && i != 0) return true;
        return false;
    }
}
