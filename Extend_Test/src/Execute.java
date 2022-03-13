
public class Execute {

	public static void main(String[] args) {
		Extend_Origin eo = new Extend_Origin();
		eo.one = "eo.one";
		String result = eo.first("ABC");
		
		Origin o = new Origin();
		String result2 = o.first("ABC");
		
		
		Origin eo2 = new Extend_Origin();
		eo2.one = "eo2.one";
		String result3 = eo.first("ABC");
		
		System.out.println(result + "///" + result2 + "///" + result3);
	}

}
