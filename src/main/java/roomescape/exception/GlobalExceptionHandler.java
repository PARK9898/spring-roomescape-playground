package roomescape.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ReservationNotFoundException.class)
    public ResponseEntity<String> handleNotFoundReservation() {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ReservationNotFoundException.RESERVATION_NOT_FOUND_MESSAGE);
    }
}
