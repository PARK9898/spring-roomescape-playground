package roomescape.service;

import java.util.List;
import org.springframework.stereotype.Service;
import roomescape.domain.Reservation;
import roomescape.dto.reservation.ReservationRequest;
import roomescape.repository.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Long saveReservation(ReservationRequest reservationRequest) {
        Reservation reservation = new Reservation(null,
                reservationRequest.getName(),
                reservationRequest.getDate(),
                reservationRequest.getTime());
        return reservationRepository.saveReservation(reservation);
    }

    public Reservation findReservationById(Long id) {
        return reservationRepository.findReservationById(id);
    }

    public List<Reservation> findAllReservation() {
        return reservationRepository.findAllReservation();
    }
}