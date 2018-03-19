package javaDay5.ex05;

public  class TvApp {
    public static void main( String[] args ) {
       Tv tv = new Tv( 7, 20, false);  	
        
        tv.status();	
        
        tv.setPow( true );
        tv.setVol( 120 );
        tv.status();		          
        
        tv.setVol( false );
        tv.status();
        
        tv.setCh( 0 );
        tv.status();		          
        
        tv.setCh( true );
        tv.setCh( true );
        tv.setCh( true );
        tv.status();

        tv.setPow( false );
        tv.status();      		          
    }
}