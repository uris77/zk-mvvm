package com.example

import org.zkoss.zk.grails.*

import org.zkoss.bind.annotation.Command
import org.zkoss.bind.annotation.NotifyChange
import org.zkoss.bind.annotation.Init
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.WireVariable

class ListViewModel {

   def persons = []

   @WireVariable
   def personFacade

    @Init init() {
      persons = personFacade.all()
    }

      


}
