# java-cp-cheatsheet

[Language Mechanics](#language-mechanics)

1. [Loop](#loop)
1. [String](#string)
1. [Stack](#stack)
1. [list](#list)
1. [Hashmap](#hashmap)
1. [Math](#math)
1. [Compare](#compare)

[Algorithms](#algorithms)

## Language Mechanics

### Loop

Enhanced loop for iterating through collection (Java 5)
```Java
int ar[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
for (int i : ar) { 
    System.out.print(i + " "); // 1 2 3 4 5 6 7 8 
}
```

### String

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
String s1 = new String("HELLO"); 
String s2 = new String("HELLO"); 
System.out.println(s1 == s2);      // false
System.out.println(s1.equals(s2)); // true
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
List<Integer> l1 = new ArrayList<Integer>(); 
l1.add(0, 1); // Adds 1 at 0 index 
l1.add(1, 2); // Adds 2 at 1 index 
l1.add(4);
System.out.println(l1); // [1, 2, 4]
```

### Hashmap

```Java
import java.util.*;
Map<Integer, Integer> map = new HashMap<>();
map.put(0, 3);
System.out.print(map.containsKey(0)); // True
System.out.print(map.get(0)); // 3
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

## Algorithms

## Useful Links

[Java playground](https://code.sololearn.com/)