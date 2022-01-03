package poly.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import poly.dto.ChatDTO;
import poly.service.IChatService;
import poly.util.CmmUtil;
import poly.util.DateUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Controller 선언해야만 Spring 프레임 워크에서 Controoler 인지 인식가능
//자바서블릿 역할 수행

@Controller
public class ChatController {
    private final Logger log = Logger.getLogger(this.getClass());


    /*비즈니스 로직(중요 로직을 수행하기 위해 사용되 서비스를 메모리에적재(싱글톤패턴적용됨)
     */
    @Resource(name = "ChatService")
    private IChatService chatService;

    @RequestMapping(value = "chat.do")
    public String chat( HttpSession session, ModelMap model ) throws Exception {
        log.info(this.getClass().getName() + ". sendStart");
        String user_email = CmmUtil.nvl((String) session.getAttribute("SS_USER_EMAIL"));

        if (user_email.equals("")) {
            model.addAttribute("msg", "로그인이 필요합니다.");
            model.addAttribute("url", "/loginPage.do");
            return "/redirect";
        }

        String userNm = CmmUtil.nvl((String)session.getAttribute("SS_USER_NAME"));

        log.info("userNm :" + userNm);


        //세션에 값 저장하기
        session.setAttribute("SS_ROOM_NAME","단체채팅방");
        session.setAttribute("SS_USER_NAME",userNm);



        log.info(this.getClass().getName() + ". sendend");
        return "/chat/chat";
    }

    /*채팅방입장 */

    @RequestMapping(value ="chat/intro")
    public String intro(HttpServletRequest request, HttpServletResponse response, HttpSession session)
        throws Exception{

        log.info(this.getClass().getName()+".intro Start!");

        //기존 세션에 저장된값 삭제하기
      //  session.setAttribute("SS_ROOM_NAME","");
      //  session.setAttribute("SS_USER_NAME","");

       // String room_name = CmmUtil.nvl(request.getParameter("room_name"));
        String userNm = CmmUtil.nvl((String)session.getAttribute("SS_USER_NAME"));

        log.info("userNm :" + userNm);


        //세션에 값 저장하기
        session.setAttribute("SS_ROOM_NAME","단체채팅방");
        session.setAttribute("SS_USER_NAME",userNm);

//        //입장 환영 멘트 저장하기
//        ChatDTO pDTO = new ChatDTO();
//
//        pDTO.setRoomKey("CHat_" + "단체채팅방");
//        pDTO.setUserNm("관리자.");
//        pDTO.setMsg(userNm+"님 입장을 환영합니다.");
//        pDTO.setDateTime(DateUtil.getDateTime("yyyy.MM.dd hh:mm:ss"));
//
//        //채팅 멘트 저장하기
//        chatService.insertChat(pDTO);
//        log.info(this.getClass().getName()+ ".intro END!");

        return "/chat/chat";

    }

    /**
     * 채팅방 전체 리스트가져오기
     */
    @RequestMapping(value = "chat/roomList")
    @ResponseBody
    public Set<String> roomList(HttpServletRequest request, HttpServletResponse response) throws Exception {

        log.info(this.getClass().getName() + ".roomList Start!");

        Set<String> rSet = chatService.getRoomList();

        if (rSet == null) {
            rSet = new LinkedHashSet<String>();

        }

        log.info(this.getClass().getName() + ".roomList End!");

        return rSet;
    }

    /**
     * 대화 저장
     */
    @RequestMapping(value = "chat/msg")
    @ResponseBody
    public List<ChatDTO> msg(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws Exception {

        log.info(this.getClass().getName() + ".msg Start!");

       // String room_name = CmmUtil.nvl((String) session.getAttribute("SS_ROOM_NAME"));
        String userNm = CmmUtil.nvl((String) session.getAttribute("SS_USER_NAME"));

        String msg = CmmUtil.nvl(request.getParameter("send_msg"));

        log.info("userNm : " + userNm);
        log.info("room_name : " + "단체채팅방");
        log.info("msg : " + msg);

        List<ChatDTO> rList = null;

        // 메시지가 존재하는 경우에만 대화가져오기
        if (msg.length() > 0) {
            ChatDTO pDTO = new ChatDTO();

            pDTO.setRoomKey("Chat_" + "단체채팅방");
            pDTO.setUserNm(userNm);
            pDTO.setMsg(msg);
            pDTO.setDateTime(DateUtil.getDateTime("yyyy.MM.dd hh:mm:ss"));

            rList = chatService.insertChat(pDTO);

            if (rList == null) {
                rList = new LinkedList<ChatDTO>();

            }

            pDTO = null;

        }

        log.info(this.getClass().getName() + ".msg End!");

        return rList;
    }

    /**
     * 음성대화 가져오기
     */
    @RequestMapping(value = "chat/getMsg")
    @ResponseBody
    public List<ChatDTO> getMsg(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws Exception {

        log.info(this.getClass().getName() + ".getMsg Start!");

      //  String room_name = CmmUtil.nvl((String) session.getAttribute("SS_ROOM_NAME"));

        log.info("room_name : " + "단체채팅방");

        ChatDTO pDTO = new ChatDTO();

        pDTO.setRoomKey("Chat_" + "단체채팅방");

        List<ChatDTO> rList = chatService.getChat(pDTO);

        if (rList == null) {
            rList = new LinkedList<ChatDTO>();

        }

        pDTO = null;

        log.info(this.getClass().getName() + ".getMsg End!");

        return rList;
    }


}
