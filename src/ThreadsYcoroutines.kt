import java.time.Duration

// Duracion de tareas en minutos

const val  TIME_TO_COOK_IN_MINUTES: Int= 3
const val TIME_TO_EAT_IN_MINUTES: Int= 2

fun main (){
    doTask (TIME_TO_COOK_IN_MINUTES,"COCINANDO")
    doTask(TIME_TO_EAT_IN_MINUTES,"COMIENDO")

}

fun doTask(taskDuration: Int,task:String){
    // Haciendo la tarea durante el tiempo entregado como parámetro con taskDuration
    for(minutes in 0..taskDuration){
        var segundosTranscurridos = minutes*60
        println("$segundosTranscurridos segundos $task")
        threadRealTime()
    }
}

fun threadRealTime(){
    try {//60 segundos equivalentes a 1 minuto
        Thread.sleep(60 * 1000)
    }catch (ie: InterruptedException){
        ie.printStackTrace()

    }
}