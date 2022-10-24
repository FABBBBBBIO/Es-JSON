package com.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class Deserializzazione
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        File file= new File("serializzazione.json");
        Classe value = objectMapper.readValue(new File("serializzazione.json"), Classe.class);

        System.out.println("numero: "+ value.getNumero());
        System.out.println("sezione: "+ value.getSezione());
        System.out.println("aula: "+ value.getAula());
    }
}

