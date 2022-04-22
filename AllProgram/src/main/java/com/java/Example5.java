package com.java;

import java.util.Scanner;

public class Example5 
{
	public static void main(String[] args) 
	{
		String character;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character: ");
		character = scanner.next();
		switch(character)
		{
		//Lower case alphabets
		case "a":
		case "b":
		case "c":
		case "d":
		case "e":
		case "f":
		case "g":
		case "h":
		case "i":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "o":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "u":
		case "v":
		case "w":
		case "x":
		case "y":
		case "z":
			System.out.println("It is an Lower case alphabet");
			break;
		//Upper case alphabets
		case "A":
		case "B":
		case "C":
		case "D":
		case "E":
		case "F":
		case "G":
		case "H":
		case "I":
		case "J":
		case "K":
		case "L":
		case "M":
		case "N":
		case "O":
		case "P":
		case "Q":
		case "R":
		case "S":
		case "T":
		case "U":
		case "V":
		case "W":
		case "X":
		case "Y":
		case "Z":
			System.out.println("It is an Upper case alphabet");
			break;
			//Digits
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			System.out.println("It is a Digit");
			break;
			//Special characters
		case "!":
		case "@":
		case "#":
		case "$":
		case "%":
		case "^":
		case "&":
		case "*":
		case "(":
		case ")":
		case "_":
		case "-":
		case "+":
		case "=":
		case "{":
		case "}":
		case "[":
		case "]":
		case ":":
		case "|":
		case ";":
		case "'":
		case "<":
		case ">":
		case "?":
		case "/":
		System.out.println("It is a special character");
			break;
		default:
			System.out.println("Kindly Enter a Valid Character.");
		}
		scanner.close();
	}
}


