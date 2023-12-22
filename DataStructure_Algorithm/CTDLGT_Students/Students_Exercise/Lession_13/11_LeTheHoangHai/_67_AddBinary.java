public class _67_AddBinary {
    public String addBinary(String a, String b) {
        Integer binary1 = Integer.parseInt(a, 2);
        Integer binary2 = Integer.parseInt(b, 2);

        Integer sum = binary1 + binary2;

        return Integer.toBinaryString(sum);
    }
}
