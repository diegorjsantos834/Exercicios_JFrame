package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Bhaskara extends JFrame {

    JLabel titulo, formula, numA, numB,numC, x1, x2;
    JTextField valorA, valorB, valorC;
    JButton calcular;

    public Bhaskara(){

        //definindo algumas configurações da tela
        super("Bhaskara");

        Container tela = getContentPane();
        tela.setBackground(new Color(134, 155, 126));
        setLayout(null);

        //definindo os nome de cada variavel

        titulo = new JLabel("Bhaskara");
        formula = new JLabel("ax² + bx + c = 0");
        numA = new JLabel("Valor de A: ");
        numB = new JLabel("Valor de B:");
        numC = new JLabel("Valor de C:");
        x1 = new JLabel();
        x2 = new JLabel();


        valorA = new JTextField(10);
        valorB = new JTextField(10);
        valorC = new JTextField(10);

        calcular = new JButton("Calcular");

        //definindo a posicação
        titulo.setBounds(150,20,200,20);
        formula.setBounds(115,60,300,20);
        numA.setBounds(50,100,100,20);
        numB.setBounds(50,140,100,20);
        numC.setBounds(50,180,100,20);


        valorA.setBounds(140,100,200,20);
        valorB.setBounds(140,140,200,20);
        valorC.setBounds(140,180,200,20);


        calcular.setBounds(100, 220, 200, 30);

        x1.setBounds(100, 260, 350, 30);
        x2.setBounds(100, 290, 200, 30);


        //codigo para o evento do botao
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try {//verificar se o usario apeans digitou numeros
                            double a,b,c, delta ;

                            a = Double.parseDouble(valorA.getText());
                            b = Double.parseDouble(valorB.getText());
                            c = Double.parseDouble(valorC.getText());

                            delta = Math.pow(b, 2) - (4 * a * c);

                            if (delta < 0) {//estrutura if else para caso o delta for menor que zero não havera raizes reais
                                x1.setVisible(true);
                                x1.setText("Não existem raízes reais.");
                                x2.setText("");
                            } else {//caso for maior fara a conta normalmente
                                //vai calcular o x1 e x2 com (-b ± √Δ) / 2a
                                double r1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                                double r2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                                x1.setVisible(true);
                                x1.setText("x1 = " + r1);

                                x2.setVisible(true);
                                x2.setText("x2 = " + r2);
                            }

                        } catch (NumberFormatException ex) { //caso não tenha digitado a janela vai mostrar erro
                            x1.setVisible(true);
                            x1.setText("Digite apenas números!");
                        }
                    }
                }
        );
        x1.setVisible(false);
        x2.setVisible(false);

        //personalização
        //mudar a fonte do rotulo,tamanho
        titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        formula.setFont(new Font("Tahoma", Font.BOLD, 18));
        numA.setFont(new Font("Tahoma", Font.BOLD, 16));
        numB.setFont(new Font("Tahoma", Font.BOLD, 16));
        numC.setFont(new Font("Tahoma", Font.BOLD, 16));

        // mudara a cor dos texto no rotulo
        titulo.setForeground(new Color(246, 243, 235));
        formula.setForeground(new Color(246, 243, 235));
        numA.setForeground(new Color(246, 243, 235));
        numB.setForeground(new Color(246, 243, 235));
        numC.setForeground(new Color(246, 243, 235));

        //mudar fonte trocar cor do texto
        x1.setFont(new Font("Tahoma", Font.BOLD, 16));
        x1.setForeground(new Color(246, 243, 235));

        //mudar fonte trocar cor do texto
        x2.setFont(new Font("Tahoma", Font.BOLD, 16));
        x2.setForeground(new Color(246, 243, 235));


        //mudar botoes
        calcular.setFont(new Font("Tahoma", Font.BOLD, 16));
        calcular.setBackground(new Color(127, 32, 32));
        calcular.setForeground(new Color(201, 202, 172));

        //adicionando itens a tela
        tela.add(titulo);
        tela.add(formula);
        tela.add(numA);
        tela.add(numB);
        tela.add(numC);
        tela.add(valorA);
        tela.add(valorB);
        tela.add(valorC);
        tela.add(x1);
        tela.add(x2);
        tela.add(calcular);

        setSize(400, 370);
        setVisible(true);
        setLocationRelativeTo(null);

    }

}
