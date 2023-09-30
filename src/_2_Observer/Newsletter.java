package _2_Observer;
import java.util.ArrayList;
import java.util.List;

public class Newsletter {
    List<SocialNetworkListener> subscribers = new ArrayList<>();

    public void subscribe(SocialNetworkListener socialNetworkListener){
        subscribers.add(socialNetworkListener);
    }

    public void unsubscribe(SocialNetworkListener socialNetworkListener){
        subscribers.remove(socialNetworkListener);
    }

    public void notifySubscribers(String content){
        for (SocialNetworkListener subscriber : subscribers){
            subscriber.update(content);
        }
    }

    public void publishNews(String content){
        System.out.println("Sending new email with content: " + content);
        notifySubscribers(content);
    }

}
