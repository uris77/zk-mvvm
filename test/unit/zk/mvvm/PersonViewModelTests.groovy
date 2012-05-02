package zk.mvvm

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import com.example.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class PersonViewModelTests {

   @Before
    void setUp() {
    }

    void tearDown() {
    }

   @Test
   void create_person() {
      PersonViewModel vm = new PersonViewModel()
      vm.personFacade = [create: {[id:1, firstName: 'First', lastName: 'Last']}]
      vm.save()
      assertNotNull vm.person.id
      assertEquals 1, vm.person.id
   }
}
