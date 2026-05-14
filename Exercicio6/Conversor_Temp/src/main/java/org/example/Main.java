package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Conversor app = new Conversor();//instancia o objeto da classe conversor
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // chama metodo para fechar corretamente o app
    }
}
