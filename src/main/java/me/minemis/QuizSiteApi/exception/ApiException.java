package me.minemis.QuizSiteApi.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@RequiredArgsConstructor
@Getter
class ApiException {
    private final String message;
    private final HttpStatus status;
    private final ZonedDateTime time;
}
