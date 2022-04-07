package com.jenkinsZephyr.junit.first;

//import static org.junit.jupiter.api.Assertions.assertAll;
////import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Optional;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import com.smartbear.zephyrscale.junit.annotation.TestCase;


import com.smartbear.zephyrscale.junit.annotation.TestCase;
import com.smartbear.zephyrscale.junit.builder.CustomFormatContainerBuilder;
import com.smartbear.zephyrscale.junit.decorator.TestDescriptionDecorator;
import com.smartbear.zephyrscale.junit.customformat.CustomFormatExecution;
import com.smartbear.zephyrscale.junit.customformat.CustomFormatContainer;
import com.smartbear.zephyrscale.junit.file.CustomFormatFile;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.smartbear.zephyrscale.junit.customformat.CustomFormatConstants.FAILED;
import static com.smartbear.zephyrscale.junit.customformat.CustomFormatConstants.PASSED;
import static com.smartbear.zephyrscale.junit.file.CustomFormatFile.generateCustomFormatFile;
        import static org.junit.Assert.*;

//import org.junit.jupiter.api.BeforeEach;

public class MyClassTest {
//    @Test
//    @TestCase(key = "TES-62")
//    void TES_62_testExceptionIsThrown() {
//        MyClass tester = new MyClass();
//        assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
//    }

    @Test
    @TestCase(key = "TES-62")
    public void testMultiply() {
        MyClass tester = new MyClass();
        assertEquals(50, tester.multiply(10, 5));
    }

    @Test
    @TestCase(key = "TES-60")
    public void checkIfGoogleWorks() throws Exception {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://google.com")).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        assertEquals(301,response.statusCode());
//        assertThat(response.statusCode()).isEqualTo(301);

    }
//     private CustomFormatExecution getResultByTestCaseKey(CustomFormatContainer customFormatContainer, String testCaseKey) {
//         return customFormatContainer.getExecutions()
//                 .stream()
//                 .filter(r -> r.getTestCase().getKey().equals(testCaseKey))
//                 .findFirst()
//                 .get();
//     }

 }