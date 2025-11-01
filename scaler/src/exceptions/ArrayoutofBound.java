package exceptions;

public class ArrayoutofBound {
    public static int accessArrayElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        //code here
        try {
            if(array.length > 0 && index < array.length){
                return array[index];
            }
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("invaid exception");
        }
        return -1;
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayoutofBound obj = new ArrayoutofBound();
        try {
            int res = obj.accessArrayElement(new int[]{1,2,3,4,5}, -2);
            System.out.println(res);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
