package nl.utwente.di;

public class Quoter {
	
	public double getBookPrice(String isbn){
		double output = 0.0;
		if(isbn.equals("1")){
			output=10.0;
		}
		else if(isbn.equals("2")){
			output=45.0;
		}
		else if(isbn.equals("3")){
			output=20.0;
		}
		else if(isbn.equals("4")){
			output=35.0;
		}
		else if(isbn.equals("5")){
			output=50.0;
		}
		return output;
	}

}
