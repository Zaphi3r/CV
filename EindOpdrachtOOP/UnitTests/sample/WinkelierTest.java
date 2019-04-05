package sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinkelierTest {
    private Winkelier w;
    private Goed g;
    private Goed g1;
    private Goed g2;
    private Bankrekening b;
    private double r;


    @BeforeEach
    void setUp() {

        b = new Bankrekening("Henk",10000);



    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getBudgetTest() {
        double budget = b.getBudget();
        assertTrue(budget == 10000);
    }





}