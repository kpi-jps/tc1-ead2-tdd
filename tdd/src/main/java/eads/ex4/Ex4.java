package eads.ex4;

/*
 * Ex 4 - Você está de volta em seu hotel na Tailândia depois de um dia de mergulhos. O seu quarto
tem duas lâmpadas, chamadas de A e B. No hotel há dois interruptores, que chamaremos de C1 e C2. Ao
apertar C1, a lâmpada A acende se estiver apagada, e apaga se estiver acesa. Se apertar C2, cada uma das
lâmpadas A e a B troca de estado: se estiver apagada, fica acesa e se estiver acesa apaga. Você chegou no
hotel e encontrou as lâmpadas em um determinado estado, como foram deixadas por seu amigo. Vamos
chamar o estado inicial da lâmpada A de IA e o estado inicial da lâmpada B de IB. Você gostaria de deixar
as lâmpadas em uma certa configuração final, que chamaremos de FA e FB, respectivamente, apertando
os interruptores a menor quantidade de vezes possível. Por exemplo, se as duas lâmpadas começam
apagadas, e você quer que apenas a lâmpada A termine acesa, basta apertar o interruptor C1.
Faça um programa que leia os estados iniciais IA e IB e os estados finais desejados FA e FB das duas
lâmpadas. Os valores de IA, IB, FA e FB são lidos na mesma linha nessa ordem. Seus valores possíveis são
0, se a lâmpada estiver apagada e 1 caso contrário. Ao final, seu programa deverá imprimir o número
mínimo de interruptores que devem ser apertados.
Exemplos de entrada e saída:
Entrada Saída
0 0 1 1 1
0 0 0 1 2
Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)
* Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */

public class Ex4 {
    
    private int AState = 0;
    private int BState = 0;
    private int count = 0;
    
    private void clickC1() {
        incrementCount();
        if(AState == 0) {
            AState = 1;
            return;
        }
        AState = 0;
        
    }

    private void incrementCount() {
        count++;
    }

    private void resetCount() {
        count = 0;
    }

    private void clickC2() {
        incrementCount();
        if(AState == 0) AState = 1;
        else AState = 0;
        if(BState == 0) BState = 1;
        else BState = 0;
        
    }

    public int getTheNumberOfSwitchersClicked(int IA, int IB, int FA, int FB) {
        resetCount();
        AState = IA;
        BState = IB;
        if(IA != FA && IB != FB) clickC2();
        if(IA != FA && IB == FB) clickC1();
        if(IA == FA && IB != FB) {
            clickC2();
            clickC1();
        }
        if(AState == FA && BState == FB) return count;
        return 0;
    }

    
   
}
