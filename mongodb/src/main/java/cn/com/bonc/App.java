package cn.com.bonc;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //连接需要用户名和密码的mongoDb服务器
        ServerAddress serverAddress=new ServerAddress("localhost",27017);
        List<ServerAddress> serverAddresses=new ArrayList<ServerAddress>();
        serverAddresses.add(serverAddress);
        //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码
        MongoCredential mongoCredential=MongoCredential.createMongoCRCredential("username","test","1234".toCharArray());
        List<MongoCredential> mongoCredentials=new ArrayList<MongoCredential>();
        mongoCredentials.add(mongoCredential);
        //连接mongodb服务器
        MongoClient mongoClient=new MongoClient(serverAddresses,mongoCredentials);
        //连接到数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("databaseName");
        System.out.println("Connect to database successfully");
        System.out.println( "Hello World!" );
    }
}
