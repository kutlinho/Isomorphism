import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("İlk Grafın boyutunu giriniz: ");
        int size=s.nextInt();
        Graph a = new Graph(size);
        int pos=-2; // These values are assigned randomly
        int pos1=-2;
        for(int i=1;true;i++){
            System.out.println("1.graf "+i+". düğüm "+"İlk koordinat(-1 çıkış): ");
            pos=s.nextInt();
            if(pos==-1){// Same values check exit condition
                break;
            }
            System.out.println("1.graf "+i+". düğüm "+"İkinci koordinat(-1 çıkış): ");
            pos1=s.nextInt();
            if(pos1 ==-1){
                break;
            }
            a.addEdge(pos,pos1);
        }



        System.out.println("2. Grafın boyutunu giriniz: ");
        int size2=s.nextInt();
        Graph b = new Graph(size);
        int pos2=-2;
        int pos3=-2;
        for(int i=1;true;i++){
            System.out.println("2.graf "+i+". düğüm "+"İlk koordinat(-1 çıkış): ");
            pos2=s.nextInt();
            if(pos2==-1){
                break;
            }
            System.out.println("2.graf "+i+". düğüm "+"İkinci koordinat(-1 çıkış): ");
            pos3=s.nextInt();
            if(pos3 ==-1){
                break;
            }
            b.addEdge(pos2,pos3);
        }
        Operations op = new Operations();
        System.out.print("Degree array of the matrice is: ");
        for (int i = 0; i < b.getVerticeNumber(); i++) {
            System.out.print(op.findDegrees(b)[i] + "-");
        }
        System.out.println("\nGrafların izomorfik olma durumu: "+op.checkIsomorphism(a,b));
    }
}
