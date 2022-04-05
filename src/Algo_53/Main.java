package Algo_53;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Paralelepipedo pad1 = new Paralelepipedo();

        String s;

        s = JOptionPane.showInputDialog("Entre com o valor da lateral A");
        pad1.dA = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("Entre com o valor da lateral B");
        pad1.dB = Double.parseDouble(s);
        pad1.dC = Double.parseDouble(JOptionPane.showInputDialog ("Entre com o valor da lateral C"));

        pad1.dDiagonal = Math.sqrt(Math.pow(pad1.dA,2)+Math.pow(pad1.dB,2)+Math.pow(pad1.dC,0));

        JOptionPane.showMessageDialog(null,"O valor da diagonal do paralelepipedo é: "+pad1.dDiagonal);

        if(pad1.dDiagonal <=10) JOptionPane.showMessageDialog(null, "Diagonal Curta");
        else JOptionPane.showMessageDialog(null, "Diagonal Longa");

        s = JOptionPane.showInputDialog("Deseja continuar (s/n)?");

        switch(s){
            case "s" : JOptionPane.showMessageDialog(null,"Sinto muito não posso continuar pois ainda não vimos laços de repetição");
            break;
            case "n" : JOptionPane.showMessageDialog(null,"Opção correta, vamos terminar");
            break;
            default: JOptionPane.showMessageDialog(null,"Opção invalida");
        }


    }
}
