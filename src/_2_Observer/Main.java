package _2_Observer;

public class Main {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();
        WhatsappListener whatsappListener = new WhatsappListener();
        TelegramListener telegramListener = new TelegramListener();

        newsletter.publishNews("New Iphone 15 released");

        System.out.println("---");

        newsletter.subscribe(whatsappListener);
        newsletter.subscribe(telegramListener);

        newsletter.publishNews("Android vs iPhone: who is the best?");

        System.out.println("---");

        newsletter.unsubscribe(whatsappListener);
        newsletter.publishNews("Whatsapp API raised their prices");
    }
}
