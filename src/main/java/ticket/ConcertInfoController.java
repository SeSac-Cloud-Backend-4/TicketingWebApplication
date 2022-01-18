package ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ticket.entity.ConcertInfoEntity;
import ticket.service.ConcertInfoService;

import java.util.Date;

@Controller
public class ConcertInfoController {
    @Autowired
    ConcertInfoService concertInfoService;

    @GetMapping("/concertInfo")
    public String createConcertInfo() throws Exception{
        ConcertInfoEntity concertInfoEntity = new ConcertInfoEntity();
        concertInfoEntity.setName("name");
        concertInfoEntity.setDescription("Description");
        concertInfoEntity.setStart_date(new Date());

        concertInfoService.saveConcertInfo(concertInfoEntity);
        return "createConcertInfo";
    }
}
