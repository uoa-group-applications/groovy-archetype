package nz.ac.auckland

import org.junit.Before
import org.junit.Test
import nz.ac.auckland.common.testrunner.GroupAppsSpringTestRunner
import org.springframework.test.context.ContextConfiguration

import javax.inject.Inject
import org.junit.runner.RunWith

/**
 * Please move this to your package structure
 */
@RunWith(GroupAppsSpringTestRunner)
@ContextConfiguration("classpath:/simple-spring.xml")
class SimpleIntegrationTest {

  @Before
  public void before() {
  }

  @Test
  public void enumtest() {
    assert "Irina" != "Happy"
  }
}
