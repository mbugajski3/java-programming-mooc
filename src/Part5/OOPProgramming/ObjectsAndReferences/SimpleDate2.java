package Part5.OOPProgramming.ObjectsAndReferences;

public class SimpleDate2 {
    private int day;
    private int month;
    private int year;

    public SimpleDate2(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate2 compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        this.advance(1);
    }
    public void advance(int howManyDays) {
        if ((this.day + howManyDays) < 30) {
            this.day = this.day + howManyDays;
        }
        this.day = this.day + howManyDays;

        while (this.day > 30) {
            this.day = this.day - 30;
            this.month++;
        }
        while (this.month > 12) {
            this.month = this.month - 12;
            this.year++;
        }
    }
    public SimpleDate2 afterNumberOfDays(int days) {
        SimpleDate2 newDate = new SimpleDate2(this.day, this.month, this.year);

        newDate.day = newDate.day + days;

        while (newDate.day > 30) {
            newDate.day = newDate.day - 30;
            newDate.month++;
        }

        while (newDate.month > 12) {
            newDate.month = newDate.month - 12;
            newDate.year++;
        }
        return newDate;
    }
}