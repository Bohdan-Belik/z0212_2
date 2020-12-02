public class RzymArab {
    private static String[] liczby =
            { "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M" };
    private static int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public static int rzym2arab (String rzym) throws RzymArabException {
        // MMCDX - example
        int p = nums.length-1;
        int sum = 0;
        while (!rzym.isEmpty()) {
            while (rzym.startsWith(liczby[p])) {
                sum += nums[p];
                rzym = rzym.substring(liczby[p].length());
            }
            p--;
            if (p<0) throw new RzymArabException(rzym + " can not be converted to arab");
        }
        return sum;
    }
    public static String arab2rzym (int arab) throws RzymArabException {
        if (arab<1 || arab>3999) {
            throw new RzymArabException(arab + " can not be converted to rzym");
        } else {
            StringBuilder result = new StringBuilder();
            int p = nums.length-1;
            while (arab>0) {
                while (arab>=nums[p]) {
                    arab -= nums[p];
                    result.append(liczby[p]);
                }
                p--;
            }
            return result.toString();
        }
    }
}
