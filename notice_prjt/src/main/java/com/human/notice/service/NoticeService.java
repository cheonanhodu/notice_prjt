package com.human.notice.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.human.notice.vo.NoticeVO;


public interface NoticeService {
    List<NoticeVO> getNotices();
	int insertNotice(NoticeVO vo);
}
