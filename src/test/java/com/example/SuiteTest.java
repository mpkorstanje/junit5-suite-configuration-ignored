package com.example;

import org.junit.jupiter.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@ConfigurationParameter(key = Constants.DEFAULT_TEST_INSTANCE_LIFECYCLE_PROPERTY_NAME, value = "per_class")
@SelectClasses(ExampleTest.class)
public class SuiteTest {
}
