package Opgave1;

public class Flows {
    public void methodA(String input) {
            System.out.println("j");
            if (!input.equals("start")) {
                System.out.println("b");
                methodB("start");
            } else {
                System.out.println("a");
                System.out.println(methodC(input));

            }
            System.out.println("i");
        }

        public void methodB(String start) {
            System.out.println("c");
        }

        public int methodC(String input) {
            System.out.println("v");
            methodD(input.length());
            return input.length() * 2;
        }

        public void methodD(int number) {
            System.out.println("a");
            if (number > 5) {
                System.out.println("r");
            }
            System.out.println("e");

        }


    }

