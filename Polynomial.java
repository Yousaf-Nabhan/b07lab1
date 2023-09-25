public class Polynomial
{
    double coef[];
    public Polynomial()
    {
        coef = new double[]{0};
    }
    public Polynomial(double coef[])
    {
        this.coef = coef;
    }
    public Polynomial add(Polynomial new_polynomial)
    {
        int oldl = this.coef.length;
        int newl = (new_polynomial.coef).length;
        int big = Math.max(oldl, newl);
        double new_coef[] = new double[big];
        for(int i = 0; i < big; i++)
        {
            double a = (i < oldl)? this.coef[i] : 0;
            double b = (i < newl)? new_polynomial.coef[i] : 0;
            new_coef[i] = a + b;
        }
        Polynomial result = new Polynomial(new_coef);
        return result;
    }
    public double evaluate(double value)
    {
        int len = coef.length;
        double sum = 0;
        for(int i = 0; i < len; i++)
        {
            double part = this.coef[i] * Math.pow(value, i);
            sum = sum + part;
        }
        return sum;
    }
    public boolean hasRoot(double value)
    {
        if(evaluate(value) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
