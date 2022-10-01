public class Tugas1 {
    public static void main(String[] args) {
        try{
            int[] arr = new int[5];
            arr[5] = 25;
            System.out.println("Aman");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
