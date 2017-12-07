package com.example.chatbot;

import java.util.ArrayList;

/**
 * Created by anuj on 3/9/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Jokes {

    public ArrayList<String> jokes;

    Jokes() {
        jokes = new ArrayList<>();

        jokes.add("Pierwotnie napisałem tę funkcję getQueryParameters, aby zwracała ciąg kwerendy paska adresu jako obiekt klucza / wartości, pierwotnie była to ok. dwudziesto-liniowa funkcja z warunkami i sprawdzaniem błędów i gównem w tym stylu. Myślałem, że mogę to zrobić lepiej.");
        jokes.add("Komputer raz pokonał mnie w szachach, ale nie miał ze mną szans w kick boxingu.");
        jokes.add("Dopóki istnieją testy, w szkołach będzie modlitwa. ");
        jokes.add("Co powiedział ocean do oceanu? Nic, tylko pomachał.");
    }
}
