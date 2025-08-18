package javacore.introducao.dominio.Treino.Ex01;

public non-sealed class USClock extends Clock {

    private String periodIndicador;

    public String getPeriodIndicador() {
        return periodIndicador;
    }

    public void setAfterMidDay() {
        this.periodIndicador = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicador = "AM";
    }


    public void setHour(int hour) {
        setBeforeMidDay();

        if ((hour > 12) && (hour <= 23)) {
            this.periodIndicador = "PM";
            setAfterMidDay();
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    Clock convert(Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicador = usClock.getPeriodIndicador()
            }
            case BRLClock brlClock -> {
                this.setHour(brlClock.getHour());
            }
        }
        return this;

    }
}
