# The_Wonders_of_Java
This is a repo dedicated to uncovering and showing some of the strangest Java Programms which should acctually never work like this.

Crazy_Java_Code1:
- Why does it execute ?
- How does it execute ?

Solution:
- \u000d is the unicode character for "newline". So when Java first runs the code, 
it replaces the unicode characters with the actual meaning. 
