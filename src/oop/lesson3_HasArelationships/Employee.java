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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
  }
=======
  } 
>>>>>>> a7392016e5bf11cac3f39c7a7cf53e7dd5e0f121
=======
  } 
>>>>>>> a7e1744943665bc2340a3fd0b3650c93b5a97e9e
=======
  } 
>>>>>>> 9c6a14d9cd07614ada0b517f682b4926dbdc705b
=======
  } 
>>>>>>> 4629034ecabd8d018aa00934a5ab79ae9f4ef690

}