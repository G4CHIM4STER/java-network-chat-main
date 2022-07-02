package ru.geekbrains.app;

import ru.geekbrains.client.ClientGuiController;

//Тест
//Тест коммита через Idea
public class RunClient {
    public static void main(String[] args) {
        ClientGuiController clientGuiController = new ClientGuiController();
        clientGuiController.run(clientGuiController);
    }
}
