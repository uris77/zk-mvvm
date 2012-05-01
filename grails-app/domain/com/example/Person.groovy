package com.example

class Person {

   String firstName
   String lastName
   String dateOfBirth
   String website
   String email

    static constraints = {
      email  email:true, blank:false, nullable:true
      website blank:false, nullable:true
      fistName blank:false
      lastName blank:false
    }
}
