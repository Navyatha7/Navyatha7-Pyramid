public class Pyramid {
    /**
     * Return a string that is a pyramid of size n, made of asterisks and no spaces.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            // Append i asterisks for the current row
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            // Append newline if not the last line
            if (i != n) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
