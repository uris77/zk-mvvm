package com.example

import org.zkoss.zk.grails.*

class PersonFacade {

   def all(){
      def persons = []

      for(_person in Person.list()){
         def person = [
            id: _person.id,
            firstName: _person.firstName,
            lastName: _person.lastName,
            website: _person.website,
            email: _person.email,
            dateOfBirth: _person.dateOfBirth
         ]

         persons.add(person)
      }

      return persons
   }

}
