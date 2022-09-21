
public class BooleanCheck {

	public static void main(String[] args) {
		boolean printFareDetails = true;
		boolean isPrintItinerary =true;
		boolean isADO = false;
		boolean showSummaryViewADOPrint = false;
		
		if(!printFareDetails && !(isPrintItinerary && isADO) || showSummaryViewADOPrint) {
			System.out.println("HELLEO");
		}

	}

}
