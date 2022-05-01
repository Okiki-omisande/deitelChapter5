public class triangles {
    public static void main(String[] args) {

        //increasing triangle
        int n = 10;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        //decreasing triangle
        for (int i = 1; i <= n; ++i) {
            for (int j = i; j <= n; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        //increasing space decreasing triangle
        for (int i = 1; i <= n; ++i) {

            for (int j = 1; j <= i; ++j) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //decreasing space and increasing triangle

        for (int i = 1; i <= n; ++i) {

            for (int j = i; j <= n; ++j) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //full triangle
        for (int i=1; i<=n;++i){
            for (int j=i; j<=n; ++j){
                System.out.print("  ");
            }
            for (int j =1; j<=i;++j){
                System.out.print("* ");
            }
            for (int j=1; j<i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //upside down
        for (int i =1; i<=n; ++i){

            for (int s=1; s<=i; ++s){
                System.out.print("  ");
            }
            for (int t=i; t <= n; ++t){
                System.out.print("* ");
            }

            for (int t=i; t<n; ++t){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=1; i<n;++i){
            for (int j=i; j<=n; ++j){
                System.out.print("  ");
            }
            for (int j =1; j<=i;++j){
                System.out.print("* ");
            }
            for (int j=1; j<i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        //upside down
        for (int i =1; i<=n; ++i){

            for (int s=1; s<=i; ++s){
                System.out.print("  ");
            }
            for (int t=i; t <= n; ++t){
                System.out.print("* ");
            }

            for (int t=i; t<n; ++t){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
