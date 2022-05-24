package soma;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

public class Soma extends JFrame{
JButton somar, subtrair, divisao, multiplicacao;
JTextField texto, texto2, texto3;
int num1, num2, resultado=0;

public Soma(){
super("CALCULADORA DO MONKEY D. LUFFY");
Container tela = getContentPane();
setLayout(null);

texto = new JTextField(15);
texto2 = new JTextField(15);
texto3 = new JTextField(15);
somar = new JButton(" SOMAR ");
subtrair = new JButton(" SUBTRAIR ");
divisao = new JButton (" DIVIDIR ");
multiplicacao = new JButton (" MULTIPLICAÇÃO ");

texto.setBounds(120,20,200,20);
texto2.setBounds(120,40,200,20);
texto3.setBounds(120,170,200,20);
//BOTOES DE ACOES
somar.setBounds(200,80,100,20);
subtrair.setBounds(200,100,100,20);
divisao.setBounds(200,120,100,20);
multiplicacao.setBounds(200,140,100,20);

tela.add(somar);
tela.add(subtrair);
tela.add(divisao);
tela.add(multiplicacao);
tela.add(texto);
tela.add(texto2);
tela.add(texto3);

somar.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 + num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


subtrair.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 - num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

divisao.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 / num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});

multiplicacao.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 * num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


setSize(400,250);
setVisible(true);
texto.requestFocus();
}

public static void main (String[] args){
Soma app = new Soma();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
