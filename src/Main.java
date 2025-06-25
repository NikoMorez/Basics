//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //BasicDataTypes();
        //Operators();
        //IfStatments();

        int number1 = 16;
        int number2 = 10;
        int sum =  add(number1, number2);
        int subtractSum =  subtract(number1, number2);
        int numberNegative = -25;
        int evenOrOddNumber = 15;

        double doubleNumber1 = 14.4;
        double doubleNUmber2 = 17.2;
        double doubleSum = addFDoubles(doubleNumber1, doubleNUmber2);

        String Palidronom = "Retter";
        String Greetings = "Hello World!";

        boolean PalidronomBool = false;



        GreetingMessage(Greetings);

        numberNegative = makePositive(numberNegative);
        System.out.println(numberNegative);
        evenOrOddNumber = checkEvenOrOdd(evenOrOddNumber);

        PalidronomBool = checkPalindrom(Palidronom);

        System.out.println(sum);
        System.out.println(subtractSum);
        System.out.println(doubleSum);
        System.out.println(evenOrOddNumber);

        System.out.println("Palidronom: " + PalidronomBool);





    }

    public static void BasicDataTypes(){
        String name = "Niko";
        System.out.println(name);

        int age = 26;
        System.out.println(age);
        double height = 1.79;
        System.out.println(height);
        boolean student = true;

        if(student){
            System.out.println("Ist ein Student");
        }else{
            System.out.println("Ist kein Student");
        }


    }

    public static void Operators(){

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println(sum);

        int c = 5;
        int d = 3;


        int multiplication = c * d;
        System.out.println(multiplication);

        int division = a / d;
        System.out.println(division);

        int addition = a + b;
        System.out.println(addition);
        int subtraction = a - b;
        System.out.println(subtraction);

        float e = 5.3f;
        float f = 2.6f;

        float multiplication2 = e * f;
        System.out.println(multiplication2);

        float division2 = e / f;
        System.out.println(division2);

        float addition2 = e + f;
        System.out.println(addition2);

        float subtraction2 = e - f;
        System.out.println(subtraction2);

        //BonusAufgabe

        String string1 = "Hallo";
        String string2 = "Hallo";

        int result = string1.compareTo(string2);

        if(result < 0){
            System.out.println(string1 +"<"+ string2 +" String1 hat im Vergleich zu String 2 Buchstaben die in der ascii Tabelle davor kommen ");
        }else if(result == 0){
            System.out.println(string1 +"=="+ string2);
        }else{
            System.out.println(string1 +">"+ string2 +" String1 hat im Vergleich zu String 2 Buchstaben die in der ascii Tabelle danach kommen  ");
        }

        String string3 = "A";
        String string4 = "B";

        System.out.println("String 3 "+ string3);
        System.out.println("String 4 "+ string4);

        int result2 = string3.compareTo(string4);

        if(result2 < 0){
            System.out.println(string3 +"<"+ string4);
        }else if(result2 == 0){
            System.out.println(string3 +"=="+ string4);
        }else{
            System.out.println(string3 +">"+ string4);
        }

        String string5 = "a";
        String string6 = "B";

        System.out.println("String 5 "+ string5);
        System.out.println("String 6 "+ string6);

        int lengthS5 = string5.length();
        int lengthS6 = string6.length();

        int result3 = string5.compareTo(string6);

        if(result3 < 0){
            System.out.println(string5 +"<" +string6);
        }else if(result3 == 0){
            System.out.println(string5 +"=="+ string6);
        }else{
            System.out.println(string5 +">"+ string6);
        }

        if(lengthS5 > lengthS6){
            System.out.println("String5 ist länger als String6");
        }else if(lengthS5 == lengthS6){
            System.out.println("String5 gleich Lang zu String 6");
        }else{
            System.out.println("String5 ist kürzer als String6");
        }

    }


    public static void IfStatments(){

        int age = 26;

        if(age > 18){
            System.out.println("Alter ist größer als 18");
        }else if(age == 18) {
            System.out.println("Alter ist gleich 18");
        }else if(age < 18){
            System.out.println("Alter ist kleiner als 18" );
        }

        String name = "Niko";
        if(name.length() < 10){
            System.out.println("Name ist kleiner als 10 Zeichen");
        }else{
            System.out.println("Name ist größer oder gleich 10 Zeichen");
        }

        //Bonus

        int evenOrOdd = 14;

        if(evenOrOdd % 2 == 0){
            System.out.println("Gerade");
        }else{
            System.out.println("Ungerade");
        }

        int grade = 85;

        if(grade == 100 || grade >= 90 ){
            System.out.println("Note A");
        }else if(grade < 90  && grade >= 70 ){
            System.out.println("Note B");
        }else if(grade < 70  && grade >= 50 ){
            System.out.println("Note C");
        }else if(grade < 50 && grade >= 20 ){
            System.out.println("Note D");
        }else{
            System.out.println("Note F");
        }

        int positiveOrNegative = -20;

        if(positiveOrNegative > 1){
            System.out.println("Ist eine Postive Zahl");
        }else if(positiveOrNegative == 0){
            System.out.println("Nicht Negativ nicht Positiv");
        }else if(positiveOrNegative < -1){
            System.out.println("Ist eine Negative Zahl");
        }

    }

    public static void GreetingMessage(String message){

        System.out.println(message);

    }

    public static int add (int number1, int number2){


        int sum = number1 + number2;

        return sum;
    }

    public static double addFDoubles (double number1, double number2){

        double sum = number1 + number2;

        return sum;
    }

    public static int subtract (int number1, int number2){
        int sum = number1 - number2;
        if(number1 > number2){
            return add(number1, number2);
        }
        return sum;
    }

    public static int checkEvenOrOdd(int number){

        if(number % 2 == 0){
            return number;
        }else{
            return number * 2 ;
        }

    }

    public static int makePositive(int number){
        System.out.println("Überprüfung der Nummer" + number);

        if(number > 0){
            return number * -1;
        }else{
            return number;
        }

    }

    public static boolean checkPalindrom(String word){

        String reverse = new StringBuilder(word).reverse().toString();

        return word.equals(reverse);

    }

}