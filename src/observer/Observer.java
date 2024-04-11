package src.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private String login;
    private List<String> channels;

    public void addChannel(String titleChannel) {
        channels.add(titleChannel);//добавили информацию о канеле на который юзер подписался
    }

    public Observer(String login) {
        channels = new ArrayList<>();
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    void update(String info){
        System.out.println(info);
    }

    private String getChannels(){
        String info = "";
        int countChannels = channels.size();
        for(var i = 0;i < countChannels;i++) {
            info = (i == countChannels - 1) ? (info.concat(channels.get(i))) : info.concat(channels.get(i)).concat(", ");
        }
        return info;

    }

    @Override
    public String toString() {
        return "Логин " + login + "\nканалы:" + getChannels();
    }
}
