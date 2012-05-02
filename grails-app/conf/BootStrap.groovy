class BootStrap {

   def messageSource
   def grailsApplication

    def init = { servletContext ->
      grailsApplication.domainClasses.each{domainClass->
         if(domainClass.clazz.name.contains("com.example")){
            domainClass.metaClass.retrieveErrors = {
               def list = delegate?.errors?.allErrors?.collect{messageSource.getMessage(it, null)}
               return list?.join("\n")
            }
         }
      }
    }
    def destroy = {
    }
}
