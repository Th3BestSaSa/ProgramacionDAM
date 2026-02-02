

public class IntercalarDosCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcdfgh";
		String b="123";
		int maximo=Math.max(a.length(), b.length());
		StringBuilder sb= new StringBuilder();
		
			for (int i = 0; i < maximo; i++) {
				if (i<a.length()) {
					sb.append(a.charAt(i));
					//sb.insert(i, b.charAt(j));
				}
				if (i<b.length()) {
					sb.append(b.charAt(i));
				}
				
			}System.out.println(sb.toString());
		}
		
	}
