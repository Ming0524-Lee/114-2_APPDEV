public class Q2_Fish {
    String name;
    double weight;
    public void displayInfo() {
        System.out.println("這隻魚的名字是：" + name + "，重量是：" + weight + "公斤");
    }
    public static void main(String[] args) {
        Q2_Fish myFish = new Q2_Fish();
        myFish.name = "黑鮪魚";
        myFish.weight = 250.5;
        myFish.displayInfo();
    }
public class Q2_fish{
    String name;
    double weight;

    public void displayinf(){
         System.out.println("This fish's name is:" + name + "Weight: "+ wieght +"KG");
    }

    public static void main(String [] args){
        Q2_fish myfish = new Q2_fish();
        myfish.name = "Black fish";
        myfish.weight =250.5;

        myfish.displayinf();

    }

}