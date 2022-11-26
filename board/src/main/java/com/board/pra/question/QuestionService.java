package com.board.pra.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.board.pra.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {
	private final QuestionRepository questionRepository;
	
	public List<Question> getList(){
		return this.questionRepository.findAll();
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> question = this.questionRepository.findById(id);
		if(question.isPresent()) {//isPresent : 해당데이터 있는지 없는지 검사.
			return question.get();
		}else {
			throw new DataNotFoundException("question not found");
		}
		
	}
	
	
	
	
	
	
}





