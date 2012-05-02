package com.example

import org.zkoss.zk.grails.composer.*
import org.zkoss.bind.BindComposer

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class CreateComposer extends BindComposer {

   def errorDiv

   def createButton

    def afterCompose = { window ->
    }

    def onClick_createButton(){
    }
}
