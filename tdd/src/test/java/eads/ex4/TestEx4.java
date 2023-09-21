package eads.ex4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestEx4 {

    
    Ex4 sut = new Ex4();
    
    @Test
    @DisplayName ("Should give the minimal number of actioned switchers to equal initial and final state")
    void shouldGivenTheMinimalNUmberOfActionedSwitchersToEqualInitialAndFinalState() {
        int result = sut.getTheNumberOfSwitchersClicked(0, 0, 0, 0);
        assertThat(result).isEqualTo(0);
    }

    

}
