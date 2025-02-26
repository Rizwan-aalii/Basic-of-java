public class typeconver {
    public static void main (String args []){
        // Type Casting  
        // down casting narow casting manual 
        // we lost data
        long val = 111000580l;
        int val1 = (int) val;
        short val2 = (short) val1 ;
        byte val3 = (byte) val2 ;
        System.out.println(val3);
        

        // Type Casting  
        // up casting  casting autometc 
        // we lost data

        byte  data = 45 ;
        Short sdata = (short) data ;
        int idata = sdata;
        long ldata = idata;
        float fdata = ldata;
        double ddata = fdata;
        System.out.println(ddata);

    

    }
}
