package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        SendMessage sendMessage= new SendMessage();
        if(message != null && message.hasText()){
            if(message.getText() == "/help"){
                try{
                    execute(sendMessage.setText(message.getText() + " You help???"));
                }catch (TelegramApiException e){
                    e.printStackTrace();
                }

            }
        }

    }

    public String getBotUsername() {
        return "PogodoffBot";
    }

    public String getBotToken() {
        return "TOKEN";
    }
}
