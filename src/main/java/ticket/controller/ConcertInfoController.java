package ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ticket.entity.ConcertInfoEntity;
import ticket.service.ConcertInfoService;

@Controller
public class ConcertInfoController {
    @Autowired
    ConcertInfoService concertInfoService;

    @GetMapping("/concertInfo")
    public String createConcertInfo(@RequestParam String name) throws Exception{
        ConcertInfoEntity concertInfoEntity = new ConcertInfoEntity();
        concertInfoEntity.setName(name);
        concertInfoService.saveConcertInfo(concertInfoEntity);
        return "createConcertInfo";
    }
}
