package stringTut;

public class BitwiseShiftDemo {
    public static void main(String[] args) {

        int e = -5;
        System.out.println((e >> 1));


    }
}

/*
The difference between the >> (signed right shift) and >>> (unsigned right shift) operators in Java lies in how they handle the sign bit and
how they fill in the leftmost bits after the shift.

>> (Signed Right Shift Operator):

Behavior: Shifts the bits of a number to the right and fills the leftmost bits with the sign bit (the most significant bit).
This is known as an arithmetic shift.
Sign Extension: If the number is positive, the leftmost bits are filled with 0.
If the number is negative, the leftmost bits are filled with 1 (preserving the sign).
Example:
If x = -4 (binary: 1111 1100 in an 8-bit representation), x >> 1 results in 1111 1110 (which is -2 in decimal).

>>> (Unsigned Right Shift Operator):

Behavior: Shifts the bits of a number to the right and always fills the leftmost bits with 0. This is known as a logical shift.
No Sign Extension: This operator does not consider the sign bit and always fills in 0 from the left, regardless of the number's sign.
Example:
If x = -4 (binary: 1111 1100 in an 8-bit representation), x >>> 1 results in 0111 1110 (which is 126 in decimal).

Summary:
>>: Shifts bits to the right and keeps the sign (preserves the sign bit).
>>>: Shifts bits to the right and fills with 0 (ignores the sign bit, treating the number as unsigned).
 */

