import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String orijinalMetin = "  asada    bvbf  dd";
		String duzeltilmisMetin = StringUtils.deleteWhitespace(orijinalMetin);
		System.out.println("\"" + orijinalMetin + "\" -> \"" + duzeltilmisMetin + "\"");

	}

}
