package com.human.notice.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService {

@Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getNotices() {
        return noticeDAO.getNotices();
    }

	@Override
	public int insertNotice(NoticeVO vo) {
		return noticeDAO.insertNotice(vo);
	}


}
