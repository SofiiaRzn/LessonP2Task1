package yahoo.sofiia.riazanova;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat firstCat = new Cat("Jack",  "male", "Scotish", 5, 4.2);
		Cat secondCat = new Cat("Elle", "female", "Scotish", 4, 6.2);
		firstCat.checkWeight(firstCat);
		secondCat.checkWeight(secondCat);
		firstCat.breedingCat(firstCat, secondCat);
		

	}

}
