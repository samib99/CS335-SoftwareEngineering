
/*
 * Test different brands of plugs.
 */
public final class TestPlugs{

	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}


	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		//UKPlugConnector plug1 = new Furutech();
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
		//socket.plugIn(plug1);
	}

	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testUKToGermanAdapter(){
		
		UKPlugConnector plug = new Furutech();
		
		GermanElectricalSocket socket = new GermanElectricalSocket();
		
		GermanPlugConnector germAdapter = new UKToGermanPlugConnectorAdapter(plug);
		 	
		socket.plugIn(germAdapter);
		
		
		
	}
}