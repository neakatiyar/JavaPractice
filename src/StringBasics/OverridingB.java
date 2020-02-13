package StringBasics;

class OverridingB {
}
class  Q extends OverridingB{

}
 class R extends Q{


}
class S{
     Q test(){
         System.out.println("q test");
         return null;
     }
     R test(int i ){
         return null;
     }
}
class T extends S{
     R test(){
         System.out.println("r test");
         return null;
     }
}
