package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Media extends JFrame {

JLabel rotulo1, rotulo2, rotulo3, rotulo4, resultado;
JTextField nota1, nota2, nota3, nota4;
JButton media;

public Media (){

    //definindo algumas configurações da tela
    super("Média final");

    Container tela = getContentPane();
    tela.setBackground(new Color(134, 155, 126));
    setLayout(null);

    //definindo os nome de cada variavel

    rotulo1 = new JLabel("1ºNota");
    rotulo2 = new JLabel("2ºNota");
    rotulo3 = new JLabel("3ºNota");
    rotulo4 = new JLabel("4ºNota");
    resultado = new JLabel();

    nota1 = new JTextField(2);
    nota2 = new JTextField(2);
    nota3 = new JTextField(2);
    nota4 = new JTextField(2);

    media = new JButton("Nota final");

    //definindo a posicação
    rotulo1.setBounds(50,20,100,20);
    rotulo2.setBounds(50,60,100,20);
    rotulo3.setBounds(50,100,100,20);
    rotulo4.setBounds(50,140,100,20);


    nota1.setBounds(140,20,200,20);
    nota2.setBounds(140,60,200,20);
    nota3.setBounds(140,100,200,20);
    nota4.setBounds(140,140,200,20);

    media.setBounds(100, 190, 200, 30);

    resultado.setBounds(100, 220, 200, 30);

    //codigo para o evento do botao
    media.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                try {//verificar se o usario apeans digitou numeros
                    int num1, num2, num3, num4, result;

                    result = 0;
                    num1 = Integer.parseInt(nota1.getText());
                    num2 = Integer.parseInt(nota2.getText());
                    num3 = Integer.parseInt(nota3.getText());
                    num4 = Integer.parseInt(nota4.getText());

                    if (num1 <= 10 && num2 <= 10 && num3 <= 10 && num4 <= 10) { //if e esle para permitir que o usuario digite apenas até 10
                        result = (num1 + num2 + num3 + num4) / 4;
                        resultado.setVisible(true);
                        resultado.setText("A nota final é: " + result);
                    } else {
                        resultado.setVisible(true);
                        resultado.setText("Erro: o limite é 10");
                    }
                } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro
                    resultado.setVisible(true);
                    resultado.setText("Digite apenas números!");
                   }
                }
            }
    );
    resultado.setVisible(false);

    //personalização
    //mudar a fonte do rotulo,tamanho
    rotulo1.setFont(new Font("Tahoma", Font.BOLD, 16));
    rotulo2.setFont(new Font("Tahoma", Font.BOLD, 16));
    rotulo3.setFont(new Font("Tahoma", Font.BOLD, 16));
    rotulo4.setFont(new Font("Tahoma", Font.BOLD, 16));

    // mudara a cor dos texto no rotulo
    rotulo1.setForeground(new Color(246, 243, 235));
    rotulo2.setForeground(new Color(246, 243, 235));
    rotulo3.setForeground(new Color(246, 243, 235));
    rotulo4.setForeground(new Color(246, 243, 235));

    //mudar fonte trocar cor do texto
    resultado.setFont(new Font("Tahoma", Font.BOLD, 16));
    resultado.setForeground(new Color(246, 243, 235));

    //mudar botoes
    media.setFont(new Font("Tahoma", Font.BOLD, 16));
    media.setBackground(new Color(127, 32, 32));
    media.setForeground(new Color(201, 202, 172));

    //adicionando itens a tela
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    tela.add(nota1);
    tela.add(nota2);
    tela.add(nota3);
    tela.add(nota4);
    tela.add(media);
    tela.add(resultado);

    setSize(400, 300);
    setVisible(true);
    setLocationRelativeTo(null);

}

}
