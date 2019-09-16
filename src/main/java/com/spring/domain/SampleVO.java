package com.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //비어있는 생성자를 만들기 위한 속성
@AllArgsConstructor
public class SampleVO {
	
	private Integer mno;
	private String firstName;
	private String lastName;
	
}
