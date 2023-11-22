package chap03.ex3;

public class LogicalOP {

	public static void main(String[] args) {
		//논리 연산자 : 결과값으로 True, False 를 리턴  <== 아주 중요
			// && (AND) : True && True => true
//						  True && false => false
//						  false && true => false
//						  false && false => false
		
		System.out.println(true && true ); //이거만 True 
		System.out.println(true && false );
		System.out.println(false && true );
		System.out.println(false && false );
		
		System.out.println("=====================================");
		// || (OR) :  True || True => true : 하나라도 True 면 True 
//					  True || false => true
//					  false || true => true
//					  false || false => false
		System.out.println(true || true );  
		System.out.println(true || false );
		System.out.println(false || true );
		System.out.println(false || false );
		
		System.out.println("=====================================");
		
		// ^ (XOR) :  True ^ True => false : 앞뒤가 다르면 True , 같으면 false
//		  			  True || false => true
//		  		 	  false || true => true
//		 			  false || false => false
		System.out.println(true ^ true );  
		System.out.println(true ^ false );
		System.out.println(false ^ true );
		System.out.println(false ^ false );
		
		System.out.println("=====================================");
		
		// ! (NOT) :  True 일 때 false , false 일 때 True

		System.out.println(!true);  
		System.out.println(!false );
		
		System.out.println("=====================================");
		
		//논리 연산자는 숏트 서킷이 발생될 수 있다. 쇼트 서킷을 방지하기 위해서 비트연산자를 사용해서 방지할 수 있다
			// 쇼트 서킷:  앞에 있는 인자(연산자)로 결과값을 유추 할 수 있는경우 뒤의 연산을 처리하지 않는 것
				// AND 연산에서 앞에 false 가 올 경우 쇼트서킷이 발생함
				// OR 연산에서 앞에 True 가 올 경우 쇼트서킷 발생함
		
	}

}
