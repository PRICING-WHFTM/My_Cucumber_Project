package com.company.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

    private static Properties configFile;

    static {
        try {
            FileInputStream fis = new FileInputStream("configuration.properties");
            configFile = new Properties();
            configFile.load(fis);
            fis.close();
        } catch (IOException e) {
            System.out.println("Failed to load properties file!");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }

}
