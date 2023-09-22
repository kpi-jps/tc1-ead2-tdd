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

    @Test
    @DisplayName ("Should give the minimal number of actioned switchers to different initial and final state for A and equal initial and final state for B")
    void shouldGivenTheMinimalNUmberOfActionedSwitchersToDifferenInitialAndFinalStateForAAndEqualInitialAndFinalStateForB() {
        int result = sut.getTheNumberOfSwitchersClicked(1, 0, 0, 0);
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName ("Should give the minimal number of actioned switchers to equal initial and final state for A and different initial and final state for B")
    void shouldGivenTheMinimalNUmberOfActionedSwitchersToEqualInitialAndFinalStateForAAndDifferentInitialAndFinalStateForB() {
        int result = sut.getTheNumberOfSwitchersClicked(1, 1, 1, 0);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName ("Should give the minimal number of actioned switchers to different initial and final state for A and different initial and final state for B")
    void shouldGivenTheMinimalNUmberOfActionedSwitchersToDifferentInitialAndFinalStateForAAndDifferentInitialAndFinalStateForB() {
        int result = sut.getTheNumberOfSwitchersClicked(0, 0, 1, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName ("Should throw an IllegalArgumentException when passed as argument a int different from 0 or 1")
    void shouldThrowAnIllegalArgumentExceptionWhenPassedAsArgumentAIntDifferentFrom0Or1() {
        assertThatExceptionOfType(IllegalArgumentException.class).
            isThrownBy(() -> sut.getTheNumberOfSwitchersClicked(2, 0, 0, 0));
    }



}
