public static void main(String[] args) {
    zippo("rattle", 13); // 1 first 
}
public static void baffle(String blimp) {
    System.out.println(blimp); //fifth 
    zippo("ping", -5); //sixth  
}
public static void zippo(String quince, int flag) {
    if (flag < 0) { // 2 second  //seventh 
        System.out.println(quince + " zoop"); //eigth 
    } else {
        System.out.println("ik"); //third
        baffle(quince); //fourth 
        System.out.println("boo-wa-ha-ha"); //ninth
    }
}

// 3:  What is the value of the parameter blimp when baffle gets invoked? 
// --> "rattle"

//Question 4: What is the output of this program?
//--> First ik then rattle then ping zoop then boo-wa-ha-ha.

