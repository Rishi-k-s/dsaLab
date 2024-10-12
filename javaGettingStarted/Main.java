
class UndaPori{
	public UndaPori(int a, int b){
		System.out.println("Hiii");
	}
}


class Main{


	public static void main( String[] args){
		String[][] arr2D = {
			{"Hiii", "Hello"},
			{"World", "Java"}
		};

		for(String[] rows: arr2D){
			for(String cols: rows){
				System.out.println(cols);
			}
		}
	}

	UndaPori up = new UndaPori(0, 0);
}	
