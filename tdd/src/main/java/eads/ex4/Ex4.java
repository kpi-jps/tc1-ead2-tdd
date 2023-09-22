package eads.ex4;

public class Ex4 {
    
    private int AState = 0;
    private int BState = 0;
    private int count = 0;

    private void toogleAState() {
        if(AState == 0) {
            AState = 1;
            return;
        }
        AState = 0;
    }

    private void toogleBState() {
        if(BState == 0) {
            BState = 1;
            return;
        }
        BState = 0;
    }

    private void incrementCount() {
        count++;
    }

    private void resetCount() {
        count = 0;
    }
    
    private void clickC1() {
        toogleAState();
        incrementCount();
    }

    private void clickC2() {
        toogleAState();
        toogleBState();
        incrementCount();
    }

    private void setInitialState(int IA, int IB) {
        this.AState = IA;
        this.BState = IB;
    }

    private boolean checkFinalState(int FA, int FB) {
        return AState == FA && BState == FB;
    }

    public int getTheNumberOfSwitchersClicked(int IA, int IB, int FA, int FB) {
        if(IA > 1 || IB > 1 || FA > 1 || FB > 1 || IA < 0 || IB < 0 || FA < 0 || FB < 0)
            throw new IllegalArgumentException("Only allowed 0 or 1 as parameters!");
        resetCount();
        setInitialState(IA, IB);
        if(IA != FA && IB != FB) clickC2();
        if(IA != FA && IB == FB) clickC1();
        if(IA == FA && IB != FB) {
            clickC2();
            clickC1();
        }
        if(!checkFinalState(FA, FB)) return -1;
        return count;
    }

    
   
}
