

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.nextLine();
            String[] s = str.split("-");
            int year = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            int twoMonth = 28;
            if((year%4==0 && year%100!=0) || (year%400==0)){
                twoMonth = 29;
            }
            int day = 0;
            int[] months = {31,twoMonth,31,30,31,30,31,31,30,31,30,31};
            for(int i=0; i<months.length; i++){
                if(month >= i+1){
                    if(month == i+1){
                        day += Integer.parseInt(s[2]);
                        break;
                    }else{
                        day += months[i];
                    }
                }
            }
            System.out.println(day);
        }
    }