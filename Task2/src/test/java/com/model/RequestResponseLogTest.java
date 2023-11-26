package com.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDateTime;

public class RequestResponseLogTest {

    @Test
    void testIdGetterSetter() {
        Long id = 1L;
        RequestResponseLog log = new RequestResponseLog();
        log.setId(id);
        assertThat(log.getId()).isEqualTo(id);
    }

    @Test
    void testRequestDataGetterSetter() {
        String requestData = "Test Request Data";
        RequestResponseLog log = new RequestResponseLog();
        log.setRequestData(requestData);
        assertThat(log.getRequestData()).isEqualTo(requestData);
    }

    @Test
    void testResponseDataGetterSetter() {
        String responseData = "Test Response Data";
        RequestResponseLog log = new RequestResponseLog();
        log.setResponseData(responseData);
        assertThat(log.getResponseData()).isEqualTo(responseData);
    }

    @Test
    void testTimestampGetterSetter() {
        LocalDateTime timestamp = LocalDateTime.now();
        RequestResponseLog log = new RequestResponseLog();
        log.setTimestamp(timestamp);
        assertThat(log.getTimestamp()).isEqualTo(timestamp);
    }

    @Test
    void testNoArgsConstructor() {
        RequestResponseLog log = new RequestResponseLog();
        assertThat(log).isNotNull();
    }

    @Test
    void testAllArgsConstructor() {
        Long id = 1L;
        String requestData = "Test Request Data";
        String responseData = "Test Response Data";
        LocalDateTime timestamp = LocalDateTime.now();

        RequestResponseLog log = new RequestResponseLog(id, requestData, responseData, timestamp);

        assertThat(log.getId()).isEqualTo(id);
        assertThat(log.getRequestData()).isEqualTo(requestData);
        assertThat(log.getResponseData()).isEqualTo(responseData);
        assertThat(log.getTimestamp()).isEqualTo(timestamp);
    }
}
