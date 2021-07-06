package HashMap;

import java.util.*;

public class DictionaryHomework1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> MyDictionary = new Hashtable<>();        // create dictionary 1-- key = число, value = дума (месец)

                        // key, value
        MyDictionary.put("JANUARY", 1);            // запълваме речникa
        MyDictionary.put("FEBRUARY", 2);
        MyDictionary.put("MARCH", 3);
        MyDictionary.put("APRIL", 4);
        MyDictionary.put("MAY", 5);
        MyDictionary.put("JUNE", 6);
        MyDictionary.put("JULY", 7);
        MyDictionary.put("AUGUST", 8);
        MyDictionary.put("SEPTEMBER", 9);
        MyDictionary.put("OCTOBER", 10);
        MyDictionary.put("NOVEMBER", 11);
        MyDictionary.put("DECEMBER", 12);

        Scanner input = new Scanner(System.in);

        System.out.println("ARE YOU GOING TO ENTER A MONTH OR A NUMBER?");
        String userInput = input.nextLine();            // user input = "месец" или "число"

        if(userInput.equals("MONTH")) {         // АКО Е "МЕСЕЦ" ==> key to value
            System.out.println("ENTER MONTH : ");
            String inputMonth = input.nextLine();           // вкарваме месец в конзолата
            System.out.println("NUMBER CORRESPONDING TO ENTERED MONTH : ");
            System.out.println(MyDictionary.get(inputMonth));

        } else if(userInput.equals("NUMBER")){          // АКО Е "ЧИСЛО" ==> value to key
            System.out.println("ENTER NUMBER (1-12) : ");
            int inputNumber = input.nextInt();          // вкарваме число в конзолата

                if(inputNumber < 0 || inputNumber > 12){            // ако е въведено невалидно число
                System.out.println("ERROR : PLEASE ENTER A VALID NUMBER. ");
                } else {
                    System.out.println("MONTH CORRESPONDING TO ENTERED NUMBER : ");
                    for (Map.Entry<String, Integer> entry : MyDictionary.entrySet()) {  // entrySet() = mapping string values to int keys
                        if (entry.getValue() == inputNumber) {          // value == inputnumber
                            System.out.println(entry.getKey());
                        }
                    }
                }
        } else {            // АКО Е ВЪВЕДЕНО НЕЩО РАЗЛИЧНО ОТ "месец" или "число"
            System.out.println("ERROR : PLEASE ENTER 'NUMBER' OR 'MONTH' IN THE CORRECT FORMAT - USING ALL CAPITALS. )");
        }
    }
}
