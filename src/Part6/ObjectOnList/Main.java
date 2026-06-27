package Part6.ObjectOnList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        Message first = new Message("Michael", "Hello, this is a short message.");
        Message second = new Message("Adam", "This message should also be added.");

        String exactly280 = "a".repeat(280);
        Message third = new Message("Anna", exactly280);

        String tooLong = "b".repeat(281);
        Message fourth = new Message("John", tooLong);

        service.add(first);
        service.add(second);
        service.add(third);
        service.add(fourth);

        ArrayList<Message> messages = service.getMessages();

        System.out.println("Number of accepted messages: " + messages.size());

        for (Message message : messages) {
            System.out.println(message);
        }
    }
}