package com.tarekkma.fee_advprog;

public class Main {

    static class F extends E{
        F(){
        }

        @Override
        public String toString() {
            return "F";
        }

        public String superString(){
            return super.toString();
        }

        public String SuperString(){
            return str();
        }

        static int I(){
            return 1;
        }

    }

    static class E {
        E(){
            this("TEST");
        }
        E(String s){
            System.out.println(s);
        }

        String str(){
            return toString();
        }

        public String toString() {
            return "E";
        }

        static int I(){
            return 1;
        }
    }


    public static void main(String[] args) {

        F f = new F();
        System.out.println(f.toString());
        System.out.println(f.superString());
        System.out.println(f.SuperString());
    }
}
