package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//      Arrays provide an ordered collection of elements we can call on. For example...
        int[] firstArray;
//      Here we declared a variable called theVals that can reference an array of floating-point values.
        firstArray = new int[3];
//      Here, we're creating the array itself, giving it three indexes (starting at 0).
        firstArray[0] = 10;
//      Here we give the first index a value.
        firstArray[1] = 20;
        firstArray[2] = 25;
//      Here we finished assigning the values of the array.
//      So, in total, the above created a floating-point array named theVals, with a value of 10.01, 20.234, and 25.5678.


//      Below we will add up the sum of an array using a simple for loop...
        System.out.println("Array and for loop example:");
        float[] theVals;
        theVals = new float[3];
        theVals[0] = 10f;
        theVals[1] = 12.23f;
        theVals[2] = 23.4489f;
//      Here the array is defined
        float sum = 0.0f;
//      Here we declared a variable to hold the value of the sum
        for (
                int index = 0; // Here we declare a variable called index and set its value equal to 0, since Java arrays use a 0-point index
                index < theVals.length; // Here we have a control to keep running through the array until the index is as long as the length of the array
                index++ // At the end of each pass of the loop, we will increase the value of index by 1
        )
            sum += theVals[index]; // Here we want to add the value of each array element to the sum variable until we get a the total amount
        System.out.println("theVals's sum is " + sum);
//      Here, the result should be 45.6789





//      The work we did to make the array was very space and time intensive; We manually had to type out what data type we were using for the array when we declared the array, then defined the length of the of the array, then individually defined each point in the array index.
//      The shorthand in java is: dataType[] variableName = { array, items, here };
//      For example...
        int[] array1 = { 2, 3, 4, 5 };
        int product = 1;
        for (int indexPoint = 0; indexPoint < array1.length; indexPoint++) product *= array1[indexPoint];
        System.out.println("array1's product is " + product);
//      In this example, you can see how much space is saved, but also notice that to edit the array, one need only add new points to the curly braces.



        System.out.println("\nArray and for-each loop example:");
//      A for-each loop executes a statement once for each array member, so it handles gathering the length of the collection and accessing each value.
//      The syntax of for-each loops are as follows:
//          for ( loop-variable : array ) statement ;
//      An example of an array and for loop (like the one above):
        double[] newVars = { 10d, 23.45678d, 99.999999d };
        double total = 0.0d;
        for (double currentVal : newVars)
            total += currentVal;
        System.out.println("newVars's sum is " + total);
    }
}
