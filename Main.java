//Imports to take input from console
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value to be hashed....\n");
        String toHash = bufferedReader.readLine();
        
	//Call to hashMe (Accepts String as input and prints hashed value)
	hashMe(toHash);
    }

    private static void hashMe(String value){
        
	//Convert String to character array
	char[] charValue = value.toCharArray();
        int ascii = 0;
        
	//Loop through character array and add each character's ascii value
	for (char character: charValue ) {
            ascii += (int)character;
        }
        
	//Convert ascii adittion to String
	String aSCII = String.valueOf(ascii);
        
	//Split ascii string to seprate digit as character
	char[] digits = aSCII.toCharArray();
        
	//Replace all digits of ascii String with below characters
	StringBuilder hash1 = new StringBuilder();
        for (char digit : digits) {
            switch (digit) {
                case '0': hash1.append("qaz");
                case '1': hash1.append("zws");
                case '2': hash1.append("sxe");
                case '3': hash1.append("edc");
                case '4': hash1.append("crf");
                case '5': hash1.append("fvt");
                case '6': hash1.append("tgb");
                case '7': hash1.append("byh");
                case '8': hash1.append("hnu");
                case '9': hash1.append("ujn");
            }
        }
        
	//Convert hash1 String again into its ascii code
	char[] charHash = hash1.toString().toCharArray();
        long hash2 = 0;
        for (char character: charHash) {
            hash2 += (int)character;
        }

	//Some mathematical expression to make hash irreversible
        hash2 = hash2 * hash2 - ((hash2 / 2) -2);
        System.out.println("The hashed Value : "+hash2);
    }
}