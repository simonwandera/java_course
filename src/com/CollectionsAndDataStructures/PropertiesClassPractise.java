package com.CollectionsAndDataStructures;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesClassPractise {
    public void propertiesClass() throws IOException {
        FileReader reader=new FileReader("db.properties");

        Properties properties=new Properties();
        properties.load(reader);

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }

    public void systemProperties(){
        Properties properties = System.getProperties();
        Set set = properties.entrySet();

        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


    }


}
