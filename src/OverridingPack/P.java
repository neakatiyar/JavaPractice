package OverridingPack;

class P {
}
class Q extends P{
}
class R extends Q{}
class S{
    Q test(){
        return null;
    }
}
class T extends S{
    R test(){
        return null;
    }
}