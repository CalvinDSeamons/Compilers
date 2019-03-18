## Compiler Project Using Antlr.

Using Antlr the following program can nearly compile a program in the language 'TINY' (denoted with .micro extension).
The compiler currently has 2/4 steps complete towards a fully working compiler.

### Lexer:
Using the Micro.g4 we denote our grammar to get a list of valid tokens from a .micro file. WHILE is a keyword, + is a Operator.


### Parser: 
Again, using the Micro.g4, we now define the syntax of our grammar in a list of rules. What follows a '(' what should come 
after KEYWORD PROGRAM, etc. 


### Symbol Table:
This step still needs work. We are using a stack in combination with a hash map to define the scope of our code along with the
occurrence of entities in our program such as; function names, variables, etc.


### Code Generation:
Have not started yet.   
