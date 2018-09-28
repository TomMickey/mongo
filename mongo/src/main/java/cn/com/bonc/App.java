package cn.com.bonc;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

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
        //连接mongoDB
        MongoClient mongoClient=new MongoClient("localhost",27017);
        //连接数据库
        MongoDatabase mongoDatabase=mongoClient.getDatabase("local");
        //连接集合
        MongoCollection<Document> ls=mongoDatabase.getCollection("startup_log");
        //创建集合
        //mongoDatabase.createCollection("test2");
        //往集合里插入数据
        Document document=new Document("username","Tom").append("password",12345);
        List<Document> documents=new ArrayList<Document>();
        documents.add(document);
        ls.insertMany(documents);
        System.out.print("连接成功");
        System.out.println( "Hello World!" );
    }
}
