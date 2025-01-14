class Gcd {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long lcm (long a, long b) {
        return a / gcd(a, b) * b;
    }
}
