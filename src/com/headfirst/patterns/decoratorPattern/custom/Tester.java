package com.headfirst.patterns.decoratorPattern.custom;

import java.io.*;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class Tester {

    public static void main(String[] args) {

        FootballField soccerField = new StandardField();
        soccerField = new Boots(new Ball(soccerField));

        System.out.println(soccerField.getPrice() + " --> " + soccerField.getInformation());

        try {
            int read;
            InputStream is =new FileInputStream("./src/com/headfirst/patterns/decoratorPattern/Readme.md");
            is = new BufferedInputStream(is);
            is = new LowerCaseInputStream(is);

            while ((read=is.read())>=0){

                System.out.print((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
