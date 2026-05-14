package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class triangulos extends JFrame {
    JLabel titulo, subtitulo, numA, numB,numC, x;
    JTextField valorA, valorB, valorC;
    JButton verificar;

    public triangulos(){

        //definindo algumas configurações da tela
        super("Verificaçõa de Triangulos");

        Container tela = getContentPane();
        tela.setBackground(new Color(134, 155, 126));
        setLayout(null);

        //definindo os nome de cada variavel

        titulo = new JLabel("Verificação");
        subtitulo = new JLabel("Tipos do Triangulo");
        numA = new JLabel("Lado 1: ");
        numB = new JLabel("Lado 2: ");
        numC = new JLabel("Lado 3: ");
        x = new JLabel();



        valorA = new JTextField(10);
        valorB = new JTextField(10);
        valorC = new JTextField(10);

        verificar = new JButton("Verificar");

        //definindo a posicação
        titulo.setBounds(150,20,200,20);
        subtitulo.setBounds(115,60,300,20);
        numA.setBounds(50,100,100,20);
        numB.setBounds(50,140,100,20);
        numC.setBounds(50,180,100,20);


        valorA.setBounds(140,100,200,20);
        valorB.setBounds(140,140,200,20);
        valorC.setBounds(140,180,200,20);


        verificar.setBounds(100, 220, 200, 30);

        x.setBounds(110, 260, 350, 30);


        //codigo para o evento do botao
        verificar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try {//verificar se o usario apeans digitou numeros
                            double lado1,lado2,lado3, tipo ;

                            lado1 = Double.parseDouble(valorA.getText());
                            lado2 = Double.parseDouble(valorB.getText());
                            lado3 = Double.parseDouble(valorC.getText());

                            // Equilátero (Todos iguais)
                            if (lado1 == lado2 && lado2 == lado3) {
                                x.setVisible(true);
                                x.setText("Triângulo Equilátero");
                            }
                            // Isósceles (Pelo menos dois iguais)
                            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                                x.setVisible(true);
                                x.setText("Triângulo Isósceles");
                            }
                            // Escaleno
                            else {
                                x.setVisible(true);
                                x.setText("Triângulo Escaleno");
                            }


                        } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro
                            x.setVisible(true);
                            x.setText("Digite apenas números!");
                        }
                    }
                }
        );
        x.setVisible(false);

        //personalização
        //mudar a fonte do rotulo,tamanho
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        subtitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        numA.setFont(new Font("Tahoma", Font.BOLD, 16));
        numB.setFont(new Font("Tahoma", Font.BOLD, 16));
        numC.setFont(new Font("Tahoma", Font.BOLD, 16));

        // mudara a cor dos texto no rotulo
        titulo.setForeground(new Color(246, 243, 235));
        subtitulo.setForeground(new Color(246, 243, 235));
        numA.setForeground(new Color(246, 243, 235));
        numB.setForeground(new Color(246, 243, 235));
        numC.setForeground(new Color(246, 243, 235));

        //mudar fonte trocar cor do texto
        x.setFont(new Font("Tahoma", Font.BOLD, 16));
        x.setForeground(new Color(246, 243, 235));


        //mudar botao
        verificar.setFont(new Font("Tahoma", Font.BOLD, 16));
        verificar.setBackground(new Color(127, 32, 32));
        verificar.setForeground(new Color(201, 202, 172));

        //adicionando itens a tela
        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(numA);
        tela.add(numB);
        tela.add(numC);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(x);;
        tela.add(verificar);

        setSize(400, 350);
        setVisible(true);
        setLocationRelativeTo(null);

    }


}
