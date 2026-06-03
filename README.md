# TinyJ Compiler

A compiler and virtual machine for TinyJ, a subset of Java, developed through a three-part compiler construction project at Queens College (CUNY).

## Overview

TinyJ is a small subset of Java used for studying compiler construction. This project implements the major stages of a compiler, from lexical analysis and parsing to semantic analysis, code generation, and execution on a custom virtual machine.

## Features

### Lexical Analysis

* Tokenization of TinyJ source code
* Symbol recognition and classification
* Source file handling

### Syntax Analysis

* Recursive descent parser
* Parse tree generation
* Validation against TinyJ EBNF grammar

### Semantic Analysis

* Symbol table management
* Scope checking
* Identifier validation
* Semantic error detection

### Code Generation

* Translation of TinyJ programs into stack-based virtual machine instructions
* Static and local memory allocation
* Method call support

### Virtual Machine

* Execution of generated TinyJ instructions
* Arithmetic and logical operations
* Control flow instructions
* Stack frame management
* Memory access operations
* Method invocation and return handling

## Repository Structure

```text
docs/                   Assignment specifications
lexer/                  Lexical analyzer implementation
part1-syntax-analysis/  Recursive descent parser
part2-semantic-analysis/ Semantic analysis and symbol tables
part3-code-generation/  Virtual machine implementation
```

## Technologies

* Java
* Compiler Design
* Data Structures
* Algorithms
* Virtual Machines
* Recursive Descent Parsing

## Concepts Demonstrated

* Context-Free Grammars
* EBNF Specifications
* Parse Trees
* Symbol Tables
* Semantic Analysis
* Stack-Based Virtual Machines
* Code Generation

## Academic Context

This project was developed as part of a three-assignment compiler construction sequence at Queens College (CUNY).

Assignment 1 focused on syntax analysis and parse tree generation.

Assignment 2 added semantic analysis, symbol tables, and code generation.

Assignment 3 implemented the execution engine for the TinyJ virtual machine.

## Acknowledgements

The TinyJ language specification and assignment sequence were provided by Professor Tatyung Kong at Queens College (CUNY).

The implementation contained in this repository was completed by Giorgos Stephanis as part of coursework in compiler construction.

## Author

Giorgos Stephanis
B.S. Computer Science, Queens College (CUNY)
Expected Graduation: 2026

