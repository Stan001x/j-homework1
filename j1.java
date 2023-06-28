import java.util.Random;

public class j1 {
    public static void main(String[] args) {
        
int i = new Random().nextInt(2000);
System.out.println(i);


int n = Integer.toBinaryString(i).length();
System.out.println(n);

System.out.println(Short.MAX_VALUE);


int[] m1 = {1};

for (int j = i; j<=Short.MAX_VALUE; j++){
if (j % n == 0) {
    
    int[] mtmp = new int[m1.length +1];
    for (int k = 0; k<m1.length; k++){
        mtmp[k] = m1[k];
        
        
    }
    mtmp[m1.length] = j;
    m1 = mtmp;
} 
}
System.out.println(m1);



int[] m2 = {1};

for (int j = Short.MIN_VALUE; j<=i; j++){
if (j % n != 0) {
    
    int[] mtmp = new int[m2.length +1];
    for (int k = 0; k<m2.length; k++){
        mtmp[k] = m2[k];
        
        
    }
    mtmp[m2.length] = j;
    m2 = mtmp;
} 
}
System.out.println(m2);


    }
}





