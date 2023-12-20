import java.util.*;

class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;
    private PythagoreanTriplet() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public PythagoreanTriplet(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
    if (obj instanceof PythagoreanTriplet other)
        return this.hashCode() == other.hashCode();
        return false;
    }      
    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTriplet().createBuilder();
    }

    private PythagoreanTripletBuilder createBuilder() {
        return new PythagoreanTripletBuilder();
    }
    public class PythagoreanTripletBuilder {
        private int  sum;
        private int maxFactor;
        PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum=sum;
            return this;
        }

        PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor=maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> Triplets=new ArrayList<>();
            if(maxFactor==0)
                maxFactor=sum/2;
            int start=(int)Math.sqrt(sum);
            for (int a=start;a<=maxFactor;a++)
            {
                for(int b=a;b<=maxFactor;b++)
                {
                    double c=Math.sqrt(a*a + b*b);
                    if(c%1==0&&c<=maxFactor&&a+b+c==sum)
                    Triplets.add(new PythagoreanTriplet(a, b,(int) c));
                }
            }
            return Triplets;
        }
        
    }  
}

