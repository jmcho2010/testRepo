package com.board.pra;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.pra.question.Question;
import com.board.pra.question.QuestionRepository;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void contextLoads() {
		
		Question q = new Question();
		q.setSubject("테스트중입니다");
		q.setContent("고된 하루를 마치고 테스트중");
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);
		
		Question q2 = new Question();
		q2.setSubject("오늘은 사고가 많았네요");
		q2.setContent("아 사고침 ㅋㅋㅋㅋㅋㅋ");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

}
