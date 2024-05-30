package day3Mywork;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency { public static void main(String[] args)
{ Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the file path: ");
    String filePath = scanner.nextLine();
    Map<Character, Integer> charFrequency = new HashMap<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dev\\Desktop\\Reyom"))) {
        String line; while ((line = reader.readLine()) != null) {
            for (char c : line.toCharArray()) {
                charFrequency.merge(c, 1, Integer::sum);
            } } }
    catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage()); return;}
    System.out.println("Character Frequency:");
    for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}
