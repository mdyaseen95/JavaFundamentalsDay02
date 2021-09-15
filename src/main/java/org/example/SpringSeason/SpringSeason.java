package org.example.SpringSeason;

public class SpringSeason {

        public static void main( String[] args ) {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            boolean result = ( month >= 3 && month <= 6 && day >= 20 );
            if ( result )
                System.out.println(result);
            else
                System.out.println(result);
        }
}


