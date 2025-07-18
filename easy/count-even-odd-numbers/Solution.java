int d[]=new int[2];
        d[0]=5;
        d[1]=2;
        int even=0;
        int odd=0;
        for( int i=0;i<d.length;i++){
          
            if(d[i]%2==0){
                even=even+1;
            }
             else{
                odd=odd+1;
            }                                          
        }
        System.out.println(even);
       System.out.println(odd);
