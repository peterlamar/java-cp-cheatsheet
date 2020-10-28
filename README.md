# java-cp-cheatsheet

[Language Mechanics](#language-mechanics)

1. [Print](#print)
1. [String](#string)
1. [Hashmap](#hashmap)
1. [Math](#math)

[Algorithms](#algorithms)

## Language Mechanics

### Print

```Java
System.out.print("hi");
```

### String

```Java
String str = new String("Welcome to BeginnersBook.com");
char[] array= str.toCharArray();
System.out.print("Content of Array:");
for(char c: array){
    System.out.print(c); // ontent of Array:Welcome to BeginnersBook.com
}
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

## Algorithms

## Useful Links

[Java playground](https://code.sololearn.com/)