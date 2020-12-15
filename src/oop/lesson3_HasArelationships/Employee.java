package oop.lesson3_HasArelationships;

import oop.lesson3_HasArelationships.*;

public class Employee
{
  String firstName;
  String lastName;
  Address address;

  public Employee(String fName, String lName, Address addr)
  {
    this.firstName = fName;
    this.lastName = lName;
    this.address = addr;
  }

  public String getAddress()
  {
    return this.address.toString();
  }

   public String toString()
  {
    return this.lastName + ", " + this.firstName + "\n" + this.getAddress();
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> a7392016e5bf11cac3f39c7a7cf53e7dd5e0f121

}