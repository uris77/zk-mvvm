package com.example

class Person {

   String firstName
   String lastName
   String website
   String email

    static constraints = {
      email  email:true, blank:false, nullable:true
      website blank:false, nullable:true
      firstName blank:false
      lastName blank:false
    }
}
