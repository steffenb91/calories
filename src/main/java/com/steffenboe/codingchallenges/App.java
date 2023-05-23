package com.steffenboe.codingchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        Expedition expedition = new Expedition();
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                Elf elf = new Elf();
                expedition.addElf(elf);
            } else {
                int calories = Integer.parseInt(line);
                expedition.addCalories(calories);
            }
        }

        int maxCalories = expedition.getElves()
                .stream()
                .mapToInt(elf -> elf.getCalories())
                .max().orElse(0);

        System.out.println("Elf carrying th most calories carries: " + maxCalories);
    }
}
