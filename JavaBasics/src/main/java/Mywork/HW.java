package Mywork;

public class HW {


    public static void main(String[]

                                    args) {

        for (int i = 1; i <= 100; i++) {

            StringBuilder output = new  StringBuilder ();

            if (i % 3 == 0) {

                System.out.print("fizz");
            }

            if (i % 5 == 0){

                System.out.print("buzz");

            }

            if (i % 7 == 0){

                System.out.print("jazz");

            }

            if (output. length() == 0) {

                output.append(i);

            }

            System.out.println (output);

        }}}

