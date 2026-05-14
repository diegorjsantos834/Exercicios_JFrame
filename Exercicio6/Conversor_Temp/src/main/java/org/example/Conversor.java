package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Conversor extends JFrame {

    JLabel titulo, subtitulo, Celsius, kelvin, fahrenheit, x1;
    JTextField valorC, valorK, valorF;
    JButton calcular;

    public Conversor(){

        //definindo algumas configurações da tela
        super("Bhaskara");

        Container tela = getContentPane();
        tela.setBackground(new Color(134, 155, 126));
        setLayout(null);

        //definindo os nome de cada variavel

        titulo = new JLabel("Temperatura");
        subtitulo = new JLabel("Conversor");
        Celsius = new JLabel("Celsius: ");
        kelvin = new JLabel("Kelvin:");
        fahrenheit = new JLabel("Fahrenheit:");
        x1 = new JLabel();


        valorC = new JTextField(10);
        valorK = new JTextField(10);
        valorF = new JTextField(10);

        // Deixa os campos de resultado travados para digitação
        valorK.setEditable(false);
        valorF.setEditable(false);

        calcular = new JButton("Calcular");

        //definindo a posicação
        titulo.setBounds(130, 20, 200, 20);
        subtitulo.setBounds(150, 50, 300, 20);
        Celsius.setBounds(50, 100, 150, 20);
        kelvin.setBounds(50, 140, 150, 20);
        fahrenheit.setBounds(50, 180, 150, 20);

        valorC.setBounds(210, 100, 140, 20);
        valorK.setBounds(210, 140, 140, 20);
        valorF.setBounds(210, 180, 140, 20);

        calcular.setBounds(100, 230, 200, 30);

        x1.setBounds(50, 260, 350, 30);


        //codigo para o evento do botao
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try {//verificar se o usario apeans digitou numeros
                             double c, k, f;

                            c = Double.parseDouble(valorC.getText());

                            // Faz as conversões
                            k = c + 273.15;
                            f = (c * 9.0 / 5.0) + 32;

                            //Formata os resultado para ficar com virgula nos lugares certos
                            valorK.setText(String.format("%.2f", k).replace(".", ","));
                            valorF.setText(String.format("%.2f", f).replace(".", ","));

                            //esconder o aviso de erro
                            x1.setVisible(false);

                        } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro e vai limpar os outros campos
                            x1.setVisible(true);
                            x1.setText("Digite um número válido em Celsius");
                            valorK.setText("");
                            valorF.setText("");
                        }
                    }
                }
        );
        x1.setVisible(false);

        //personalização
        //mudar a fonte do rotulo,tamanho
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        subtitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
        Celsius.setFont(new Font("Tahoma", Font.BOLD, 16));
        kelvin.setFont(new Font("Tahoma", Font.BOLD, 16));
        fahrenheit.setFont(new Font("Tahoma", Font.BOLD, 16));

        // mudara a cor dos texto no rotulo
        titulo.setForeground(new Color(246, 243, 235));
        subtitulo.setForeground(new Color(246, 243, 235));
        Celsius.setForeground(new Color(246, 243, 235));
        kelvin.setForeground(new Color(246, 243, 235));
        fahrenheit.setForeground(new Color(246, 243, 235));

        //mudar fonte trocar cor do texto
        x1.setFont(new Font("Tahoma", Font.BOLD, 16));
        x1.setForeground(new Color(246, 243, 235));



        //mudar botoes
        calcular.setFont(new Font("Tahoma", Font.BOLD, 16));
        calcular.setBackground(new Color(127, 32, 32));
        calcular.setForeground(new Color(201, 202, 172));

        //adicionando itens a tela
        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(Celsius);
        tela.add(kelvin);
        tela.add(fahrenheit);
        tela.add(valorC);
        tela.add(valorK);
        tela.add(valorF);
        tela.add(x1);
        tela.add(calcular);

        setSize(400, 370);
        setVisible(true);
        setLocationRelativeTo(null);

    }


}
