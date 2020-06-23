package com.recycl.monitoring;

import com.recycl.monitoring.model.CollectionRequest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        primaryStage.setTitle("RECYCL Monitoring");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        String resource = "com/recycl/monitoring/data/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();
        CollectionRequest collectionRequest = new CollectionRequest();
        collectionRequest.setId(1);
        session.insert("insertCollectionRequest", collectionRequest);
        session.commit();
        session.close();
        launch(args);
    }
}
