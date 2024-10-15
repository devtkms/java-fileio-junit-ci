## What I Leaned
- I learned about basic file input/output operations using Java IO.
- I executed tests using JUnit5.
- I set up CI with GitHub Actions.

Although each task was simple, they are fundamental skills that I want to master and use as my strengths.

## About Testing

I used JUnit 5 to execute simple unit tests. JUnit is a testing framework for Java that is essential for test-driven development (TDD) and quality assurance. Below is a summary of the key annotations and methods used in testing.

### Key Annotations
- `@Test`: Indicates that the method is a test case. It’s the most basic annotation for executing tests.
- `@BeforeEach`: Used to annotate a method that is executed before each test method. It’s often used for setting up test conditions.
- `@AfterEach`: Annotates a method that is executed after each test method. Typically used for cleanup operations after each test.
- `@BeforeAll`: Annotates a method that is executed once before all tests are run. Often used for initializing resources that are shared across tests.
- `@AfterAll`: Annotates a method that is executed once after all tests are completed. This is useful for cleanup after all tests.
- `@Disabled`: Used to temporarily disable a test method or class.

### Key Assertion Methods
- `assertEquals(expected, actual)`: Confirms that the expected value matches the actual value.
- `assertTrue(condition)`: Asserts that the condition is `true`.
- `assertFalse(condition)`: Asserts that the condition is `false`.
- `assertThrows(exceptionClass, executable)`: Confirms that the specified exception is thrown.

### Mockito for Testing
Mockito is a framework that allows you to create mock objects and simulate the behavior of real objects without interacting with external services or databases. This makes it possible to isolate and test specific logic in your code.

#### Key Mockito Methods
- **`when-thenReturn`**: Specifies the value to return when a mocked method is called.
- **`thenThrow`**: Configures a mocked method to throw an exception when called.
- **`verify`**: Verifies if a mocked method was called as expected.

## References
For CI, I referred to the following:
- https://github.com/actions/setup-java

