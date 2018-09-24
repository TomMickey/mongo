package cn.com.bonc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MongoClient mongoClient=new MongoClient("localhost",27017);
        System.out.println( "Hello World!" );
    }
}
