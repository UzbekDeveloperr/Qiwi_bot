package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    private final String QIWI_NUMBER="998935777176";
    private final String QIWI_TOKEN="7eebfa0aba18595ded72ae94556c5716";
    private Step step=new Step();
    private HashMap<Long,BotUser> userMap=new HashMap<>();
    private final String TOKEN="5722693822:AAG2yrrna3--TrLw2hrCcQH6NgNI4KKZf4M";
    private final String BOT_USER="qiwi_test1_bot";

    @Override
    public String getBotUsername() {
        return BOT_USER;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
        if (update.hasMessage()){
            System.out.println(update);
            String text;
            Message message=update.getMessage();
            long chat_id=message.getChatId();
            if (message.getText().equals("/start")){
                if (userMap.get(chat_id)==null){
                    BotUser user=new BotUser();
                    userMap.put(chat_id,user);
                    text="Assalomu alaykum botimizga xush kelibsiz!\nBotdan foydalanish uchun kabinetingizga o'z hisob raqamingizni kiriting";
                    Send(text,chat_id);
                    user.setStep(step.getMAIN());
                }else{
                    Send("Assalomu alaykum!",chat_id);
                    userMap.get(chat_id).setStep(step.getMAIN());
                }
            } else if (userMap.get(chat_id).getStep().equals(step.getMAIN())) {
                if (message.getText().equals("Ayriboshlash")) userMap.get(chat_id).setStep(step.getCONVERT());
                else if (message.getText().equals("Kurs")) userMap.get(chat_id).setStep(step.getCOURSE_INFO());
                else if (message.getText().equals("kabinetim")) userMap.get(chat_id).setStep(step.getUSER_INFO());
                else if (message.getText().equals("aloqa")) Send("@xushbaxtov",chat_id);
                Send("menu:",chat_id,MainBttons());
            }

        }
    }
    private void Send(String text,long chatId){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void Send(String text, long chatId, ReplyKeyboardMarkup markup){
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        sendMessage.setReplyMarkup(markup);


        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private ReplyKeyboardMarkup MainBttons(){
        ReplyKeyboardMarkup markup=new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        List<KeyboardRow> rows=new ArrayList<>();
        KeyboardRow row=new KeyboardRow();
        KeyboardButton button;
        button = new KeyboardButton("Ayriboshlash");
        row.add(button);
        button = new KeyboardButton("Kurs");
        row.add(button);
        rows.add(row);
        row=new KeyboardRow();
        button=new KeyboardButton("kabinetim");
        row.add(button);
        button=new KeyboardButton("aloqa");
        row.add(button);
        rows.add(row);
        markup.setKeyboard(rows);
        return markup;
    }

}
