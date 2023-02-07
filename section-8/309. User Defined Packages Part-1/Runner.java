
// User defined packages: These packages are defined by the developers as per their application requirements


// To declare user defined packaged we will use "package" keyword.

// package packageName;

// Where packageName may be single name or the combination fo parent package name and child package name.

// package p;
// package p1.p2.p3;

// If we want to use package statements in Java files then we have to follow two conditions.
// 1. Package declaration statement must be first statement
// 2. Package name must be unique, it must not be sharable and it must not be duplicated.

// Q.It it possible to provide more than one package declaration statement in single java file
// Ans:
// No, it is not possible to provide more than one package declaration statement in single java file, because, package declarations statemnt must be first statement in java files, if we provide more tahnt one pacakge declaration statement then only first package declaration statement is acting as first statement and all the remaining package dexlaration statement are not first statements.

// To provide package names java has provided a seperate convention like to include our company domain name in reverse in package name.

//Ex :- www.gimsoft.com
// gimsoft.com
// com.gimsoft


// Ex :- package com.gimsoft.icici.transactions.deposit;
// com.gimsoft --------> Company domain name in reverse
// icici       --------> Client name / Project name
// transactions -------> Module name
// deposit      -------> Sub module name


public class Runner {
    
}
