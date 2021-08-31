package com.sks.model;

public abstract class SportsPerson {
      
      private static int playerId = 10;
      private static String name = "Arjun";
      
      public static void displayPlayerInfo() {
    	  System.out.println("Player Id of sportsPerson is : " + playerId);
    	  System.out.println("Name of sportsPerson is : " + name);
      }
      
      public abstract void registerPlayer();

      public static void main(String[] args) {
		  displayPlayerInfo();
    }
}

