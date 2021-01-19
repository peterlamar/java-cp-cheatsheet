# java-cp-cheatsheet

[Language Mechanics](#language-mechanics)

1. [Array](#array)
1. [Sort](#sort)
1. [Loop](#loop)
1. [String](#string)
1. [Regex](#regex)
1. [Scanner](#scanner)
1. [Stack](#stack)
1. [list](#list)
1. [HashMap](#hashmap)
1. [HashSet](#hashset)
1. [Math](#math)
1. [Compare](#compare)
1. [Date](#date)

[Algorithms](#algorithms)

## Language Mechanics

### Array

```Java
int a[] = new int[n];
for (int i=0; i<n;i++){
    a[i] = scan.nextInt();
}
```

```Java
int[] game = new int[5];
game.length // 5
```

### ArrayList

```Java
Scanner in = new Scanner(System.in);
int numRows = in.nextInt();

ArrayList<ArrayList<Integer>> row = new ArrayList<>();
for (int i=0; i<numRows; i++){
    int numColumns = in.nextInt();
    ArrayList<Integer> col = new ArrayList<>();
    for (int x=0; x<numColumns; x++){
        col.add(in.nextInt());
    }
    row.add(col);
}

int n = in.nextInt();
for (int i = 0; i < n; i++) {
    int x = in.nextInt();
    int y = in.nextInt();
    try {
        System.out.println(row.get(x-1).get(y-1));
    } catch (IndexOutOfBoundsException e) {
        System.out.println("ERROR!");
    }
}
```

### Sort

```Java
Arrays.sort(s, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2){
        if (s1 == null || s2 == null) return 0;
        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd2 = new BigDecimal(s2);
        return bd2.compareTo(bd1);
    } 
});
```

### Loop

Enhanced loop for iterating through collection (Java 5)
```Java
int ar[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
for (int i : ar) { 
    System.out.print(i + " "); // 1 2 3 4 5 6 7 8 
}
```

### String

| Syntax | Description |
| --- | ----------- |
| s.length() | length of s |
| s.charAt() | extract ith character |
| s.substring(start, end) | substring from start to end-1 |
| s.toUpperCase() | returns copy of s in ALL CAPS |
| s.toLowerCase() | returns copy of s in lowercase |
| s.indexOf(x) | index of first occurence of x|
| s.replace(old, new) | search and replace|
| s.split(regex) | split string into tokens |
| s.trim() | trim surrounding whitespace |
| s.equals(s2) | true if s equals s2 |
| s.compareTo(s2) | 0 is equal/+ if s > s2/- if s<s2 |
| s.matches(regex) | if this string matches regex |

[Reference](https://docs.oracle.com/javase/6/docs/api/java/lang/String.html)

Data Conversions

| Syntax | Description |
| --- | ----------- |
| int i = integer.parseInt(str) | str to int |
| double d = Double.parseDouble(str) | str to double |
| String s = String.valueOf(value) | any to string |


Access Character
```Java
String str = new String("Welcome to BeginnersBook.com");
for (int x = 0; x < str.length(); x++){
    System.out.print(str.charAt(x)); // Welcome to BeginnersBook.com
}
```

```Java
String str = new String("Welcome to BeginnersBook.com");
char[] array= str.toCharArray();
System.out.print("Content of Array:");
for(char c: array){
    System.out.print(c); // Content of Array:Welcome to BeginnersBook.com
}
```

```Java
String str = new String("Welcome to BeginnersBook.com"); 
System.out.println(str.substring(10)); // BeginnersBook.com
System.out.println(str.substring(0,10)); // Welcome to
```

```Java
import java.util.*; 
class Playground {
    public static void main(String[ ] args) {
        Stack<String> stk = new Stack<String>();
        String str = new String("/home/foo/"); 
        for (String cur : str.split("/")){
            stk.add(cur); // home foo
        }
        System.out.println(String.join("/", stk)); // /home/foo
    }
}
```

```Java
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String dl = "[!,?._'@\\s]+";
    s = s.trim();
    if (s.length() == 0){
        System.out.println(0);
        return;
    }
    String []tokens = s.split(dl);
    System.out.println(tokens.length);
    for (String t : tokens){
        System.out.println(t);
    }
    scan.close();
}
```

```Java
String s1 = new String("HELLO"); 
String s2 = new String("HELLO"); 
System.out.println(s1 == s2);      // false
System.out.println(s1.equals(s2)); // true
```

### Regex

| Syntax | Description |
| --- | ----------- |
| abc...| Letters |
| 123...| Digits |
| \d| Any digit |
|\D|	Any Non-digit character|
|.|	Any Character|
|\.	|Period|
|[abc]	|Only a, b, or c|
|[^abc]	|Not a, b, nor c|
|[a-z]	|Characters a to z|
|[0-9]	|Numbers 0 to 9|
|\w	|Any Alphanumeric character|
|\W	|Any Non-alphanumeric character|
|{m}|	m Repetitions|
|{m,n}|	m to n Repetitions|
|*|	Zero or more repetitions|
|+|	One or more repetitions|
|?|	Optional character|
|\s|	Any Whitespace|
|\S|	Any Non-whitespace character|
|^…$|	Starts and ends|
|(…)|	Capture Group|
|(a(bc))|	Capture Sub-group|
|(.*)|	Capture all|
|(abc|def)|	Matches abc or def|


Check if Regex is valid
```Java
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while(testCases>0){
        String pattern = in.nextLine();
        try{
            Pattern p = Pattern.compile(pattern);
            System.out.println("Valid");
            } catch (PatternSyntaxException e){
            System.out.println("Invalid");
            }
            testCases--;
    }
}
```

Match HTML strings
```Java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            boolean found=false;
			Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()){
                if (m.group(2).length() != 0){
                    System.out.println(m.group(2));
                    found = true;
                }
            }
            if (!found) System.out.println("None");			
			testCases--;
		}
	}
}
```

1. [Learn Regex](https://regexone.com/)
1. [Test Regex](https://regexr.com/)
1. [Test Regex simple](https://regex101.com/)

### Scanner

Read input from stdin/parse strings

```Java
Scanner scan = new Scanner(System.in);
int i = scan.nextInt();
double d = scan.nextDouble();
String s = scan.nextLine();
if (s.length() == 0)
    s = scan.nextLine();
System.out.println("String: " + s);
System.out.println("Double: " + d);
System.out.println("Int: " + i);
```

```Java
Scanner sc=new Scanner(System.in);
System.out.println("================================");
for(int i=0;i<3;i++)
{
    String s1=sc.next();
    int x=sc.nextInt();
    System.out.printf("%-15s%03d\n",s1,x); // cpp            065 

}
System.out.println("================================");
```

### Stack

```Java
Stack<String> stack = new Stack<String>(); 
stack.push("A");
stack.push("Herring");
System.out.println(stack.pop());
System.out.println(stack.peek());
```

### List

```Java
    LinkedList<Integer> l1 = new LinkedList<>(); 
    l1.add(0, 1); // Adds 1 at 0 index 
    l1.add(1, 2); // Adds 2 at 1 index 
    l1.add(4);
    System.out.println(l1); // [1, 2, 4] 
    l1.remove(0);
    System.out.println(l1); // [2, 4] 
```

### Generics

```Java
public <T> void printArray(T[] array){
    for (T item:array){
        System.out.println(item);
    }
} 
```

### HashMap

```Java
import java.util.*;
Map<Integer, Integer> map = new HashMap<>();
map.put(0, 3);
System.out.print(map.containsKey(0)); // True
System.out.print(map.get(0)); // 3
```

### Set

```Java
Set<String> set = new HashSet<>();
for (int i=0; i<t; i++){
    set.add(pair_left[i] + " " + pair_right[i]);
    System.out.println(set.size());
}
```

### HashSet

```Java
HashSet <String> h = new HashSet<>(); 
h.add("India");
h.add("Australia");
h.add("Spain");
System.out.println("List contains India " + h.contains("India"));
h.remove("Australia");
System.out.println("After removing Australia " + h);
Iterator<String> i = h.iterator();
while (i.hasNext())
    System.out.println(i.next());
```

### Math

```Java
int x = 0;
x = Math.max(1,2);
System.out.print(x); // 2
```

### Compare

```Java
/*
-1 : o1 < o2
0 : o1 == o2
+1 : o1 > o2
*/
public String[] reorderLogFiles(String[] logs) {
    Comparator<String> myComp = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2){
            int s1Space = s1.indexOf(' ');
            int s2Space = s2.indexOf(' ');
            char s1FirstChar = s1.charAt(s1Space + 1);
            char s2FirstChar = s2.charAt(s2Space + 1);
            
            if (s1FirstChar <= '9'){ 
                if (s2FirstChar <= '9'){
                    return 0;
                }
                else return 1; // s1IsNum < s2IsChar
            }
            if (s2FirstChar <= '9') return -1; // s1IsChar > s1IsNum
            
            int pre = s1.substring(s1Space+1).compareTo(s2.substring(s2Space+1));
            if (pre == 0){
                return s1.substring(0, s1Space).compareTo(s2.substring(0,s2Space));
            }
            
            return pre;
        }
    };
    
    Arrays.sort(logs, myComp);
    return logs;
}
```

### Date

```Java
import java.time.LocalDate;
public static String findDay(int month, int day, int year) {
    LocalDate dt = LocalDate.of(year, month, day);
    return dt.getDayOfWeek().name(); // 'Wednesday'
}
```

## Algorithms

## Useful Links

[Java playground](https://code.sololearn.com/)