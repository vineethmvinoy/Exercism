class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int distanceDriven;
    public int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
        this.distanceDriven=0;
        this.battery=100;
    }

    public boolean batteryDrained() {
        if(battery==0)
        return true;
        return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(battery>0)
        {
            distanceDriven+=speed;
            battery-=batteryDrain;
        }    
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed temp=new NeedForSpeed(50,4);
        return temp;
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained())
        {
            car.drive();
        }
        if(car.distanceDriven>=distance)
        return true;
        
        return false;
    }
}
