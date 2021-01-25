package com.company;

class known {

        public static void main(String[] args) {
            int bla = 10;
            int tru;
            tru = 10;

            tru = bla;
            bla = tru;
            tru = tru /2;
            bla = bla /3;
            System.out.println( " присваивание перемнной bla значение 10 ");
            System.out.println( " присваивание перемнной tru значение 10 ");
            System.out.println( tru + " значения переменной tru после деления " );
            System.out.println( bla + " значения переменной bla после деления " );
            if ( 5 > 3 ) System.out.println( " 5 bla меньше 3 tru " );

            double gallons;
            double liters;
            gallons = 456.56;
            liters = gallons * 3.7854;
            System.out.println( " присваивание gallons значение 456,56 " );
            System.out.println( " присваивание liters значение 3,7854 " );
            System.out.println( gallons + " галонн соответсвует " + liters + " литров " );
        }
}
