package javacore.introducao.dominio.Treino.Ex01;

public non-sealed class BRLClock extends Clock{


    @Override
    public Clock convert(Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){

            case USClock usClock ->{
                this.second = usClock.getSecond();
                this.minute = usClock.getMinute();
                this.hour = (usClock.getPeriodIndicador().equals("PM")) ?
                        usClock.getHour() + 12 :
                        usClock.getHour();
            }
            case BRLClock brlClock -> {
                this.hour = brlClock.getHour();
            }
        }
        return this;
    }
}
