package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IMC extends JFrame {

    JLabel titulo, subtitulo, peso, altura, imc;
    JTextField valorP, valorA;
    JButton calcular;

    public IMC(){

        //definindo algumas configurações da tela
        super("Calculo de IMC");

        Container tela = getContentPane();
        tela.setBackground(new Color(134, 155, 126));
        setLayout(null);

        //definindo os nome de cada variavel

        titulo = new JLabel("Calculo de IMC");
        subtitulo = new JLabel("Verifique seu peso ideal");
        peso = new JLabel("Peso: ");
        altura = new JLabel("Altura:");
        imc = new JLabel();


        valorP = new JTextField(3);
        valorA = new JTextField(3);

        calcular = new JButton("Calcular");

        //definindo a posicação
        titulo.setBounds(115,20,200,20);
        subtitulo.setBounds(85,60,300,20);
        peso.setBounds(70,100,100,20);
        altura.setBounds(70,140,100,20);


        valorP.setBounds(140,100,200,20);
        valorA.setBounds(140,140,200,20);


        calcular.setBounds(100, 180, 200, 30);

        imc.setBounds(100, 220, 350, 30);


        //codigo para o evento do botao
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try {//verificar se o usario apeans digitou numeros
                            double peso,altura,status;

                            peso = Double.parseDouble(valorP.getText());
                            altura = Double.parseDouble(valorA.getText());

                            status = peso / (altura*altura);

                            if (status < 18.5) {//estrutura if e else para verificar qual tipo de peso
                                imc.setVisible(true);
                                imc.setText("Abaixo do peso, IMC: " + String.format("%.2f",status));
                            }
                            else if (status >= 18.5 && status <= 24.99) {
                                imc.setVisible(true);
                                imc.setText("Peso ideal, IMC: " + String.format("%.2f",status));
                            }
                            else {
                                imc.setVisible(true);
                                imc.setText("Acima do peso ideal, IMC: " + String.format("%.2f",status));
                            }


                        } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro
                            imc.setVisible(true);
                            imc.setText("Digite apenas números!");
                        }
                    }
                }
        );
        imc.setVisible(false);


        //personalização
        //mudar a fonte do rotulo,tamanho
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        subtitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        peso.setFont(new Font("Tahoma", Font.BOLD, 16));
        altura.setFont(new Font("Tahoma", Font.BOLD, 16));


        // mudara a cor dos texto no rotulo
        titulo.setForeground(new Color(246, 243, 235));
        subtitulo.setForeground(new Color(246, 243, 235));
        peso.setForeground(new Color(246, 243, 235));
        altura.setForeground(new Color(246, 243, 235));


        //mudar fonte trocar cor do texto
        imc.setFont(new Font("Tahoma", Font.BOLD, 16));
        imc.setForeground(new Color(246, 243, 235));



        //mudar botoes
        calcular.setFont(new Font("Tahoma", Font.BOLD, 16));
        calcular.setBackground(new Color(127, 32, 32));
        calcular.setForeground(new Color(201, 202, 172));

        //adicionando itens a tela
        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(peso);
        tela.add(altura);
        tela.add(valorP);
        tela.add(valorA);
        tela.add(imc);
        tela.add(calcular);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

    }



}
