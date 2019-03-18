#!/bin/bash

shopt -s expand_aliases

export CLASSPATH=".:/c/JavaLib/antlr-4.7.1-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "/c/Javalib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'

antlr4 Micro.g4 
javac Micro*.java
javac ANTLR.java
java ANTLR $1 > $2 



