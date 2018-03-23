package UnitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This is a class for running tests of all the design pattern examples in this project.
 *
 * @author Jakub Plebaniak
 * @version 1.0
 * @since 2018-03-22
 */
public class MyTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(VehicleUnitTests.class, VehicleUnitTestsWithSingletonDP.class,
               VehicleListUnitTests.class, CuboidAdapterUnitTests.class);
        //Result result = JUnitCore.runClasses(CuboidAdapterUnitTests.class);
        System.out.println("UnitTests:");
        System.out.println("\tFailures:");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("\tFailures count: " + result.getFailureCount());
        System.out.println("\tAll tests count: " + result.getRunCount());
        System.out.println("\tWas successful?\t" + result.wasSuccessful());

    }
}
