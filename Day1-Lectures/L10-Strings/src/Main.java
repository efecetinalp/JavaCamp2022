public class Main {
    public static void main(String[] args) {
        String message = "This is a string";

        System.out.println("number of characters : " + message.length()); //16
        System.out.println("4th character : " + message.charAt(3)); //s
        System.out.println(message.concat(" test"));
        System.out.println(message.startsWith("T")); //true
        System.out.println(message.endsWith("z")); //false

        char[] characters = new char[4];
        message.getChars(0,4,characters,0);  //'T','h','i','s'
        for (char character : characters) {
            System.out.println(character);
        }

        System.out.println(message.indexOf('s')); //3
        System.out.println(message.lastIndexOf('s')); //10

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);

        System.out.println(message.substring(5)); //is a string
        System.out.println(message.substring(5,7)); //is

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        
    }
}
