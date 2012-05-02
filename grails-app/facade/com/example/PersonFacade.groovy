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
            email: _person.email
         ]

         persons.add(person)
      }

      return persons
   }


   def create(params){
      def _person = [:]
      Person person = new Person()
      person.properties['firstName','lastName','email','website'] = params

      person.validate()

      if(person.hasErrors()){
         _person.errors = person.retrieveErrors()
      }else{
         person.save()
         _person = person.properties['id','firstName','lastname','email','website']
      }

      return _person
   }

}
