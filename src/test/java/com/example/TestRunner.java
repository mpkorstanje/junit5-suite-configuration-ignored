package com.example;

import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;

import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;

public class TestRunner {

    public static void main(String[] args) {
        System.out.println("By suite");

        LauncherDiscoveryRequest requestA = request()
                .selectors(
                        DiscoverySelectors.selectClass(SuiteTest.class)
                )
                .build();

        LauncherFactory.create().execute(requestA);

        System.out.println("By unique id");

        LauncherDiscoveryRequest requestB = request()
                .selectors(
                        DiscoverySelectors.selectUniqueId(
                                UniqueId.forEngine("junit-platform-suite")
                                        .append("suite", "com.example.SuiteTest")
                                        .appendEngine("junit-jupiter")
                                        .append("class", "com.example.ExampleTest" )
                                        .append("method", "test1()")
                        ),
                        DiscoverySelectors.selectUniqueId(
                                UniqueId.forEngine("junit-platform-suite")
                                        .append("suite", "com.example.SuiteTest")
                                        .appendEngine("junit-jupiter")
                                        .append("class", "com.example.ExampleTest" )
                                        .append("method", "test2()")
                        )
                )
                .build();

        LauncherFactory.create().execute(requestB);
    }
}
