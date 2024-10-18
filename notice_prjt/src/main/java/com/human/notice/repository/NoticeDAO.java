package com.human.notice.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.notice.vo.NoticeVO;

@Repository
public class NoticeDAO {
	
	//lombok API를 이용한 의존 자동주입: 생성자 방식
		@Autowired
		private SqlSession sqlSession;
		
		
		
		//MyBatis의 Mapper를 이용하기 위해 사용되는 상수 정의
		public static final String MAPPER = "com.human.notice.mapper.NoticeMapper";


		//글목록 조회
		public List<NoticeVO> getNotices() {
			
			return sqlSession.selectList(MAPPER+".getNotice");
		}


		//글 작성
		public int insertNotice(NoticeVO vo) {
		
			return sqlSession.insert(MAPPER+".insertNotice",vo);
		}






		
		
}
