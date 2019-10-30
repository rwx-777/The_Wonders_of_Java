# The_Wonders_of_Java
This is a repo dedicated to uncovering and showing some of the strangest Java Programms which should acctually never work like this.

Crazy_Java_Code1:
- Why does it execute ?
- How does it execute ?

Solution:
- \u000d is the unicode character for "newline". So when Java first runs the code, 
it replaces the unicode characters with the actual meaning. 


Crazy_Java_Code2:
- What is the difference between ( j = j++; & j = ++j;) ?

Solution:
- with j=j++; it only increments the value of j after it has assigned it.
- with j=++j; in this case j will first be incremented than assigned.
- You can find the full explanaiton and demo in the Code.
