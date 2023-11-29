package leb.chap06;

public class Product {
		//1. 필드
	private long idk ; // 번호
	private String ProName;
	private int qty; // 제품 갯수
	private int year; // 생산년도
	private String proColor; //제품 색상
	
	//2. 기본생성자
		Product() {}

	// 3. getter , Setter 
		public long getIdk() {
			return idk;
		}

		public void setIdk(long idk) {
			this.idk = idk;
		}

		public String getProName() {
			return ProName;
		}

		public void setProName(String proName) {
			ProName = proName;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getProColor() {
			return proColor;
		}

		public void setProColor(String proColor) {
			this.proColor = proColor;
		}

		// 4. toString ()  메소드 오버라이딩 : 객체 자체를 출력시 필드의 값을 출력
		@Override
		public String toString() {
			return "Product [idk=" + idk + ", ProName=" + ProName + ", qty=" + qty + ", year=" + year + ", proColor="
					+ proColor + "]";
		} 
		
		
		
		
		
		
}
