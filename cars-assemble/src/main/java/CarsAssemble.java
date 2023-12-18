public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsProduced=speed * 221;
        if(speed >=1 && speed <=4)
        return carsProduced;
        if(speed>=5 && speed<=8)
        return carsProduced*.9;
        if(speed==9)
        return carsProduced*.8;
        if(speed==10)
        return carsProduced*.77; 
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
     double productionRatePerMinute=productionRatePerHour(speed)/60;
     int roundProductionRatePerMinute=(int)productionRatePerMinute;
     return roundProductionRatePerMinute;   
    }
}
