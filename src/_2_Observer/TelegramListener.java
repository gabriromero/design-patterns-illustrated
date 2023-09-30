package _2_Observer;

public class TelegramListener implements SocialNetworkListener {
    @Override
    public void update(String content) {
        System.out.println("Sending telegram with content " + content);
    }
}
