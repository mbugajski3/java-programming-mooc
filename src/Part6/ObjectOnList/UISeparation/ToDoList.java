package Part6.ObjectOnList.UISeparation;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> list;

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int index = 0;

        for (String task : this.list) {
            index++;
            System.out.println(index + ": " + task);
        }
    }

    public void remove(int number) {
        if (number <= this.getSize() && number > 0) {
            this.list.remove(number - 1);
        } else {
            System.out.println("Number is not on list.");
        }
    }

    public int getSize() {
        return this.list.size();
    }
}
