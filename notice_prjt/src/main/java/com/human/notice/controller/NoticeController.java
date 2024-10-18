package com.human.notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;

@Controller
public class NoticeController {

   @Autowired
    private NoticeService noticeServiceImpl;

    // GET request to show the list of notices
   @GetMapping("/")
   public String noticeList(Model model) {
	   System.out.println("controller");
	   // Fetch the list of notices from the service
       List<NoticeVO> notices = noticeServiceImpl.getNotices();
       model.addAttribute("notices", notices);
       // Return the view for the notice list page
       return "notice/notice_list";
   }
   
   //굴목록 조회 페이지
    @GetMapping("/list")
    public String noticeList2(Model model) {
        // Fetch the list of notices from the service
        List<NoticeVO> notices = noticeServiceImpl.getNotices();
        model.addAttribute("notices", notices);
        // Return the view for the notice list page
        return "notice/notice_list";
    }
    
    @GetMapping("/write")
    public String noticeWrite() {
    	
    	return "notice/notice_write";
    }

    //글등록 요청
    @PostMapping("/writeProcess")
    public String writeProcess(NoticeVO vo, HttpServletRequest request) {
        //업로드된 파일을 resources/uploads폴더에 저장하기 위해 필요한 request객체를 매개변수로 정의

        String viewName = "notice/notice_write";//공지사항 등록 실패시 뷰이름
        
        int result = noticeServiceImpl.insertNotice(vo);

        if(result == 1) {//공지사항 등록 성공
            viewName = "redirect:/list";//메인 페이지 재요청
        }

        return viewName;
    }
}
