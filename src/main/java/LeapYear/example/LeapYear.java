package LeapYear.example;

public class LeapYear {

    public boolean check(int i) {
        if (i % 100 == 0 && i % 400 != 0)
            return false;
        if (i % 4 == 0 && i != 0)
            return true;
        return false;
    }
}
