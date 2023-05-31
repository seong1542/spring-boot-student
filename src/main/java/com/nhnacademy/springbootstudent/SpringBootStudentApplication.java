package com.nhnacademy.springbootstudent;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootStudentApplication {

	//스프링부트 어플리케이션 어노테이션 : 구현 내용을 보면, 메타 어노테이션(본인도 어노테이션인데, 다른 어노테이션을 업고 있다.)
	//EnableAutoConfiguration : 자동설정기능을 활성화해준다. 클래스패스에 라이브러리가 존재하면 자동으로 빈을 설정한다.
	//ComponentScan : 해당되는 클래스부터 하위에 있는 모든 클래스들에서 컴포넌트를 스캔함
	//SpringBootConfiguration : 메타 어노테이션인데, 자바 컨피그처럼 @Bean 해서 빈들을 등록할 수 있다.
	public static void main(String[] args) {
//		SpringApplication.run(SpringBootStudentApplication.class, args); // 스프링 부트가 시작하는 코드
		// 스프링부트어플리케이션 어노테이션이 붙여진 클래스의 이름.class

		SpringApplication application = new SpringApplication(SpringBootStudentApplication.class);
		application.setBannerMode(Banner.Mode.OFF); // 배너 모드 끌수있고
		application.setBanner((environment, sourceClass, out) -> {
			System.out.println("=================================");
			System.out.println("banner");
			System.out.println("==================================");
		});
		application.run(args);
	}


}
