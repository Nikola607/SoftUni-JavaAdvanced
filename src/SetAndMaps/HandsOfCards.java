package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("[:] ");
        Map<String, Integer> map = new LinkedHashMap<>();

        while (!input[0].equals("JOKER")) {
            String name = input[0];
            String[] cards = input[1].split(", ");

            addingCardValues(map, name, cards);
            input = scan.nextLine().split("[:] ");
        }

        map.entrySet().stream().
                forEach(e-> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }

    private static void addingCardValues(Map<String, Integer> map, String name, String[] cards) {
        int sum = 0;

        for (int i = 0; i < cards.length; i++) {
            String[] cardDetails = cards[i].split("");
            String cardNumber = cardDetails[0];
            String cardPower = cardDetails[1];
                switch (cardNumber) {
                    case "J":
                        map.put(name, sum + 11);
                        break;
                    case "Q":
                        map.put(name, sum + 12);
                        break;
                    case "K":
                        map.put(name, sum + 13);
                        break;
                    case "A":
                        map.put(name, sum + 14);
                        break;
                    default:
                        int number = Integer.parseInt(cardNumber);
                        map.put(name, sum + number);
                        break;
                }
                switch (cardPower){
                    case"S":
                        map.put(name, sum * 4);
                        break;
                    case"H":
                        map.put(name, sum * 3);
                        break;
                    case"D":
                        map.put(name, sum * 2);
                        break;
                    case"C":
                        map.put(name, sum);
                        break;
                }
            }
        }
    }
