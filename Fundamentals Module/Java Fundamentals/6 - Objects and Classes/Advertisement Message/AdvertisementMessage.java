import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    String phrase;
    String event;
    String author;
    String city;
    AdvertisementMessage(String phrase,String event,String author,String city){
        this.phrase = phrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public String getPhrase() {
        return this.phrase;
    }

    public String getEvent() {
        return this.event;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s",getPhrase(),getEvent(),getAuthor(),getCity());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMessages = Integer.parseInt(scanner.nextLine());
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();
        for (int i = 0; i < numMessages; i++) {
            String phrase = phrases[random.nextInt(phrases.length)];
            String event = events[random.nextInt(events.length)];
            String author = authors[random.nextInt(authors.length)];
            String city = cities[random.nextInt(cities.length)];
            AdvertisementMessage message = new AdvertisementMessage(phrase,event,author,city);
            System.out.println(message);
        }
    }
}
