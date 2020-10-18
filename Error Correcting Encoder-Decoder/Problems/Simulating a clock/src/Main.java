class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (++this.minutes == 60) {
            if (++this.hours == 13) {
                this.hours = 1;
            }
            this.minutes = 0;
        }
    }
}
