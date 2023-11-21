package Miniprojekt1.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Miniprojekt1.main.Triangle;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {

    @Test
    @DisplayName("Valid input: '3,4,5' should result in SCALENE triangle")
    void testInput() {
        String data = "3,4,5";
        InputStream originalSystemIn = System.in;
        ByteArrayInputStream bytestream = new ByteArrayInputStream(data.getBytes());
        System.setIn(bytestream);

        Triangle triangle = new Triangle();
        triangle.getUserInput();

        assertEquals(Triangle.TYPE.SCALENE, triangle.getCurrent_type());

        System.setIn(originalSystemIn);
    }

    @Test
    @DisplayName("Invalid input length: Array length more than 3 should result in null type")
    void getUserInputLength() {
        String[] arr = {"1", "2", "3", "4", "5"};
        Triangle t = new Triangle(arr);

        assertNull(t.getCurrent_type(), "Type should be null for invalid input length");
    }

    @Test
    @DisplayName("Invalid input type: Array with non-numeric elements should result in null type")
    void correctInputType() {
        String[] arr = {"*", "y", "k"};
        Triangle t = new Triangle(arr);

        assertNull(t.getCurrent_type(), "Type should be null for non-numeric input");
    }

    @Test
    @DisplayName("Invalid characters in input: '*', 'a', '@' should result in null type")
    void getInvalidInput() {
        String simulatedUserInput = "*,a,@\n";
        InputStream originalSystemIn = System.in;
        ByteArrayInputStream bytestream = new ByteArrayInputStream(simulatedUserInput.getBytes());
        System.setIn(bytestream);

        Triangle triangle = new Triangle();
        triangle.getUserInput();

        assertNull(triangle.getCurrent_type(), "Type should be null for invalid input");

        System.setIn(originalSystemIn);
    }

    @Test
    @DisplayName("Invalid input length: '2,2,4,5' should result in null type")
    void getInvalidInputLength() {
        String simulatedUserInput = "2,2,4,5\n";
        InputStream originalSystemIn = System.in;
        ByteArrayInputStream bytestream = new ByteArrayInputStream(simulatedUserInput.getBytes());
        System.setIn(bytestream);

        Triangle triangle = new Triangle();
        triangle.getUserInput();

        assertNull(triangle.getCurrent_type(), "Type should be null for invalid input");

        System.setIn(originalSystemIn);
    }

    @Test
    @DisplayName("Valid sides: '3,3,5' should result in ISOSCELES triangle")
    void getTriangleIsosceles() {

        Triangle t = new Triangle(3, 3, 5);
        String triangleType = String.valueOf(t.getCurrent_type());

        assertEquals("ISOSCELES", triangleType);
    }

    @Test
    @DisplayName("Invalid sides: '1,1,2' should result in null type (not a valid triangle)")
    void getTriangleEquality() {
        Triangle t = new Triangle(1, 1, 2);

        assertNull(t.getCurrent_type(), "Triangle with sides 1, 1, & 2 shouldn't' be valid");
    }

    @Test
    @DisplayName("Valid sides: '3,4,5' should result in SCALENE triangle")
    void getTriangleScalene() {
        Triangle t = new Triangle(3, 4, 5);
        String triangleType = String.valueOf(t.getCurrent_type());

        assertEquals("SCALENE", triangleType);
    }

    @Test
    @DisplayName("Valid sides: '3,3,3' should result in EQUILATERAL triangle")
    void getTriangleEquilateral() {
        Triangle t = new Triangle(3, 3, 3);
        String triangleType = String.valueOf(t.getCurrent_type());

        assertEquals("EQUILATERAL", triangleType);
    }

    @Test
    @DisplayName("Invalid sides: '-1,-1,-1' should result in null type (not a valid triangle)")
    void getTriangleNegativeSides() {
        Triangle t = new Triangle(-1, -1, -1);
        String triangleType = String.valueOf(t.getCurrent_type());

        assertEquals("null", triangleType);
    }

    @Test
    @DisplayName("Invalid sides: '1,1,3' should result in null type (not a valid triangle)")
    void getInvalidTriangle() {
        Triangle t = new Triangle(1, 1, 3);
        String triangleType = String.valueOf(t.getCurrent_type());

        assertEquals("null", triangleType);
    }
}



