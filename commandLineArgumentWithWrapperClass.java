public class commandLineArgumentWithWrapperClass {
    public static void main(String[] args){
        int multiple = 1;
        for(int i = 1; i < args.length; i++){
        multiple = multiple * Integer.parseInt(args[i]);
        }
        System.out.println(multiple);
    }
}
