import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueFerrisWheel = new LinkedList<>();
        List<Person> generatedList = generateClients();
        for (int i = 0; i < generatedList.size(); i++) {
            queueFerrisWheel.offer(generatedList.get(i));
        }
        while (!queueFerrisWheel.isEmpty()) {
            if (queueFerrisWheel.peek() != null) {
                Person client = queueFerrisWheel.poll();
                client.setNumberOfTickets(client.getNumberOfTickets() - 1);
                System.out.println("Посетитель " + client.getName() + " " + client.getSurname() +
                        " прокатился на аттракционе. Осталось билетов: " + client.getNumberOfTickets());
                if (client.getNumberOfTickets() > 0) {
                    queueFerrisWheel.offer(client);
                }
            }
        }

    }

    public static List<Person> generateClients() {
        List<Person> generatedList = new ArrayList<>();
        generatedList.add(new Person("Альберт", "Альбертов", 6));
        generatedList.add(new Person("Ираида", "Ираидова", 3));
        generatedList.add(new Person("Николай", "Николаев", 7));
        generatedList.add(new Person("Юлия", "Юльева", 2));
        generatedList.add(new Person("Кузьма", "Кузин", 1));
        generatedList.add(new Person("Римма", "Риммова", 5));
        return generatedList;
    }
}
