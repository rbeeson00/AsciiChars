package test2;

public class AsciiChars {
	
	public static void printNumbers()
	{
	for(int i=0; i<10; i++) {
	int asciiVal = i + 48;
	System.out.println("Ascii value for int: " + asciiVal);
	}
	}

	public static void printLowerCase()
	{
	for(char alphabet = 'a'; alphabet <='z'; alphabet++ )
	{
	int asciiVal = alphabet;
	       System.out.println("Valid value for lower case: " + asciiVal);
	   }
	}

	public static void printUpperCase()
	{
	for(char alphabet = 'A'; alphabet <='Z'; alphabet++ )
	{
	int asciiVal = alphabet;
	       System.out.println("Valid value for upper case: " + asciiVal);
	   }
	}

	int firstNumber = 0, secondNumber = 0, thirdNumber = 0, fourthNumber = 0, fifthNumber = 0, magicNumber = 0;

	public void getValues() {
	//Generate random int value from 50 to 100
	int min = 1, max = 50;
	System.out.println("Random value in int from "+min+" to "+max+ ":");
	int randomInt = (int)(Math.random() * (max - min + 1) + min);
	System.out.println(randomInt);


	//String redCar = "", petName = "", actorName = "";
	//int petAge = 0, luckyNumber = 0, jerseyNumber = 0, modelYear = 0;


	Scanner scanner = new Scanner(System.in);
	System.out.println("Do you have a red car? (yes, no):");
	String redCar = scanner.next();

	System.out.println("What is the name of their favorite pet?");
	String petName = scanner.next();

	System.out.println("What is the age of their favorite pet?");
	int petAge = scanner.nextInt();

	System.out.println("What is your lucky number?");
	int luckyNumber = scanner.nextInt();

	System.out.println("Do you have a favorite quarterback?  If so what is their jersey number?");
	int jerseyNumber = scanner.nextInt();

	System.out.println("What is two-digit model year of your car?");
	int modelYear = scanner.nextInt();

	System.out.println("What is the first name of your favorite actor or actress?");
	String actorName = scanner.next();

	int magicNumber = luckyNumber * randomInt;
	while (magicNumber > 75) {
	magicNumber = magicNumber - 75;
	}

	int firstNumber = petName.charAt(2);
	int secondNumber = modelYear + magicNumber;
	int thirdNumber = 42;
	int fourthNumber = petAge + modelYear;
	int fifthNumber = jerseyNumber + modelYear + petAge;

	System.out.println("Your powerball numbers are:");
	System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber + ","  + fourthNumber + "," + fifthNumber + " Magic Number: " + magicNumber);

	}

	public static void main(String[] args) {
	AsciiChars.printNumbers();
	AsciiChars.printLowerCase();
	AsciiChars.printUpperCase();

	Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter your name: ");     // type a word and hit enter
	String name = scanner.next();
	System.out.println("Hello " + name);

	System.out.print("Do you wish to continue with the interactive portion? (yes, no):");     // type a word and hit enter
	String answer = scanner.next();
	if (answer.equalsIgnoreCase("no")) {
	System.out.println("Please come by to complete the survey");
	}

	AsciiChars ac = new AsciiChars();
	ac.getValues();

	System.out.println("Would you like another set of lottery numbers? (yes, no)");
	answer = scanner.next();

	if (answer.equalsIgnoreCase("yes"))
	ac.getValues();

	}

	}
