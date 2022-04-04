package Algo_40;

public class Main {
    public static void main(String[] args) {
        Divisão operaçãoDivisão= new Divisão();

        operaçãoDivisão.dividendo = 10;
        operaçãoDivisão.divisor = 3;
        operaçãoDivisão.quociente = operaçãoDivisão.dividendo/operaçãoDivisão.divisor;
        operaçãoDivisão.resto = operaçãoDivisão.dividendo % operaçãoDivisão.divisor;
        System.out.println("O dividendo é:" + operaçãoDivisão.dividendo);
        System.out.println("O Divisor é:"+ operaçãoDivisão.divisor);
        System.out.println("O quociente é:"+ operaçãoDivisão.quociente);
        System.out.println("O resto é:"+ operaçãoDivisão.resto);
    }
}
