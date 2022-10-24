package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        
        Alunno A1 = new Alunno("fabio","la torre", new GregorianCalendar(2005,2,01));
        Alunno A2 = new Alunno("lorenzo","lotti", new GregorianCalendar(2004,9,01));
        Alunno A3 = new Alunno("leonardo","pacini", new GregorianCalendar(2004,10,19));

        ArrayList<Alunno> alunni = new ArrayList<Alunno>();
            alunni.add(A1);
            alunni.add(A2);
            alunni.add(A3);

        Classe C1 = new Classe("5","AIA","04-TC",alunni);

        objectMapper.writeValue(new File("serializzazione.json"), C1);
        
    }
}
