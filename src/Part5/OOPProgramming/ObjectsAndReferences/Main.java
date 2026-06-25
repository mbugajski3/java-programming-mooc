package Part5.OOPProgramming.ObjectsAndReferences;

public class Main {
    public static void main(String[] args) {
        SimpleDate2 date = new SimpleDate2(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate2 newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println(date.afterNumberOfDays(790));
    }
}