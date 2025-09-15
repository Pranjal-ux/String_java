public class OperationInString {
    public static void main(String[] args) {
//         String name = "PRANJAL";
// System.out.println(name.toLowerCase());
// System.out.println(name);
//     String name2 = "pranjal";
// System.out.println(name.toUpperCase());
 

// Concept of charAt()


// String name = "DelhiGangOnTOP";
// System.out.println(name.charAt(0));

//IndexOf

// String name = "Pranjal shukla";
// System.out.println(name.indexOf('s'));


// Length

// String name = "wyfgyifu9iwfi0j-of-0ofo-wjubwfvwydbcuoicgfnkc bfuyukcwf";
// System.out.println(name.length());

// Convert String to a charArray

// String str = "Pranjal shukla";
// char ch[] = str.toCharArray();
// for(int i = 0 ;i<str.length();i++){
//     System.out.print(ch[i]+" ");
// }

//CompaerTo()

// System.out.println("Pranjal".compareTo("Pra"));
// System.out.println("Pra".compareTo("Pranjal"));
// System.out.println("Pranjal".compareTo("Pranjal"));

// Trim()

// System.out.println("      Panjal    ");
// System.out.println("      Pranjal    ".trim());

// StartWith() or endsWith()

// System.out.println("Pranjal shukla".startsWith("Pranj"));
// System.out.println("Pranjal shukla".endsWith("kk"));

//Substring
// System.out.println("Henry".substring(2,4));


// Q1 Give a string and we should be convert into the char array

// String myLocation = "Heydrabad,Delhi,Lucknow,Pune,Mumbai";
// String myLocationList[] = myLocation.split(",");
// for(int i = 0 ; i<myLocationList.length;i++){
//     System.out.print(myLocationList[i]+" ");
    // }


// Q-2
String email ="ShashwatTiwari@gmail.com";

String emailSplit[] = email.split("@");
String lastPart = emailSplit[emailSplit.length-1];
int dotIndex = lastPart.indexOf('.');
System.out.println(lastPart.substring(0,dotIndex));
String email2 ="randomAvenger@hotmail.com";
String emailSplit2[] = email2.split("@");
String lastPart2 = emailSplit2[emailSplit2.length-1];
int dotIndex2 = lastPart2.indexOf('.');
System.out.println(lastPart2.substring(0,dotIndex2));



}
}


