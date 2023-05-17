package sheridan.tetervak.mydice.model

class Dice(val initValue: Int = DEFAULT_INIT_VALUE){

    companion object{
        const val DEFAULT_INIT_VALUE: Int = 1
    }

    var value: Int = DEFAULT_INIT_VALUE
        set(i){
            if(i in (1 .. 6)){
                field = i;
            } else {
                throw IllegalArgumentException("Illegal die value $i")
            }
        }

    init{
        value = initValue
    }

    fun roll(){
        value = (1..6).random()
    }

    fun reset(){
        value = initValue;
    }

}
