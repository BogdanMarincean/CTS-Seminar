package ro.ase.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@SuiteClasses(CompleteTestSuite.class)
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
public class CustomTestSuite {
}
