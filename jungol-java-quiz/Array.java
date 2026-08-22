// 출처:https://jungol.co.kr/ Jol9074번,9063번,555번,9066번
//151번,556번,9076번,557번,9068번,558번,559번,9070번,560번,9071번 문제풀이

       // Jol 9074번 문제
import java.util.Arrays;
import java.util.Scanner;
        public class Array{
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
	
	    while(true) {
		int num =sc.nextInt();
		
		if(num < 1 || num > 10) {
			break;
		}
		arr[num]++;
	}
	for(int i=1;i<=10;i++) {
		if(arr[i]>0) {
			System.out.println(i+": "+arr[i]+"개");
		}
	}
        // Jol 9063번 문제
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	    //Jol 555번 문제
		Scanner sc = new Scanner(System.in);
		String [] ch = new String [10];
		for(int i=0;i<ch.length;i++) {
			ch[i] = sc.next();
		}
		for(int i =0;i<ch.length;i++)
		System.out.print(ch[i]);
		}
	}
	    //Jol 9066번 문제
        char [] ch = new char [26];
		char input='A';
		for(int i =0;i<ch.length;i++) {
			ch[i] = input;
		input++;
		}
			for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]+" ");
		}
	}
}
        // Jol 151번 문제
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i == 0 || i == 2 || i == 4) {
				sum += arr[i];				
			}
		}
		System.out.print(sum);
	}
}
        // Jol 151번 문제
        Scanner sc = new Scanner(System.in);
		int [ ] arr = new int [10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
}
        // Jol 9076번 문제
        Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i==2||i==4||i==9) {
				System.out.print(arr[i]+" ");
			}
		}
        // Jol 557번 문제풀이
		Scanner sc = new Scanner(System.in);
		String[] ch = new String[10];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next();
		}
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || i == 3 || i == 6) {
				System.out.print(ch[i]+" ");
			}
		}
       // Jol 9068번 문제풀이
       Scanner sc = new Scanner(System.in);
       int [] arr= new int[100];
       int count=0;
       for(int i =0;i<arr.length;i++) {
    	   arr[i]= sc.nextInt();
    	   if(arr[i]==0) {
    		  break;
    	   }
    	   count++;
    	   }
       for(int i=0;i<count;i++) {
    	   if(i%2==1) {
    		   System.out.print(arr[i]+" ");
		   }
	   }
       //Jol 558번 문제풀이
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = sc.nextInt();
		if(arr[i]==0) {
			break;
		}
		count++;
		}
		for(int i = count -1;i>=0;i--) {
			System.out.print(arr[i]+" ");
	}
}
        //Jol 559번문제
        Scanner sc = new Scanner(System.in);
		double [] scores = {85.6,79.5,83.1,80.0,78.2,75.0};
		int class1 = sc.nextInt();
		int class2 = sc.nextInt();
		double sum = scores[class1 -1]+scores[class2-1];
		System.out.printf("%.1f\n",sum);
   }
}
    //Jol 9070번 문제
	Scanner sc = new Scanner(System.in);
		int[] arry = new int[10];
		int max = 0;
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
			if (arry[i]>max) {
				max = arry[i];
			}
		}
		System.out.println(max);
	}
}

        //Jol 560번문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); //띄어쓰기기준으로 짤라냄
		int[] arry = new int[10];
		for (int i = 0; i < arry.length; i++) {
			arry[i] = Integer.parseInt(st.nextToken());
		}
		int min = arry[0];
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] >= 1000) {
				break;
			} else if (arry[i] < min) {
				min = arry[i];
			}
		}
		System.out.println(min);
    }
}
        //9071번 문제
        int [ ] arr = new int [10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%3!=1 && arr[i]<min) {
				min = arr[i];
			}else if(arr[i]%2==0&&arr[i]>=max) {
				max= arr[i];

			}
		}
		System.out.println(min+" "+max);

 //Jol 9071번 문제
Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int minOdd = Integer.MAX_VALUE;   
        int maxEven = Integer.MIN_VALUE;  
        
        for (int i = 0; i < 10; i++) {
            int num = numbers[i];
            
            if (num % 2 != 0) { 
                if (num < minOdd) {
                    minOdd = num;
                }
            } else { 
                if (num > maxEven) {
                    maxEven = num;
                }
            }
        }
        System.out.println(minOdd + " " + maxEven);
        sc.close();
    }
}

			   

 

