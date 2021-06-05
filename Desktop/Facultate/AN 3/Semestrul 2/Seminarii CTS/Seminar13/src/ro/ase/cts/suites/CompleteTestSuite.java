package ro.ase.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.teste.GrupaTest;
import ro.ase.cts.teste.GrupaTestWithFakes;
import ro.ase.cts.teste.GrupaTestWithMocks;

@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class})
public class CompleteTestSuite {
}
