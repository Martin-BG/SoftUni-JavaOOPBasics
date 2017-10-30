package Lesson02Encapsulation.Exercise.pr03_animal_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = reader.readLine();
            int age = Integer.parseInt(reader.readLine());

            Chicken chicken = new Chicken(name, age);

            System.out.println(chicken.getInfo());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}