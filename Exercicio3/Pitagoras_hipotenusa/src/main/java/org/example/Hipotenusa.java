package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hipotenusa extends JFrame{

    JLabel titulo, subtitulo, numA, numB, raiz ;
    JTextField valorA, valorB;
    JButton calcular;

    public Hipotenusa(){

        //definindo algumas configurações da tela
        super("Teorema de Pitagoras");

        Container tela = getContentPane();
        tela.setBackground(new Color(134, 155, 126));
        setLayout(null);

        //definindo os nome de cada variavel

        titulo = new JLabel("Bhaskara");
        subtitulo = new JLabel("c² = a² + b²");
        numA = new JLabel("Valor de A: ");
        numB = new JLabel("Valor de B:");
        raiz = new JLabel();


        valorA = new JTextField(10);
        valorB = new JTextField(10);

        calcular = new JButton("Calcular");

        //definindo a posicação
        titulo.setBounds(150,20,200,20);
        subtitulo.setBounds(140,60,300,20);
        numA.setBounds(50,100,100,20);
        numB.setBounds(50,140,100,20);


        valorA.setBounds(140,100,200,20);
        valorB.setBounds(140,140,200,20);


        calcular.setBounds(100, 180, 200, 30);

        raiz.setBounds(100, 220, 350, 30);


        //codigo para o evento do botao
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try {//verificar se o usario apeans digitou numeros
                            double a,b,hipotenusa ;

                            a = Double.parseDouble(valorA.getText());
                            b = Double.parseDouble(valorB.getText());

                            hipotenusa = (Math.pow(a, 2))+(Math.pow(b, 2));
                            double result_sqrt = Math.sqrt(hipotenusa);

                            raiz.setVisible(true);
                            raiz.setText("A hipotenusa é: " + String.format("%.2f",result_sqrt));

                        } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro
                            raiz.setVisible(true);
                            raiz.setText("Digite apenas números!");
                        }
                    }
                }
        );
        raiz.setVisible(false);


        //personalização
        //mudar a fonte do rotulo,tamanho
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        subtitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        numA.setFont(new Font("Tahoma", Font.BOLD, 16));
        numB.setFont(new Font("Tahoma", Font.BOLD, 16));


        // mudara a cor dos texto no rotulo
        titulo.setForeground(new Color(246, 243, 235));
        subtitulo.setForeground(new Color(246, 243, 235));
        numA.setForeground(new Color(246, 243, 235));
        numB.setForeground(new Color(246, 243, 235));


        //mudar fonte trocar cor do texto
        raiz.setFont(new Font("Tahoma", Font.BOLD, 16));
        raiz.setForeground(new Color(246, 243, 235));



        //mudar botoes
        calcular.setFont(new Font("Tahoma", Font.BOLD, 16));
        calcular.setBackground(new Color(127, 32, 32));
        calcular.setForeground(new Color(201, 202, 172));

        //adicionando itens a tela
        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(numA);
        tela.add(numB);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(raiz);
        tela.add(calcular);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

    }


}
