package ticket.controller.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ticket.dto.ShowInfoResponseDto;
import ticket.service.ShowAndSeatService;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/test")
public class TestController {
    private final ShowAndSeatService showAndSeatService;

    @GetMapping("/show")
    public String showInfo(Model model){
        System.out.println("TestController.showInfo");
//        List<ShowInfoResponseDto> shows = showAndSeatService.findAllShowInfo();
//        model.addAttribute("shows",shows);
        return "test/show";
    }

}
