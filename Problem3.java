import java.io.*;
import java.util.Arrays;
public class Problem3{
	public static void change2DArrToStr(char arr[][],String str){
		int l=str.length()-rowCount(str)-1;
		char a[]=new char[l];
		int i=0,j=0;
		for(int p=0;p<l;p++){
			if((arr[j][i]!='*')&&(arr[j][i]!='&')){
				a[p]=arr[j][i];
				i++;
			}
			if(arr[j][i]=='*'){
				p++;
				if(p==l){
					break;
				}
				a[p]=' ';
				j++;
				i=0;
			}
		}
		System.out.printf("\n");
		String org=Arrays.toString(a);
		System.out.println("The original string is- "+org);
		//convert array a to string and return string
	}
	public static int rowCount(String str){
		int row=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='$'){
				row++;
			}
		}
		//System.out.println("The number of rows is "+ row);
		return row;
	}
	public static int colCount(String str){
		int col=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='*'){
				col++;
			}
		}
		col++;
		//System.out.println("The number of columns is "+ col);
		return col;
	}
	public static void print2DArray(char arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf(arr[j][i]+"");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
	public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string to be decoded.");
        String tmp=br.readLine();
        System.out.println("The string you have entered is- "+tmp);
        int row=rowCount(tmp);
        int col=colCount(tmp);
        char array[][]=new char[col][row];
        int flag[]=new int[col];													//declare a flag for each column
        for(int j=0;j<col;j++){
        	flag[j]=0;
        }																			//initialize the flag for all columns to 0
        int length=tmp.length();
        char c[]= new char[length];
        tmp.getChars(0,length,c,0);
        int i=0,j=0;
        for(int p=0;p<length;p++){													//BID$OSE$N*A$DD$**$
        	if(flag[j]==0){
        		if((c[p]!='*')&&(c[p]!='$')){
        			array[j][i]=c[p];
        			j++;
        		}
        		else if(c[p]=='$'){
        			array[j][i]=c[p];
        			i++;
        			j=0;
        		}
        		else if(c[p]=='*'){
        			array[j][i]=c[p];
        			flag[j]=1;
        			j++;
        		}
        	}
        	else if(flag[j]==1){
        		array[j][i]=' ';
        		j++;
        		p--;
        	}
        }																			//putting values into the 2D array
        print2DArray(array,row,col);
        change2DArrToStr(array,tmp);
	}
}