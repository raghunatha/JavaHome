package com.java.copy.deepCopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCopyCircle
{
    static public void main(String[] args) throws IOException
    {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try
        {
            // create original serializable object
            ColoredCircle c1 = new ColoredCircle(100,100, "Circle");
            // print it
            System.out.println("Original = " + c1.getX() + " " + c1.getY());

            ColoredCircle c2 = null;

            // deep copy
            ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
            oos = new ObjectOutputStream(bos); 
            // serialize and pass the object
            oos.writeObject(c1);   
            oos.flush();               
            ByteArrayInputStream bin = 
			        new ByteArrayInputStream(bos.toByteArray()); 
            ois = new ObjectInputStream(bin);                  
            // return the new object
            c2 = (ColoredCircle)ois.readObject(); 

            // verify it is the same
            System.out.println("Copied   = " + c2.getX() + " " + c2.getY());
            // change the original object's contents
            c1.setX(200);
            c1.setY(200);
            // see what is in each one now
            System.out.println("Original = " + c1.getX() + " " + c1.getY());
            System.out.println("Copied   = " + c2.getX() + " " + c2.getY());
        }
        catch(Exception e)
        {
            System.out.println("Exception in main = " +  e);
        }
        finally
        {        
            oos.close();
            ois.close();
        }
    }
}