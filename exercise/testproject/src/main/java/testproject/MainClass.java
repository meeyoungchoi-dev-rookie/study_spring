package testproject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		// spring 컨테이너에 접근하기 위한 방법
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// spring 컨테이너에서 빈을 가져온다
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		// 리소스 반환
		ctx.close();
	}
}
