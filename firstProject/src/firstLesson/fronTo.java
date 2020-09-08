class Half {
    public static void main( String[] args ){
        int from = 0;
	int to = 0;

        //System.out.print(  );
        from = Integer.parseInt( System.console().readLine("please enter the lower limit: "););
        //System.out.print(  );
        to   = Integer.parseInt( System.console().readLine("please enter the upper limit: "););

        System.out.print( from + " to " + to + " will be equal to:\n\n" );
        
        for( int idx = from; idx <= to; ++idx ){
            System.out.print( “the half of” + idx + "is" + idx / 2.0 + "\n" );
        }
    }
}
