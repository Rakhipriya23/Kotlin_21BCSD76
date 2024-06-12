fun main(){
    var num= 153
    var digit=0
    var arm=0
    var temp=num
    while(temp>0){
        digit=temp%10
        arm=arm+(digit*digit*digit)
        temp=temp/10
    }
    if(arm==num) println("$num is an Armstrong number")
    else println("$num is not an armstrong number")
}