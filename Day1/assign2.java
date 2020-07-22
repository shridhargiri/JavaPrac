public class assign2 {
    public static void main(String args[])
    {
        char ch='F';
        System.out.println("Entered char: " + ch);
        char ch1 = Character.toLowerCase(ch);
        switch(ch1)
        {
            case 'a':
                System.out.println("Character is a vowel.");
                break;

            case 'e':
                System.out.println("Character is a vowel.");
                break;
            
            case 'i':
                System.out.println("Character is a vowel.");
                break;
            
            case 'o':
                System.out.println("Character is a vowel.");
                break;

            case 'u':
                System.out.println("Character is a vowel.");
                break;

            default:
                System.out.println("Character is not a vowel!");
        }
    }
}