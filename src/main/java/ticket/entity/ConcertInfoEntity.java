package ticket.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "concertInfo")
@NoArgsConstructor
@Data
public class ConcertInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date start_date;

//    @Column(nullable = false)
//    private List<Seat> seatList;

    @Column(nullable = false)
    private String description;
}
