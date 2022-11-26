package com.board.pra;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	//projm2786@gmail.com
	@RequestMapping("/hello")
	@ResponseBody
	public String sayhi() {
		// 리턴 문자를 수정했지만 페이지상의 내용은 변경되지 않았음
		//  - 로컬 was가 변경된 클래스를 리로딩 하지 않았음.
		return "아오 아직도 잠이 안깬다 ㅋㅋㅋㅋ";
	}
	// 롬복
	// 자바 클래스에 getter, setter, 생성자 등을 자동으로 만들어주는 도구.
	// 깔끔한 소스코드를 만들수 있다.
	
	// 프로젝트명 + Application 파일
	// 스프링부트의 시작을 담당하는 파일.
	// @SpringBootApplication : 스프링부트의 설정을 관리하는 어노테이션
	
	// 데이터베이스를 이용하려면?
	// 쿼리를 통해 원하는 데이터들을 조회하거나 삭제할수 있었음.
	// ORM을 통해 자바 문법으로 데이터베이스를 다룰수 있다.
	
	//  JPA(Java Persistence API) / 인터페이스
	// 자바 ORM 기술 표준
	
	// 제목이 subject고 내용 컬럼이 content라 가정했을때 쿼리를이용해서
	// 데이터를 추가하려면?
	//insert into question(subject, content) values('1', '2')
	//	Question q1 = new Question()
	//	q1.setSubject('1');
	//	this.questionRepository.save(q1)
	
	// 리파지토리
	// 엔티티만으로 DB에 데이터를 저장하거나 조회하는것은 불가능.
	// 데이터 처리를 위해서 실제 DB와 연동하는 JPA 리파지토리가 필요하다.
	
	// 엔티티에 의해 생성된 DB 테이블에 접근하는 메서드들을 사용하기 위한 인터페이스
	// CRUD처리를 위해 어떤식으로 처리할지 정의하는 계층
	
	// Junit
	// Java에서 독립된 단위테스트를 지원해주는 프레임워크

	// @Test
	// 테스트 수행 메서드.
	
	// @Before 
	// Test 어노테이션 메소드 실행전 반드시 실행되는 메서드
	
	// @After
	// Test 어노테이션 메소드 실행후 반드시 실행하는 메서드.
	
	// @Ignore 
	// 테스트 skip
	
	// URL Prefix
	// 공통된 url에서 일부분은 해당 컨트롤러등에서 바로 적용할수 있도록
	// 설정하는 URL매핑규칙.
	
	
	
	
}
