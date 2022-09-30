public class Main {

    public static void main (String[] args) {
    //square
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" 4 ");
            }
            System.out.println();
        }
    // vertical hill pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    // two triangles
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j<=n; j++){
                System.out.print("   ");
            }
            for (int j= 1; j<=i; j++){
                System.out.print(" * ");
            }
          System.out.println();

        }
    // hill pattern
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<i; j++){
                System.out.print("* ");
            }

            for (int j = i; j <=n; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<i; j++){
                System.out.print("* ");
            }

            for (int j = i; j <=n; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j = 1; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    //tree pattern
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = i; j <= m; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("A ");
            }
            for (int j = i; j <= m; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = i; j <= m; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("A ");
            }
            for (int j = i; j <= m; j++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }

    }}
