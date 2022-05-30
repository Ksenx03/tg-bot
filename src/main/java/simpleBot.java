import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class simpleBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        //System.out.println(update.getMessage().getText());
        //System.out.println(update.getMessage().getFrom().getFirstName());

        String comand = update.getMessage().getText();

        if(comand.equals("/run")) {
            String message = "Бот работает";
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException E) {
                E.printStackTrace();
            }
        }

    }

    @Override
    public String getBotUsername() {
        // TODO
        return "exampletaxibot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5597053202:AAF_ycVrpUojDrih3EZB63lhO7pNmZpHiXc";
    }
}
