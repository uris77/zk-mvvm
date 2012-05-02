package com.example

import org.zkoss.zk.grails.*

import org.zkoss.bind.annotation.Command
import org.zkoss.bind.annotation.NotifyChange
import org.zkoss.bind.annotation.Init
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.WireVariable
import org.zkoss.zul.*
import org.zkoss.bind.*
import org.zkoss.bind.validator.*

class PersonViewModel {

   @WireVariable
   def personFacade

   static String SUCCESS_MESSAGE = "Person Saved Successfully!"

   def successFlash 
   def errorFlash 

   def person = [:]

    @Init init() {
    }

    @NotifyChange(['successFlash','person', 'errorFlash']) 
    @Command 
    def save(){
      person = personFacade.create(person)
      
      if(person.errors){
         errorFlash = ""
         errorFlash = person.errors
      }else{
         successFlash = SUCCESS_MESSAGE
      }
    }

    def getFirstNameValidator(){
      return new AbstractValidator(){
         public void validate(ValidationContext ctx){
            def firstName = ctx?.getProperty()?.getValue()
            if(firstName.isAllWhitespace() || firstName == null){
               addInvalidMessage(ctx, " can not be blank")
            }
         }
      }
    }


}
