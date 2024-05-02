package main;

import java.text.NumberFormat;

public class Customer{
	
	NumberFormat fmt = NumberFormat.getPercentInstance();
	private String name;
	private double balance;

public Customer(String n, double b){
	name = n;
	balance = b;}

public String getName(){
return name;}

public double getBalance(){
return balance;}

public void setBalance( double balance){
this.balance = balance;}

public void setName(String nam){
name = nam;;}

public String toString(){
return (name + " has \s\s\t\t$" + balance);
}

public String toString_1(){
return name;
}

public void addPercentage(){
double p = 0.15;
balance += p * balance;
}



}