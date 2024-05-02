package main;

import java.util.Scanner;

public class Main{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
Customer[] c = new Customer[6];

System.out.println("For 6 customers enter the name and in the next line the balance");

for(int i = 0 ; i < c.length; i++){
	c[i] = new Customer(" " , 0);
	c[i].setName(input.nextLine());
	c[i].setBalance(input.nextDouble());
	input.nextLine();
}

System.out.println();

System.out.println("Search for all customers who have less than $150");

for(int i = 0 ; i < c.length; i++){
	if(c[i].getBalance() < 150){
	System.out.println(c[i].getName());
}
}

System.out.println();

double total = 0;
for(int i = 0 ; i < c.length ; i++){
total += c[i].getBalance();
}

double average = total / c.length;
System.out.println("The average balance is: " + average);

System.out.println();

double min = c[0].getBalance();
String min_name = c[0].getName();

for(int i = 0 ; i < c.length ; i++){
if(min > c[i].getBalance()){
min = c[i].getBalance();
min_name = c[i].getName();
}}

for(int i = 0 ; i < c.length ; i++){
	if(min == c[i].getBalance()) {System.out.println("The customer with the lowest balance is: " + min_name);}
}

System.out.println();

double max = c[0].getBalance();
String max_name = c[0].getName();

for(int i = 0 ; i < c.length ; i++){}

for(int i = 0 ; i < c.length ; i++){
if(max < c[i].getBalance()){
max = c[i].getBalance();
max_name = c[i].getName();
}}

for(int i = 0 ; i < c.length ; i++){
	if(max == c[i].getBalance()) {System.out.println("The customer with the highest balance is: " + max_name);}
}
System.out.println();

System.out.println("Show all accounts after a 15% balance increase");
for(int i = 0 ; i < c.length ; i++){
	c[i].addPercentage();
	System.out.println(c[i].toString()); 
}
}}