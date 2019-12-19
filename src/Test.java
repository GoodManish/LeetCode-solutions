public class Test {

    public int maxNumberOfBalloons(String text) {
        int[] balloons = new int[5];
        for(char ch : text.toCharArray()){

            if(ch=='b'){
                balloons[0]+=2;
            } else if(ch=='a'){
                balloons[1]+=2;
            } else if(ch=='l'){
                balloons[2]++;
            } else if(ch=='o'){
                balloons[3]++;
            } else if(ch=='n'){
                balloons[4]+=2;
            }
        }

        int num=Integer.MAX_VALUE;
        for(int l : balloons) {
            num = Math.min(num, l/2);
        }
        return num;
    }

    public static void main(String[] args) {
        Test t = new Test();
//        System.out.println(t.maxNumberOfBalloons("nlaebolko"));
//        System.out.println(t.maxNumberOfBalloons("loonbalxballpoon"));
//        System.out.println(t.maxNumberOfBalloons("leetcode"));
        System.out.println(t.maxNumberOfBalloons("lloo"));
    }
}


