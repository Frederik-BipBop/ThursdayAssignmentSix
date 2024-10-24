package TaskOne;

public class Flow {

        public void methodA(String input) {
            System.out.println("J");
            if (input.equals("start")) {
                System.out.println("A");
                System.out.println("V");
                methodB("start");
            } else {
                System.out.println("");
                methodC(input);

            }
            System.out.println("E");
        }

        public void methodB(String start) {
            if(start.length()<9) {
                System.out.println("A");
            }else
                System.out.println("R");

        }

        public int methodC(String input) {
            System.out.println("S");
            //methodD(input.length());
            return input.length() * 2;
        }

        public void methodD(int number) {
            System.out.println("J");
            if (number > 5) {
                System.out.println("O");
            }
            System.out.println("V");
            System.out.println("T");

        }


    }


