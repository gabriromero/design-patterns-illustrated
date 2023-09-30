package _2_Observer;

public class WhatsappListener implements SocialNetworkListener{

    @Override
    public void update(String content) {
        System.out.println("Sending whatsapp with content " + content);
    }
}
