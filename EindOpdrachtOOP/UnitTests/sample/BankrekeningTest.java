package sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankrekeningTest {
    private Bankrekening b;
    @BeforeEach
    void setUp() {
        b = new Bankrekening("Henk", 10000);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getBudget() {
        assertEquals(10000, b.getBudget(),0.0001);
    }

    @Test
    void stortenTest() {
        b.storten(1000.00);
        assertEquals(11000, b.getBudget(), 0.1);


    }

    @Test
    void opnemenTest() {
        b.opnemen(1000.00);
        assertEquals(9000, b.getBudget(), 0.1);
    }
}