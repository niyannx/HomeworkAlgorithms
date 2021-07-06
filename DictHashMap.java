package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictHashMap {

    public static void main(String[] args) {

        HashMap<String, String> grouptoalbum = new HashMap<>();

        grouptoalbum.put("Nirvana", "Heart-Shaped Box");            // запълваме - key = group, value = album
        grouptoalbum.put("Red Hot Chilli Peppers", "The Getaway");
        grouptoalbum.put("The Neighbourhood", "Wiped out!");
        grouptoalbum.put("I DONT KNOW HOW BUT THEY FOUND ME", "1981");
        grouptoalbum.put("Panic! at the Disco", "Too Rare to Die");
        grouptoalbum.put("Arctic Monkeys", "AM");
        grouptoalbum.put("BONES UK", "IM AFRAID OF AMERICANS");

        Scanner input = new Scanner(System.in);

        System.out.println("ARE YOU GOING TO ENTER A GROUP OR AN ALBUM?");
        String userInput = input.nextLine();

        if(userInput.equals("Group")) {
            System.out.println("ENTER THE NAME OF A MUSIC GROUP : ");
            String inputGroup = input.nextLine();
            if(grouptoalbum.containsKey(inputGroup)) {
                System.out.println("MY FAVOURITE ALBUM OF THIS GROUP IS : ");
                System.out.println(grouptoalbum.get(inputGroup));
            } else {
                System.out.println("SORRY, I DON'T KNOW THIS GROUP. ");
            }
        } else if(userInput.equals("Album")){
            System.out.println("ENTER THE NAME OF AN ALBUM : ");
            String inputAlbum = input.nextLine();
            boolean exists = grouptoalbum.containsValue(inputAlbum);
            if(exists) {
                for (Map.Entry<String, String> entry : grouptoalbum.entrySet()) {
                    if (entry.getValue().equals(inputAlbum)) {          // value == inputatrist
                        System.out.println("THE GROUP THIS ALBUM BELONGS TO IS : ");
                        System.out.println(entry.getKey());
                    }
                }
            } else {
                    System.out.println("SORRY, I DON'T KNOW WHOSE ALBUM THIS IS. ");
            }
        } else {
            System.out.println("ERROR : PLEASE ENTER 'Group' OR 'Album' IN THE CORRECT FORMAT");
        }
    }
}