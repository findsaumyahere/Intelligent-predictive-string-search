
public class IntelligentPredictiveStringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hay = new String ("John Is Jolley");
		char[] haysack = hay.toCharArray();
		
		String need = new String( "Jolley");
		char[] needle = need.toCharArray();
		
		int m = needle.length;
		
		for( int i = 0; i < haysack.length; ) {
			int j = 0;
			if( haysack[i] != needle[j] ){
				
				if( haysack[i] == ' ' ){
					i++; 
					continue;
					
				} else {
					i += 2;
					continue;
				}
			} else {
				if( haysack[i+m -1] == needle[m-1] ){
					for( int k = m-1; k > -1; k-- ) {
						if( haysack[i+k] != needle[k] ){
							break;
						}
						
						System.out.println( need + " Found at " + i );
						return;
					}
				} else {
					if( haysack[i] == ' ' ){
						i+= m; continue;
					} else {
						if( haysack[i+m+1] == ' '){
							i += ( m - 1 ) + 2;
							continue;
						} else {
							i += 2;
							continue;
						}
					}
				}
			}
		}

	}

}
