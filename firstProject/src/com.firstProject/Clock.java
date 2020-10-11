class Clock {

    int hours = 12;
    int minutes = 0;

    public void next() {
        if(++this.minutes == 60) {
            ++this.hours;
            this.minutes = 0;
        }
    }
}
