package view;

public class View {
	
	private static final char[][][] tabMap = null;
	int found=0;
			{
    for(int i = 0; i < 25; i++) 
    {
        for(int j =0; j < 25; j++) {

            char[][] tabMap = null;
			if(tabMap[i][j]=='P' && found==0) {
                if(tabMap[i][j+1]=='W') {
                    found=1;
                    break;
                }
                tabMap[i][j] = 'V';
                tabMap[i][j+1] = 'P';
                found=1;
                break;
            }
        }
    }
    for(int i = 0; i < 25; i++) {
        for(int j =0; j < 25; j++) {
            System.out.print(tabMap[i][j]);
        }
        System.out.println("");
    }
    System.out.println("");

}
}