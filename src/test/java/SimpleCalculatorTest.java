import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    public  void calculatorTest(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int mycalc = simpleCalculator.calculator(3, 7);
        assertEquals(11, mycalc); //SHould fail since correct answer is 10.
    }

}