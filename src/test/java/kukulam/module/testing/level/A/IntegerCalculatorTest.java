package kukulam.module.testing.level.A;

import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
    simple test, assertEquals, parametrized test
 */
class IntegerCalculatorTest {

    /**
     * Example test with usage of {@link Assertions#assertThat}.
     */
    @Test
    void shouldAddTwoIntegersCorrectly() {
        // given
        int a = 10;
        int b = 5;
        int expectedResult = 15;

        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.add(a, b);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    /**
     * TODO: test a - b
     * In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     */
    @Test
    void shouldSubtractTwoIntegersCorrectly() {
        // given
        int a = 10;
        int b = 5;

        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.subtract(a, b);

        // then

    }

    /**
     * TODO: test a * b
     * In section 'given' prepare two integers and instance of class {@link IntegerCalculator}.
     * In section 'when' use {@link IntegerCalculator#multiply(int, int)} to get result of multiplication.
     * In section 'then', please use assertions:
     * {@link Assertions#assertThat(int)}
     * {@link AbstractIntegerAssert#isEqualTo(int)}
     * Hint: look at {@link #shouldSubtractTwoIntegersCorrectly}
     */
    @Test
    void shouldMultiplyTwoIntegersCorrectly() {
        // given

        // when

        // then
    }

    /**
     * Example of parametrized test.
     */
    @ParameterizedTest
    @MethodSource("addTwoIntegersArguments")
    void shouldAddTwoIntegersCorrectlyParameterizedTest(int a, int b, int expectedResult) {
        // given
        IntegerCalculator calculator = new IntegerCalculator();

        // when
        int result = calculator.add(a, b);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> addTwoIntegersArguments() {
        return Stream.of(
                //        a,   b,   expectedResult
                arguments(10,  5,   15),
                arguments(1,   2,    3),
                arguments(3,   6,    9)
        );
    }

    /**
     * TODO EXTRA: parametrized test a * b
     * 1. Remove annotation @Disabled (line 105)
     * 2. Create static method with the name 'subtractTwoIntegersArguments' and with return type Stream<Arguments>.
     * You can copy it from method {@link IntegerCalculatorTest#addTwoIntegersArguments()},
     * but REMEMBER to rename method and change value of arguments.
     * 3. Write test, like in {@link #shouldAddTwoIntegersCorrectlyParameterizedTest}.
     */
    @Disabled
    @ParameterizedTest()
    @MethodSource("subtractTwoIntegersArguments")
    void shouldSubtractTwoIntegersCorrectlyParameterizedTest(int a, int b, int expectedResult) {
        // given

        // when

        // then

    }

}